package org.example.Exercicio6;

import org.example.Exercicio5.Operario;

public class MainTestarEx6 {
    public static void main(String[] args) {
        Vendendor vendendor = new Vendendor("Gerson","rua 123","(70)970707070", 11,3000,10,1500,10);
        System.out.println("Nome: " + vendendor.getNome());
        System.out.println("Endereço: " + vendendor.getEndereco());
        System.out.println("Telefone: "+ vendendor.getTelefone());
        System.out.println("Codigo do setor: "+ vendendor.getCodigoSetor());
        System.out.println("Valor do salario: "+vendendor.getSalarioBase());
        System.out.println("Porcentagem do imposto: "+vendendor.getImposto());
        System.out.println("Valor das vendas total: "+ vendendor.getValorVendas());
        System.out.println("Porcentagem da comissão: "+vendendor.getComissao());
        System.out.println(vendendor.calcularSalario());
    }
}
