package com.colvir.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.colvir.homework2")) {
            TemperatureConverter celsiusToFahrenheitConverter = (TemperatureConverter) applicationContext.getBean("celsiusToFahrenheitConverter");
            TemperatureConverter fahrenheitToCelsiusConverter = (TemperatureConverter) applicationContext.getBean("fahrenheitToCelsiusConverter");
            TemperatureConverter celsiusToKelvinConverter = (TemperatureConverter) applicationContext.getBean("celsiusToKelvinConverter");
            TemperatureConverter kelvinToCelsiusConverter = (TemperatureConverter) applicationContext.getBean("kelvinToCelsiusConverter");
            System.out.println(celsiusToFahrenheitConverter.convert(100));
            System.out.println(fahrenheitToCelsiusConverter.convert(212));
            System.out.println(celsiusToKelvinConverter.convert(100));
            System.out.println(kelvinToCelsiusConverter.convert(373.15));
        }
    }
}
