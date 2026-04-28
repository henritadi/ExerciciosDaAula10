package Exercicio01;

import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        System.out.println("Digite uma frase para ver comprimento:");
        String ler = receba.nextLine();
        System.out.println("O comprimento da string texto é: " + ler.length());
        receba.close();
        
    }
}
