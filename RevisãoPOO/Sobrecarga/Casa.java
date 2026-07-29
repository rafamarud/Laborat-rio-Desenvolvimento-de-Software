/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author laboratorio
 */
public class Casa {
    private int tamanho;

  
    public float calcularPreco(int tamanho){
        return tamanho * 2000f;
        
    }
    
    public float calcularPreco(int tamanho, int quartos){
        return (tamanho * 2000f) + quartos * 100f;
        
    }
    
    
    
    
}
