package com.colvir.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.colvir.homework2")) {
            TemperatureConverter celsiusToFahrenheitConverter = applicationContext.getBean("celsiusToFahrenheitConverter", TemperatureConverter.class);
            TemperatureConverter fahrenheitToCelsiusConverter = applicationContext.getBean("fahrenheitToCelsiusConverter", TemperatureConverter.class);
            TemperatureConverter celsiusToKelvinConverter = applicationContext.getBean("celsiusToKelvinConverter", TemperatureConverter.class);
            TemperatureConverter kelvinToCelsiusConverter = applicationContext.getBean("kelvinToCelsiusConverter", TemperatureConverter.class);
            System.out.println(celsiusToFahrenheitConverter.convert(100));
            System.out.println(fahrenheitToCelsiusConverter.convert(212));
            System.out.println(celsiusToKelvinConverter.convert(100));
            System.out.println(kelvinToCelsiusConverter.convert(373.15));
        }
    }
}
