/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstrataseInterface;

/**
 *
 * @author laboratorio
 */
abstract class Animal {
    public String nome;
    
    public void exibirDados(){
        System.out.println("Nome do animal: "+nome);
        
    }
    
    abstract void emitirSom(); // metodo abstrato que vai ser obrigado a ser implementado pelas classes concretas
        
    
}
