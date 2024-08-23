package org.example.Exercicio6;

import org.example.Exercicio3.Empregado;

public class Vendendor extends Empregado {
    private double valorVendas;
    private double comissao;
    public Vendendor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas,double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }
    public double calcularComissão(){
        return valorVendas*(comissao/100);
    }

    @Override
    public double calcularSalario() {
        setSalarioBase(getSalarioBase()+calcularComissão());
        return super.calcularSalario();
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }
}
