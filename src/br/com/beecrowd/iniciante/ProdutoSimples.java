package br.com.beecrowd.iniciante;

import java.util.Scanner;

// 1004
public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        int prod = A * B;

        System.out.println("PROD = " + prod);
    }
}
