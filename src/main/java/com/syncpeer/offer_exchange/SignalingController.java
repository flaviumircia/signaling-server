package com.syncpeer.offer_exchange;

import com.syncpeer.offer_exchange.dtos.IceCandidateWrapperDto;
import com.syncpeer.offer_exchange.dtos.SdpOffer;
import com.syncpeer.offer_exchange.services.SendToUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

import static com.syncpeer.offer_exchange.Constants.*;

@Controller
@Slf4j
@RequiredArgsConstructor
public class SignalingController {

    private final SendToUserService sendToUserService;

    @MessageMapping(SEND_OFFER_ENDPOINT + OFFER)
    public void sendOffer(@Payload SdpOffer offer) {
        log.info("message:" + offer.toString());
        sendToUserService.sendSdpToTopic("/topic/offers/" + offer.getDestination(), offer);
    }

    @MessageMapping(SEND_OFFER_ENDPOINT + ICE_OFFER)
    public void sendIce(@Payload IceCandidateWrapperDto message) {
        log.info("Ice message: " + message.toString());
        sendToUserService.sendIceToTopic("/topic/iceCandidates/" + message.getDestination(), message);
    }

}
