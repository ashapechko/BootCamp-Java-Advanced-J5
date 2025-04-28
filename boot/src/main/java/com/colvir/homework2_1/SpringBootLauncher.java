package com.colvir.homework2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLauncher {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootLauncher.class, args)) {
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
