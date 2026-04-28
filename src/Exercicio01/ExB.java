package Exercicio01;

import java.util.Scanner;

public class ExB {

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
       
        String ler = receba.nextLine(); 
        
        
        System.out.println(ler.toUpperCase());
     
        
        receba.close(); 
    }
}