package org.example.Exercicio4;

import org.example.Exercicio3.Empregado;

public class Administrador extends Empregado {
    private double ajudaDeCusto;
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        super.setSalarioBase(getSalarioBase()+ajudaDeCusto);
        return super.calcularSalario();
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
}
