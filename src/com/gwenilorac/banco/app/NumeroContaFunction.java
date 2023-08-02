package com.gwenilorac.banco.app;

import com.gwenilorac.banco.modelo.Conta;

import java.util.function.ToIntFunction;

public class NumeroContaFunction implements ToIntFunction<Conta> {

    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero();
    }

}
