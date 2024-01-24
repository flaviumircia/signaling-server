package com.syncpeer.offer_exchange.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Getter
@Setter
public class IceDto {
    private String adapterType;
    private String sdp;
    private String sdpMLineIndex;
    private String sdpMid;
    private String serverUrl;
    @Override
    public String toString() {
        return "IceDto{" +
                "adapterType='" + adapterType + '\'' +
                ", sdp='" + sdp + '\'' +
                ", sdpMLineIndex='" + sdpMLineIndex + '\'' +
                ", sdpMid='" + sdpMid + '\'' +
                ", serverUrl='" + serverUrl + '\'' +
                '}';
    }
}
