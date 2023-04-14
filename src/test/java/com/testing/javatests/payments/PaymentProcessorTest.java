package com.testing.javatests.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct() {

        // simulamos el paymentGateway
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        //cada ver que ejecutemos nuestra pasarela de pagos paymentGateway para cualquier tipo de datos de pago,
        // simulamos que la pasarela de pagos contesto que si estuvo correcto  "OK"
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        // vamos a crear el pago
        assertEquals(true, paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_not_correct() {

        PaymentGateway paymentGateway = Mockito.mock((PaymentGateway.class));
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        assertFalse(paymentProcessor.makePayment(1000));
    }
}