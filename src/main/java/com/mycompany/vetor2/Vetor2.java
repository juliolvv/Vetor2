package com.mycompany.vetor2;
import java.util.Scanner;

public class Vetor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[15];
        
        for(int i = 0; i < 15; i++) {
            System.out.println("Digite um número: ");
            num[i]= Integer.parseInt(sc.nextLine());   
        }   
    }
}
