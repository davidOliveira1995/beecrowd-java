package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1008
public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, horasTrabalhadas;
        double salario, valorHora;

        numero = scan.nextInt();
        horasTrabalhadas = scan.nextInt();
        valorHora = scan.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);


    }
}
