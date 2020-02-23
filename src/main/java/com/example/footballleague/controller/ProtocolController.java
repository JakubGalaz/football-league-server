package com.example.footballleague.controller;


import com.example.footballleague.model.Protocol;
import com.example.footballleague.service.ProtocolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class ProtocolController {
    private final ProtocolService protocolService;


    public ProtocolController(ProtocolService protocolService) {
        this.protocolService = protocolService;
    }

    @PostMapping("/saveProtocol")
    public ResponseEntity create(@RequestBody Protocol protocol)
    {
        return ResponseEntity.ok(protocolService.save(protocol));

    }


    @GetMapping("/protocols")
    public List<Protocol> protocolList()
    {
        return protocolService.protocolList();
    }


    @RequestMapping(value = "/showProtocolById/{id}", method = RequestMethod.GET)
    public Optional<Protocol> showPlayer(@PathVariable("id") String id){
        return protocolService.findFirstById(id);
    }





}
