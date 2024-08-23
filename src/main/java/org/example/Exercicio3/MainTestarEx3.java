package org.example.Exercicio3;

public class MainTestarEx3 {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Gerson","rua 123","(70)970707070", 11,3000,10);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: "+ empregado.getTelefone());
        System.out.println("Valor do salario: "+empregado.getSalarioBase());
        System.out.println("Porcentagem do imposto: "+empregado.getImposto());
        System.out.println(empregado.calcularSalario());
    }
}
