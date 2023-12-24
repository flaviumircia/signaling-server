package com.syncpeer.offer_exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.simp.user.SimpSubscription;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;

@Component
public class SubscribeListener implements ApplicationListener<SessionSubscribeEvent> {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public SubscribeListener(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @Override
    public void onApplicationEvent(SessionSubscribeEvent event) {
        SimpMessageHeaderAccessor headers = SimpMessageHeaderAccessor.wrap(event.getMessage());

        if (headers.getMessageType() == SimpMessageType.SUBSCRIBE) {
            StompHeaderAccessor accessor = StompHeaderAccessor.wrap(event.getMessage());

            // Retrieve subscription details
            String destination = accessor.getDestination();
            String sessionId = accessor.getSessionId();

            // Handle the subscription details as needed
            System.out.println("Destination: " + destination);
            System.out.println("Session ID: " + sessionId);
        }
    }
}