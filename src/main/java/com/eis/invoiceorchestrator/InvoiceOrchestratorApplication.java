package com.eis.invoiceorchestrator;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@SpringBootApplication
@EnableReactiveFeignClients
public class InvoiceOrchestratorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceOrchestratorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Files.write(Path.of("./invoice.pdf"),pdfService.createPDFInvoice(cfdi));
//
//		System.out.println(xmlService.getXML(cfdi,null));
	}

	@Bean
	public ModelMapper getModelMapper() {

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT)
				.setFieldMatchingEnabled(true)
				.setFieldAccessLevel(Configuration.AccessLevel.PROTECTED);
		return modelMapper;
	}
}
