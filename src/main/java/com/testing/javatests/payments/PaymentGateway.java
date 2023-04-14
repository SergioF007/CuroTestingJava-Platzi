package com.testing.javatests.payments;

public interface PaymentGateway {

    // toma un objeto de tipo PaymentRequest y devuelve un objeto de tipo PaymentResponse
    PaymentResponse requestPayment(PaymentRequest request);

}
