package Exercicio2;

import java.util.Scanner;

public class Oleo {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double altura;
        double raio;
        double pi = 3.141559;
        double volume;

        System.out.println("Informe a altura da lata de óleo: ");
        altura = s.nextDouble();

        System.out.println("Informe o valor do raio da lata de óleo: ");
        raio = s.nextDouble();

            volume = (raio * raio) * pi* altura;

        System.out.println("O valor do volume da lata é: " +volume);
    }
}
