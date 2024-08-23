package org.example.Exercicio2;

import org.example.exercicio1.Pessoa;

public class MainParaTestarEx2 {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Gerson","rua 123","(70)970707070",250,100);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: "+ fornecedor.getTelefone());
        System.out.println("Valor do Credito: "+fornecedor.getValorCredito());
        System.out.println("Valor da Divida: "+fornecedor.getValorDivida());
        fornecedor.obterSaldo();
    }
}
