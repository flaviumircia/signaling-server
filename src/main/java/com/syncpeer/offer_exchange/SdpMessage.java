package com.syncpeer.offer_exchange;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SdpMessage {
    private Long id;
    private String sdpContent;
    private String type;

    @Override
    public String toString() {
        return "SdpMessage{" +
                "id=" + id +
                ", sdpContent='" + sdpContent + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}