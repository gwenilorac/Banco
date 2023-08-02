package com.gwenilorac.banco.app;

import com.gwenilorac.banco.modelo.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Principal2 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João da Silva", "12312312311");
        Pessoa pessoa2 = new Pessoa("Maria das Couves", "22222222211");

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        Pessoa pessoa4 = new Pessoa("João da Silva", "12312312311");

        boolean existe = pessoas.contains(pessoa4);
        System.out.println(existe);

    }

}
