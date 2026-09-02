/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fap.encapsulamento;

/**
 * default e private herança nao acessa 
 * dentro da clase um metodo 
 * @author Lab6-
 */
public class Conta {
    
    private double saldo = 0;
    private Cliente cliente;

    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if (saldo - valor >= 0){
        
            saldo -= valor;
        }else {
            System.out.println("Saudo insuficiente. ");
        }
    }
    
    
    public void mostrarSaldo(){
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    
}
