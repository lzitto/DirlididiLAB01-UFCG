import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA  - 121110520
 *
 * Questão 01 - QCT9g3lJ2 - dobro
 */

public class Dobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int dobro = x * 2;
        int triplo = x * 3;
        System.out.println("dobro: " + dobro + ", triplo: " + triplo);
    }
}
