/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class ContaCorrente {
    private float saldo;
    
    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void definirSaldoInicial(float valor){
        saldo = valor;
    }
    
    public void depositar(float valor){
        saldo += valor;
    }
    
    public boolean sacar(float valor){
        if (valor > saldo){
            
            return false;
        }else{
            
            saldo -= valor;
            return true;
        }  
        
    }
} 

