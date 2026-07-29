/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class ProjetoConta {

    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente(0);
        novaConta.definirSaldoInicial(1000);
        if(novaConta.sacar(500)){
            System.out.println("Saque efetuado");
            System.out.println("Saldo: "+novaConta.getSaldo());
        }
        else{
            System.out.println("Saque não efetuado");
        }
        novaConta.depositar(50);
        System.out.println("Saldo: "+novaConta.getSaldo());
        
        if(novaConta.sacar(500)){
            System.out.println("Saque efetuado");
            System.out.println("Saldo: "+novaConta.getSaldo());
        }
        else{
              System.out.println("Saque não efetuado"); 
        }
       if(novaConta.sacar(50)){
        System.out.println("Saldo: "+novaConta.getSaldo());
        }
        else{
              System.out.println("Saque não efetuado"); 
        }
        
        if(novaConta.sacar(600)){
        System.out.println("Saldo: "+novaConta.getSaldo());
        }
        else{
              System.out.println("Saque não efetuado"); 
        }
    }
}
