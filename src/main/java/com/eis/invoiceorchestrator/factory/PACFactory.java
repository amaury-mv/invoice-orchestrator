package com.eis.invoiceorchestrator.factory;

import com.eis.invoiceorchestrator.utilities.Constants;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@AllArgsConstructor
@Slf4j
public class PACFactory {

    private final BeanFactory beanFactory;
    private final List<String> pacsList = List.of(Constants.EMITE_SERVICE, Constants.ADVANS_SERVICE);
    private final Random random = new Random();

    public  <T> T getPACByPriority(Class<T> clazz) {

        String pacSelected = getRandomPAC();
        log.info("PAC Selected {}", pacSelected);
        return beanFactory.getBean(pacSelected, clazz);
    }

    private String getRandomPAC(){

        return pacsList.get(random.nextInt(pacsList.size()));

    }

}
