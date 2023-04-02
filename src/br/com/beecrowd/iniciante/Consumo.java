package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1014
public class Consumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distancia;
        double totalCombustivel, litros;

        distancia = scan.nextInt();
        totalCombustivel = scan.nextDouble();

        litros = distancia / totalCombustivel;

        System.out.printf("%.3f km/l", litros);
    }
}
