package com.colvir.homework3;

import com.colvir.homework3.service.PrototypeProxyService;
import com.colvir.homework3.service.PrototypeService;
import com.colvir.homework3.service.SingletonService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context =
                     new AnnotationConfigApplicationContext("com.colvir.homework3")) {
            SingletonService singletonService = context.getBean(SingletonService.class);
            // Prototype in Singleton
            PrototypeService prototypeService = singletonService.getPrototypeService();
            PrototypeService prototypeService2 = singletonService.getPrototypeService();
            System.out.println(prototypeService.getId().equals(prototypeService2.getId()));
            // Scoped Proxy
            PrototypeProxyService prototypeProxyService = singletonService.getPrototypeProxyService();
            PrototypeProxyService prototypeProxyService2 = singletonService.getPrototypeProxyService();
            System.out.println(prototypeProxyService.getId().equals(prototypeProxyService2.getId()));
            // ObjectFactory Interface
            PrototypeService prototypeFactoryService = singletonService.getPrototypeServiceInstance();
            PrototypeService prototypeFactoryService2 = singletonService.getPrototypeServiceInstance();
            System.out.println(prototypeFactoryService.getId().equals(prototypeFactoryService2.getId()));
            // @Lookup annotation
            PrototypeService prototypeLookupService = singletonService.getPrototypeServiceLookup();
            PrototypeService prototypeLookupService2 = singletonService.getPrototypeServiceLookup();
            System.out.println(prototypeLookupService.getId().equals(prototypeLookupService2.getId()));
        }
    }
}
