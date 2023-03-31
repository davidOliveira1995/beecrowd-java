package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1003
public class SomaSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);
    }
}
