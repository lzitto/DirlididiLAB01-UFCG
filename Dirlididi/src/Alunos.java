/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA - 121110520
 *
 * Questão 08 - NIGzVIuci - Alunos e Notas
 */

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxScore = 0;
        int minScore = Integer.MAX_VALUE;
        int totalScore = 0;
        int above700 = 0;
        int below700 = 0;
        int numStudents = 0;

        while (true) {
            String line = input.nextLine();
            if (line.equals("-")) {
                break;
            }

            String[] parts = line.split(" ");
            int score = Integer.parseInt(parts[1]);

            if (score > maxScore) {
                maxScore = score;
            }

            if (score < minScore) {
                minScore = score;
            }

            if (score >= 700) {
                above700++;
            } else {
                below700++;
            }

            totalScore += score;
            numStudents++;
        }

        double average = (double) totalScore / numStudents;
        int truncatedAverage = (int) average;

        System.out.println("maior: " + maxScore);
        System.out.println("menor: " + minScore);
        System.out.println("media: " + truncatedAverage);
        System.out.println("acima: " + above700);
        System.out.println("abaixo: " + below700);
    }
}