package com.colvir.homework2.imp;

import com.colvir.homework2.TemperatureConverter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class KelvinToCelsiusConverter implements TemperatureConverter {
    @Override
    public double convert(double value) {
        return value - 273.15;
    }
}
