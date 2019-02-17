package Exercicio3;

import java.util.Scanner;

public class Prefeitura {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double salario;
        double prestacao;

        System.out.println("Informe seu salario: " );
        salario = s.nextDouble();
        System.out.println("Informe o valor da parcela do emprestimo: ");
        prestacao = s.nextDouble();

        if (prestacao > salario*30)
        {
            System.out.println("Emprestimo não autorizado!");
        }
        else
            {
                System.out.println("Emprestimo autorizado!");
            }





    }
}
