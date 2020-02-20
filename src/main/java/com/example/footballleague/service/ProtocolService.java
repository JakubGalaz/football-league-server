package com.example.footballleague.service;


import com.example.footballleague.model.Protocol;

import java.util.List;

public interface ProtocolService {
    Protocol save(Protocol protocol);
    List<Protocol> protocolList();
}
