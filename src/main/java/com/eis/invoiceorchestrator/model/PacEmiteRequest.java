package com.eis.invoiceorchestrator.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PacEmiteRequest {

    private String xml;

}
