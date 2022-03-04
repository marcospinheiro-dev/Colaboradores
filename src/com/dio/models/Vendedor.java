package com.dio.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        // Cálculo da lógica de acordo com a solicitação do cliente
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100);

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';
    }


}
