package com.colvir.homework3.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    private PrototypeService prototypeService;
    private PrototypeProxyService prototypeProxyService;
    private ObjectFactory<PrototypeService> prototypeServiceFactory;

    public SingletonService(PrototypeService prototypeService, PrototypeProxyService prototypeProxyService, ObjectFactory<PrototypeService> prototypeServiceFactory) {
        this.prototypeService = prototypeService;
        this.prototypeProxyService = prototypeProxyService;
        this.prototypeServiceFactory = prototypeServiceFactory;
    }

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
