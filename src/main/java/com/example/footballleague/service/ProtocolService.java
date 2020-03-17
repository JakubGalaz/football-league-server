package com.example.footballleague.service;


import com.example.footballleague.model.Protocol;

import java.util.List;
import java.util.Optional;

public interface ProtocolService {
    Protocol save(Protocol protocol);
    List<Protocol> protocolList();

    Optional<Protocol> findFirstById(String id);

    void deleteProtocolById(String id);
}
