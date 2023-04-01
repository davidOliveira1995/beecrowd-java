package br.com.beecrowd.iniciante;

// 1011
import java.util.Scanner;
public class Esfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
        double raio, pi, volume;

        raio = scan.nextDouble();
        pi = 3.14159;

        volume = (4/3.0) * (pi * Math.pow(raio,3));

        System.out.printf("VOLUME = %.3f", volume);
    }
}
