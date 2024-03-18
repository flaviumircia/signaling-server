## Details

This is a websocket component that facilitates the initial handshake communication between two or more peers.

It uses WebSockets and internal message queues to store the Session Description Protocol (SDP) Object (which is responsable for storing various media informations, such as code or framerate) of the initial handshake and also the ICE candidate Object (which is responsable for negotiation in terms of networking, such as the ip, byte rate [S] etc).

It is built using Spring (with websocket addon).

The simplified architectural schema would be this:

<img src ="https://github.com/flaviumircia/signaling-server/assets/74871618/8d0e098e-7aed-4eaa-a970-05d00dfa5d1d" alt = "schema_signaling_server" height="400px"/>

## Status - In development
