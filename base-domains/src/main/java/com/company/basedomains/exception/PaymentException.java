package com.company.basedomains.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PaymentException extends BookingTravelException {

    public PaymentException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("Payment not able to be processed due to %s has not been booked yet for reservation %s : %s", resourceName, fieldName, fieldValue), resourceName, fieldName, fieldValue);
    }
}
