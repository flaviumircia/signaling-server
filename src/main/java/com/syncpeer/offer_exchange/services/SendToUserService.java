package com.syncpeer.offer_exchange.services;

import com.syncpeer.offer_exchange.dtos.IceCandidateWrapperDto;
import com.syncpeer.offer_exchange.dtos.SdpOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendToUserService {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public SendToUserService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }


    public void sendSdpToTopic(String topic, SdpOffer message){
        messagingTemplate.convertAndSend(topic,message);
    }
    public void sendIceToTopic(String topic, IceCandidateWrapperDto message){
        messagingTemplate.convertAndSend(topic,message);
    }
}
