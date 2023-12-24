package com.syncpeer.offer_exchange;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.syncpeer.offer_exchange.services.SubscribeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SignalingController{
    private static final Logger logger = LoggerFactory.getLogger(SignalingController.class);

    private final SubscribeService subscribeService;
    private final ObjectMapper objectMapper;

    @Autowired
    public SignalingController(SubscribeService subscribeService, ObjectMapper objectMapper) {
        this.subscribeService = subscribeService;
        this.objectMapper = objectMapper;
    }

    @MessageMapping("/offer/sendOffer")
    @SendTo("/topic/offers")
    public String sendOffer(@Payload SdpMessage message) throws Exception {
        logger.info("message:"+message.toString());

        return objectMapper.writeValueAsString(message);
    }
    @MessageMapping("/receive/sendAnswer")
    @SendTo("/topic/answers")
    public String sendAnswer(@Payload SdpMessage message) throws Exception {
        logger.info("message:"+message.toString());
        return objectMapper.writeValueAsString(message);
    }
    @MessageExceptionHandler
    @SendTo("/topic/errors")
    public String handleException(Throwable exception) {
        return exception.getMessage();
    }
}
