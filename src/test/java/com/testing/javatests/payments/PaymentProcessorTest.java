package com.testing.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup() {

        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);


    }
    @Test
    public void payment_is_correct() {

        // simulamos el paymentGateway
        //cada ver que ejecutemos nuestra pasarela de pagos paymentGateway para cualquier tipo de datos de pago,
        // simulamos que la pasarela de pagos contesto que si estuvo correcto  "OK"
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        // vamos a crear el pago
        boolean  result = paymentProcessor.makePayment(1000);

        // validamos la respuesta
        assertEquals(true, result);
    }

    @Test
    public void payment_is_wrong() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean result = paymentProcessor.makePayment(1000);

        assertFalse(result);
    }
}