package com.testing.javatests.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {

        // para generar una respues se tiene que ejecutar primero el metodo PaymentReques que es el encargado de capturar el valor
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));

        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
