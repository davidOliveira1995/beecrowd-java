package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1007
public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        DIFERENCA = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
