package Exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String texto = receba.nextLine();

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertida);

        receba.close();
    }
}