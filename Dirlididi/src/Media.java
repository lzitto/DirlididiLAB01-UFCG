import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA - 121110520
 *
 * Questão 02 - QN9tFkXbc - media
 */

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x,y, media;
        x = sc.nextFloat();
        y = sc.nextFloat();
        media = (x + y) / 2;

        if (media >= 7.0) {
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }
    }
}