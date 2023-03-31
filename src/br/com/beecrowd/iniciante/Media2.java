package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1006
public class Media2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A, B, C, media;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        media = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f", media);
    }
}
