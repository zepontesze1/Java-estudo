/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fap.controledeestoque;

/**
 *
 * @author Lab6-
 */
public class Estoque {
    private int qtdProduto = 0;
    
    public Estoque(int qtdProduto){
        if (qtdProduto >= 0){
            this.qtdProduto = qtdProduto;
        }else{
            System.out.println("Nao aceitamos estoque negativo");
        }
        
    }
    
    public void comprar(){
    
    }
    
}
