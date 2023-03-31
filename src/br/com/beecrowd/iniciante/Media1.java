package br.com.beecrowd.iniciante;
// 1005
import java.util.Scanner;
public class Media1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();

        double media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f", media);
    }
}
