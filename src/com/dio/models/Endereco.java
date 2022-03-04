package com.dio.models;

public class Endereco {

    private String rua;
    private String complmento;
    private String bairro;

    public Endereco(String rua, String complmento, String bairro) {
        this.rua = rua;
        this.complmento = complmento;
        this.bairro = bairro;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplmento() {
        return complmento;
    }

    public void setComplmento(String complmento) {
        this.complmento = complmento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complmento='" + complmento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
