package com.syncpeer.offer_exchange.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class IceCandidateWrapperDto {
    private String source;
    private String destination;
    private IceDto iceCandidate;

    @Override
    public String toString() {
        return "IceCandidateWrapperDto{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", iceDto=" + iceCandidate +
                '}';
    }
}