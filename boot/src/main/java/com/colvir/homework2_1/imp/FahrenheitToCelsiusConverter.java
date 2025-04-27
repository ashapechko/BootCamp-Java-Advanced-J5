package com.colvir.homework2_1.imp;

import com.colvir.homework2_1.TemperatureConverter;
import org.springframework.stereotype.Component;

@Component
public class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double value) {
        return (value - 32)/1.8;
    }
}
