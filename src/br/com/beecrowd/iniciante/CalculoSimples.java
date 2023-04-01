package br.com.beecrowd.iniciante;
// 1010

import java.util.Scanner;
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigo1, codigo2, quantidade1, quantidade2;
        double preco1, preco2, total;

        codigo1 = scan.nextInt();
        quantidade1 = scan.nextInt();
        preco1 = scan.nextDouble();

        codigo2 = scan.nextInt();
        quantidade2 = scan.nextInt();
        preco2 = scan.nextDouble();

        total = (quantidade1 * preco1) + (quantidade2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}
