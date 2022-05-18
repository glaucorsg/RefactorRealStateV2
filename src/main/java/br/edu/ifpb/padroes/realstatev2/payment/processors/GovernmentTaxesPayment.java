package br.edu.ifpb.padroes.realstatev2.payment.processors;

import br.edu.ifpb.padroes.realstatev2.domain.Property;
import br.edu.ifpb.padroes.realstatev2.payment.PaymentProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@Service
public class GovernmentTaxesPayment extends PaymentProcessor {
    @Override
    public boolean process(Property property) {
        BigDecimal governmentTaxes = property.getPrice().multiply(BigDecimal.valueOf(0.05));
        log.info(String.format("Pay %f for government taxes", governmentTaxes));
        return checkNext(property);
    }
}
