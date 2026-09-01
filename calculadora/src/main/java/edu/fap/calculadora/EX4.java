package edu.fap.calculadora;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");
        double quilometros = sc.nextDouble();

        ConversorDistancia conversor = new ConversorDistancia();

        double metros = conversor.converterParaMetros(quilometros);

        System.out.println("Distância em metros: " + metros + " m");

        sc.close();
    }
}
