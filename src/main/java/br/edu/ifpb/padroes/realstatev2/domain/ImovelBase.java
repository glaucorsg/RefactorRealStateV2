package br.edu.ifpb.padroes.realstatev2.domain;


import java.math.BigDecimal;

abstract class ImovelBase implements Property{
    public Long id;
    public BigDecimal price;
    public String address;
    public String builder;

    public ImovelBase(BigDecimal price, String address, String builder){
        this.id = id;
        this.price = price;
        this.address = address;
        this.builder = builder;
    }

    public ImovelBase() {

    }


    @Override
    public BigDecimal getPrice(){
        return price;
    }
}
