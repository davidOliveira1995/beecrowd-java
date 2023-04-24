package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota, cem, cinquenta, vinte, dez, cinco, dois, um;

        nota = scan.nextInt();

        System.out.println(nota);

        cem = nota / 100;
        nota = nota - (cem * 100);
        System.out.println(cem + " nota(s) de R$ 100,00");

        cinquenta = nota / 50;
        nota = nota - (cinquenta * 50);
        System.out.println(cinquenta + " nota(s) de R$ 50,00");

        vinte = nota / 20;
        nota = nota - (vinte * 20);
        System.out.println(vinte + " nota(s) de R$ 20,00");

        dez = nota / 10;
        nota = nota - (dez * 10);
        System.out.println(dez + " nota(s) de R$ 10,00");

        cinco = nota / 5;
        nota = nota - (cinco * 5);
        System.out.println(cinco + " nota(s) de R$ 5,00");

        dois = nota / 2;
        nota = nota - (dois - 2);
        System.out.println(dois + " nota(s) de R$ 2,00");

        um = nota / 1;
        nota = nota - (um - 1);
        System.out.println(nota + " nota(s) de R$ 1,00");
    }
}
