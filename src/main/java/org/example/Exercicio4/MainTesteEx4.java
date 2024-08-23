package org.example.Exercicio4;

import org.example.Exercicio3.Empregado;

public class MainTesteEx4 {
    public static void main(String[] args) {
        Administrador adm = new Administrador("Gerson","rua 123","(70)970707070", 11,3000,10,1500);
        System.out.println("Nome: " + adm.getNome());
        System.out.println("Endereço: " + adm.getEndereco());
        System.out.println("Telefone: "+ adm.getTelefone());
        System.out.println("Codigo do setor: "+ adm.getCodigoSetor());
        System.out.println("Valor do salario: "+adm.getSalarioBase());
        System.out.println("Porcentagem do imposto: "+adm.getImposto());
        System.out.println("Ajuda de custo: "+adm.getAjudaDeCusto());
        System.out.println(adm.calcularSalario());
    }
}
