package app;

import java.util.Scanner;

public class ContadorDeBaloes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Informe a quantidade de balões: ");
        int k = sc.nextInt();

        if (k != 0) {
            while (k > 0) { // Enquanto não for 0: Se valor atual for par ele divide por 2, senão subtrai 1
                if (k % 2 == 0) {
                    k /= 2;
                } else {
                    k--;
                }

                contador++;
            }
        } else {
            System.out.println(0); // Se a quantidade de balões for 0
        }

        System.out.println(contador);

        sc.close();
    }
}
