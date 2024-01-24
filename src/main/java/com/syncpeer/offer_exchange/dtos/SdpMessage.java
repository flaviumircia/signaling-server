package com.syncpeer.offer_exchange.dtos;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SdpMessage {

    private String description;
    private String type;

    @Override
    public String toString() {
        return "SdpMessage{" +
                "description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}