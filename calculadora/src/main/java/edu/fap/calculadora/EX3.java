package edu.fap.calculadora;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int positivos = 0;
        int negativos = 0;

        do {
            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

        } while (numero != 0);

        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);

        sc.close();
    }
}