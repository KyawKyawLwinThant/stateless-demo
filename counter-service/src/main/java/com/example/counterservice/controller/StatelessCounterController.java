package com.example.counterservice.controller;

import com.example.counterservice.ds.CounterServiceRequest;
import com.example.counterservice.ds.CounterServiceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter/stateless")
public class StatelessCounterController {

    @GetMapping("/countup")
    public CounterServiceResponse
        countUp(@RequestBody CounterServiceRequest serviceRequest){
        return new CounterServiceResponse(serviceRequest.getNumber() + 1);
    }
}
