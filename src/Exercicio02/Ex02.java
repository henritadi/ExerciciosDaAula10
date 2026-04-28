package Exercicio02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();
        
        String invertida = new StringBuilder(original).reverse().toString();
        
        if (original.equals(invertida)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        
        scanner.close();
    }
}
