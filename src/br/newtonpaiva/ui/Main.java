package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;

public class Main {

    public static void main(String[] args) {
        Conta c = new Conta(10);
//        c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar(50.0);

        Conta c2 = new Conta(10);
//        c2.setNumero(90);
        c2.setSaldo(500.0);

        Conta c3 = new Conta();

        if(c.equals(c2)){
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(c.getSaldo());
    }
}
