package Exercicio01;

import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String ler = receba.nextLine();
        
        int Vogais = 0;
        String frase = ler.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                Vogais++;
            }
        }
        
        System.out.println("Número de vogais: " + Vogais);
        receba.close();
    }
}
