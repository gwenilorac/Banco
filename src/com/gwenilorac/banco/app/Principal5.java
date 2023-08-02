package com.gwenilorac.banco.app;

import com.gwenilorac.banco.modelo.Banco;
import com.gwenilorac.banco.modelo.Conta;

import java.math.BigDecimal;

public class Principal5 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        BigDecimal saldo = banco.buscar(123, 333)
                .map(Conta::getSaldo)
                .orElse(BigDecimal.ZERO);

        System.out.println(saldo);
    }

}