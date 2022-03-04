package com.dio.models.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        // Cálculo da lógica de acordo com a solicitação do cliente
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }

}
