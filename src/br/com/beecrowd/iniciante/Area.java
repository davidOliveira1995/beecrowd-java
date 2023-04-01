package br.com.beecrowd.iniciante;
// 1012

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A, B, C, pi, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        pi = 3.14159;
        areaTriangulo = (A * C) / 2;
        areaCirculo = pi * Math.pow(C, 2);
        areaTrapezio = ((B + A) * C)/ 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        /*
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
         */
    }
}
