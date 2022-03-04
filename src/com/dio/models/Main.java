package com.dio.models;

import com.dio.models.models.Endereco;
import com.dio.models.models.Gerente;
import com.dio.models.models.OperadorCaixa;
import com.dio.models.models.Vendedor;

public class Main {

    public static void main(String[] args) {
//	Endereco endereco = new Endereco();
//    endereco.setRua("Endereço qualquer");
//        System.out.println(endereco.getRua());
        Endereco enderecoVendedor =
                new Endereco("Rua do vendedor", "Complemento do vendedor", "Bairro do vendedor");
        Endereco enderecoOpCaixa =
                new Endereco("Rua do OpCaixa", "Complemento do OpCaixa", "Bairro do OpCaixa");
        Endereco enderecoPJ =
                new Endereco("Rua do funPJ", "Complemento do funcPJ", "Bairro do funcPJ");
        System.out.println("------------------------------------------");
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Marcos Aurélio");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setEndereco(enderecoVendedor);
        vendedor.setValorSalario(1000.0);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("------------------------------------------");
        OperadorCaixa operadorCaixa =
                new OperadorCaixa("lucas Lima", "222.333.444-00", 2000d, enderecoOpCaixa);
        System.out.println(operadorCaixa);
        System.out.println("------------------------------------------");
        Gerente gerente = new Gerente();
        gerente.setNome("Aninha");
        gerente.setDocumento("000.111.999-77");
        gerente.setEndereco(enderecoPJ);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calcularRemuneracao();
        gerente.calculaBonificacao(2d);
        System.out.println(gerente);
        System.out.println("------------------------------------------");

    }
}
