package Exercicio4;

import java.util.Scanner;

public class Numero {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
            double numero = 0;

            System.out.println("Digite um número: ");
            numero = s.nextDouble();

            if (numero <= 100){
                System.out.println("O número está compreendido entre 0 e 100");
            }
            else {
                System.out.println("O número NÃO está compreendido entre 0 e 100");
            }

    }
}
