package Exercicio03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        System.out.println("Digite uma sequência de 0 e 1:");
        String texto = receba.nextLine();

        int contador = 0; 
        int segundocontador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '1') {
                contador++;
            } else if (texto.charAt(i) == '0') {
                segundocontador++;
            }
        }

        System.out.println("Quantidade de 1: " + contador);
        System.out.println("Quantidade de 0: " + segundocontador);

        receba.close();
    }
}
