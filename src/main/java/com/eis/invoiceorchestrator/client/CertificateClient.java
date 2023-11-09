package com.eis.invoiceorchestrator.client;

import com.eis.invoiceorchestrator.model.CertificateData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(value = "certificates-api",url = "https://u8iqveuzd7.execute-api.us-east-1.amazonaws.com/dev/api/v1")
public interface CertificateClient {

    @GetMapping("/certificates")
    Mono<CertificateData> getCertificate(@RequestParam String key);
}
