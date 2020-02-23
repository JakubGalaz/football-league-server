package com.example.footballleague.service.Impl;



import com.example.footballleague.model.Protocol;
import com.example.footballleague.repository.ProtocolRepository;
import com.example.footballleague.service.ProtocolService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProtocoleServiceImpl implements ProtocolService {

    private  final ProtocolRepository protocolRepository;



    public ProtocoleServiceImpl(ProtocolRepository protocolRepository) {
        super();
        this.protocolRepository = protocolRepository;
    }

    @Override
    public Protocol save(Protocol protocol) {
       return protocolRepository.save(protocol);
    }

    @Override
    public List<Protocol> protocolList() {
        return protocolRepository.findAll();
    }

    @Override
    public Optional<Protocol> findFirstById(String id) {
        return protocolRepository.findById(id);
    }
}
