package com.syncpeer.offer_exchange.services;

import com.syncpeer.offer_exchange.Greeting;
import com.syncpeer.offer_exchange.SdpMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public SubscribeService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

}
