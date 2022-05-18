package br.edu.ifpb.padroes.realstatev2.payment.processors;

import br.edu.ifpb.padroes.realstatev2.domain.Property;
import br.edu.ifpb.padroes.realstatev2.payment.PaymentProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PropertyPayment extends PaymentProcessor {
    @Override
    public boolean process(Property property) {
        log.info(String.format("Pay %f for the property taxes", property.getPrice()));
        return checkNext(property);
    }
}
