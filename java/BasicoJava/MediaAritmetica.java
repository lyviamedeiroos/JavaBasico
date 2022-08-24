package BasicoJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a sua primeira nota?");
        double nota1= ler.nextDouble();

        System.out.println("Qual a sua segunda nota?");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) /2;

        System.out.println("A sua média é: "+media);
    }
}
