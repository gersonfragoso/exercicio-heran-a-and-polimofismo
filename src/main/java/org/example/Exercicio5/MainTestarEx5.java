package org.example.Exercicio5;

import org.example.Exercicio4.Administrador;

public class MainTestarEx5 {
    public static void main(String[] args) {
        Operario op = new Operario("Gerson","rua 123","(70)970707070", 11,3000,10,1500,10);
        System.out.println("Nome: " + op.getNome());
        System.out.println("Endereço: " + op.getEndereco());
        System.out.println("Telefone: "+ op.getTelefone());
        System.out.println("Codigo do setor: "+ op.getCodigoSetor());
        System.out.println("Valor do salario: "+op.getSalarioBase());
        System.out.println("Porcentagem do imposto: "+op.getImposto());
        System.out.println("Valor da produção: "+ op.getValorProducao());
        System.out.println("Porcentagem da comissão: "+op.getComissao());
        System.out.println(op.calcularSalario());
    }
}
