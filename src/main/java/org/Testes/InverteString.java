//Desafio #5

package org.Testes;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();


        String invertida = inverte(original);


        System.out.printf("String original: %s\n", original);
        System.out.printf("String invertida: %s\n", invertida);
    }

    public static String inverte(String s) {
        char[] array = s.toCharArray();
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        return new String(array);
    }
}
