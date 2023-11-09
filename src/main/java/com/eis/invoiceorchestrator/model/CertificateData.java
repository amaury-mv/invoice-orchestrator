package com.eis.invoiceorchestrator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class to model data retrieved from certificate API
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CertificateData {

    private String rfc;
    private String password;
    private String base64Cer;
    private String base64Key;
    private String number;
}
