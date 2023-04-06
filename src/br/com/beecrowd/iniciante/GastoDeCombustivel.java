package br.com.beecrowd.iniciante;
// 1017

import java.util.Scanner;
public class GastoDeCombustivel {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int velocidadeMedia, tempoViagem;
       double consumo;

       tempoViagem = scan.nextInt();
       velocidadeMedia = scan.nextInt();

       consumo = (double) (tempoViagem * velocidadeMedia) / 12;

        System.out.printf("%.3f", consumo);
    }
}
