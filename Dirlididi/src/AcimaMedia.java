/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA - 121110520
 *
 * Questão 05 - PoFnkEzvk  - Acima da media
 */

import java.util.Scanner;

public class AcimaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        String[] valores = entrada.split(" ");

        int soma = 0;
        for (String valor : valores) {
            soma += Integer.parseInt(valor);
        }
        double media = (double) soma / valores.length;

        boolean primeiro = true;
        for (String valor : valores) {
            if (Integer.parseInt(valor) > media) {
                if (primeiro) {
                    primeiro = false;
                } else {
                    System.out.print(" ");
                }
                System.out.print(valor);
            }
        }
        System.out.println();
    }
}