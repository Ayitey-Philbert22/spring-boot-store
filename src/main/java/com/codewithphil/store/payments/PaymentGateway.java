package com.codewithphil.store.payments;

import com.codewithphil.store.orders.Order;

import java.util.Optional;

public interface PaymentGateway {
        CheckoutSession createCheckoutSession(Order order);


        Optional<PaymentResult>  parseWebhookRequest(WebhookRequest request);
}
