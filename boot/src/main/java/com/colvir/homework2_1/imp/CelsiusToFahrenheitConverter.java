package com.colvir.homework2_1.imp;

import com.colvir.homework2_1.TemperatureConverter;
import org.springframework.stereotype.Component;

@Component
public class CelsiusToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double value) {
        return value * 1.8 + 32;
    }
}
