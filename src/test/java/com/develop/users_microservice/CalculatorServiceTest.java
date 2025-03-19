package com.develop.users_microservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.develop.users_microservice.application.usecase.CalculatorUseCase;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorUseCase calculatorService = new CalculatorUseCase();

    @Test
    void testSum() {
        int result = calculatorService.sum(2, 3);
        assertEquals(5, result, "La suma de 2 + 3 debe ser 5");
    }
}

