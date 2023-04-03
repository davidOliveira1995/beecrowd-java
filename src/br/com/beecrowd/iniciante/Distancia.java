package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1016
public class Distancia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km, minutos;

        km = scan.nextInt();
        minutos = (60 * km) / 30;
        System.out.println(minutos + " minutos.");
    }
}
