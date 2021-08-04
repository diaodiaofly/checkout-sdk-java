package com.checkout.payments.beta.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public final class ProcessingSettings {

    private boolean aft;

}