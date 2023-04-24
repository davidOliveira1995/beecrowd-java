package br.com.beecrowd.iniciante;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tempo, hora, minuto, segundo = 0;

        tempo = scan.nextInt();

        hora = tempo / 3600;
        tempo = tempo % 3600;

        minuto = tempo / 60;
        tempo = tempo % 60;

        segundo = tempo;


        System.out.println(hora + ":" + minuto + ":" + segundo);

    }
}
