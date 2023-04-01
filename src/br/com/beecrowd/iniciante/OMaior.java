package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, maiorAB, abs = 0;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();

        maiorAB = (A + B + Math.abs(A - B)) / 2;
        maiorAB = (C + maiorAB + Math.abs(maiorAB - C)) / 2;
        System.out.println(maiorAB + " eh o maior");
    }
}
