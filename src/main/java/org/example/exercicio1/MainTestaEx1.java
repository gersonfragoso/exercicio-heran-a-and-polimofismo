package org.example.exercicio1;

public class MainTestaEx1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "rua 1234123", "7070707070");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: "+ pessoa.getTelefone());
    }
}
