package com.colvir.homework3.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {
    @Autowired
    private PrototypeService prototypeService;
    @Autowired
    private PrototypeProxyService prototypeProxyService;
    @Autowired
    private ObjectFactory<PrototypeService> prototypeServiceFactory;

    public PrototypeService getPrototypeService() {
        return prototypeService;
    }

    public PrototypeProxyService getPrototypeProxyService() {
        return prototypeProxyService;
    }

    public PrototypeService getPrototypeServiceInstance() {
        return prototypeServiceFactory.getObject();
    }

    @Lookup
    public PrototypeService getPrototypeServiceLookup() {
        return null;
    }
}
