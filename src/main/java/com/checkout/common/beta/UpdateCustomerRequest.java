package com.checkout.common.beta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public final class UpdateCustomerRequest {

    private String id;

    private boolean defaultCustomer;

}
