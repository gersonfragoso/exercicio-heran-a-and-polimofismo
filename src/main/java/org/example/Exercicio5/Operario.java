package org.example.Exercicio5;

import org.example.Exercicio3.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        this.setSalarioBase(getSalarioBase()+calcularComissão());
        return super.calcularSalario();
    }
    public double calcularComissão(){
        return valorProducao*(comissao/100);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }
}
