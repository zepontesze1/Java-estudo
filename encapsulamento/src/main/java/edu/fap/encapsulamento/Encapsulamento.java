/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.fap.encapsulamento;

/**
 * algum objeto   esta null 
 * @author Lab6-
 * 
 * Ao criar um objeto se nao existe ele é null
 * quando cria oas atributos podem estar com 0 se primitivo 
 * ja String esta com null pois String é um objeto 
 * 
 * 
 */
public class Encapsulamento {

   public static void main(String[] args) {
       
       Cliente objClient = new Cliente(123,"DINO DA SILVA SAURO"); 
       
     
       
        System.out.println("Codigo: " + objClient.getCodigo());
        System.out.println("Nome: " +   objClient.getNome());
        
        
        Conta objConta = new Conta();
        objConta.setCliente(objClient);
        
        System.out.println("Nome do cliente: " + objConta.getCliente().getNome());
        
        objConta.depositar(100);
        objConta.sacar(50);
        objConta.mostrarSaldo();
        objConta.sacar(0);
        
       
    }
}
