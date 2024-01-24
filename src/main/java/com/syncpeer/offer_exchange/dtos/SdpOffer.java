package com.syncpeer.offer_exchange.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class SdpOffer {

    private String destination;
    private String source;
    private SdpMessage sdpMessage;

    @Override
    public String toString() {
        return "SdpOffer{" +
                "destination='" + destination + '\'' +
                ", source='" + source + '\'' +
                ", sdpMessage=" + sdpMessage +
                '}';
    }
}
