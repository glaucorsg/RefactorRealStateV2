package br.edu.ifpb.padroes.realstatev2.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class CompositeImoveis extends ImovelBase{
    protected List<Property> imoveis = new ArrayList<>();

    public CompositeImoveis(Property... components) {
        super(BigDecimal.ZERO, "", "");
        add(components);
    }

    public void add(Property component) {
        imoveis.add(component);
    }

    public void add(Property... components) {
        imoveis.addAll(Arrays.asList(components));
    }

    public void remove(Property imovel) {
        imoveis.remove(imovel);
    }

    public void remove(Property... components) {
        imoveis.removeAll(Arrays.asList(components));
    }

    public void clear() {
        imoveis.clear();
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }
}
