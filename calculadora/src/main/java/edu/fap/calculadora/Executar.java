package edu.fap.calculadora;

public class Executar {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double valor1 = 2;
        double valor2 = 2;

        double resultSoma = calculadora.somar(valor1, valor2);
        calculadora.mostrarResultado(resultSoma);

        double resultSubtrair = calculadora.subtrair(valor1, valor2);
        calculadora.mostrarResultado(resultSubtrair);
    }
}