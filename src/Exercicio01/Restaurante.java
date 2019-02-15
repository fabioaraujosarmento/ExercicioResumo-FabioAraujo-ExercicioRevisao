package Exercicio01;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double peso = s.nextDouble();
        double buffet = 3.39;
        double vlr_pg;


        System.out.println("Informe o peso: ");
        peso = s.nextDouble();

        vlr_pg = (peso * buffet) * 1.1;

        System.out.println("Valor pago mais gorgeta: R$" +vlr_pg);

    }
}
