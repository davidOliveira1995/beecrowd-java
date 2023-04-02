package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1015
public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1, x2, y1, y2, resultado;

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        resultado = Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1), 2)));

        System.out.printf("%.4f", resultado);



    }
}
