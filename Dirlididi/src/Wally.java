/**
 * Laboratório de Programação 2 2023.1 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA - 121110520
 * <p>
 * Questão 05 - SlfR6pBmC - Wally
 */

import java.util.Scanner;

public class Wally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("wally")) {
                break;
            }

            String[] nomes = line.split(" ");
            String possibleName = "?";

            for (String nome : nomes) {
                if (nome.length() == 5) {
                    possibleName = nome;
                }
            }

            System.out.println(possibleName);
        }

        scanner.close();
    }
}
