package com.gwenilorac.banco.app;

import com.gwenilorac.banco.modelo.Banco;
import com.gwenilorac.banco.modelo.Conta;

import java.util.Comparator;

public class Principal3 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.getContas().sort(Comparator.comparingInt(Conta::getNumero));

        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }

}