/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        Casa c1 = new Casa();
        int tamanho1 = 100;
        float preco1 = c1.calcularPreco(tamanho1);
        System.out.println("Preco da casa: "+preco1);
        
        Casa c2 = new Casa();
        int tamanho2 = 100;
        int quartos = 3;
        float preco2 = c2.calcularPreco(tamanho2, quartos);
        System.out.println("Preco da casa: "+preco2);
        
    }   
}
