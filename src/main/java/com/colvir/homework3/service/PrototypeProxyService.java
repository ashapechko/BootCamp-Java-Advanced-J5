package com.colvir.homework3.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeProxyService {

    private final Long id = new Random().nextLong();

    public Long getId() {
        return id;
    }
}

