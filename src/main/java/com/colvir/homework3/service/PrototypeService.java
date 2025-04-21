package com.colvir.homework3.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
@Scope(value = "prototype")
public class PrototypeService {

    private final Long id = new Random().nextLong();

    public Long getId() {
        return id;
    }
}
