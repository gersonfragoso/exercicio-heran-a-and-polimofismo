package org.example.Exercicio3;

import org.example.exercicio1.Pessoa;

    /*
    Exercício 03

    Considere, como subclasse da classe Pessoa, a classe Empregado.
    Considere que cada instância da classe Empregado tem, para
    além dos atributos que caracterizam a classe Pessoa, os atributos
    codigoSetor (inteiro), salarioBase (vencimento base) e imposto
    (porcentagem retida dos impostos). Implemente a classe
    Empregado com métodos seletores e modificadores e um método
    calcularSalario. Escreva um programa de teste adequado para a
    classe Empregado.
     */

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    public Empregado(String nome, String endereco, String telefone,int codigoSetor,double salarioBase,double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }

}
