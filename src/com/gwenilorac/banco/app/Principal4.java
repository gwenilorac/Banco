package com.gwenilorac.banco.app;

import com.gwenilorac.banco.modelo.Banco;
import com.gwenilorac.banco.modelo.Conta;
import com.gwenilorac.banco.modelo.Pessoa;

import java.math.BigDecimal;
import java.util.List;

public class Principal4 {

public static void main(String[] args) {
        Banco banco = new Banco();

        List<Pessoa> titulares = banco.getContas().stream()
                .map(Conta::getTitular)
                .distinct()
                .toList();

                System.out.println(titulares);

        BigDecimal saldoTotal = banco.getContas().stream()
                .map(Conta::getSaldo)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(saldoTotal);

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);

}

}