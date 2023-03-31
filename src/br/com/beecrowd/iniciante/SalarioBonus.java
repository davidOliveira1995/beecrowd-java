package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1009
public class SalarioBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double salario, totalVendas, total;

        nome = scan.nextLine();
        salario = scan.nextDouble();
        totalVendas = scan.nextDouble();

        total = salario + ((totalVendas / 100) * 15);

        System.out.printf("TOTAL = R$ %.2f", total);
    }
}
