//Desafio #2

package org.Testes;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int numero, primeiro = 0, segundo = 1, proximo;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        numero = input.nextInt();

        while (primeiro <= numero) {
            if (primeiro == numero) {
                System.out.println(numero + " Pertence à sequência de Fibonacci!");
                return;
            }
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(numero + " Não pertence à sequência de Fibonacci!");
    }
}