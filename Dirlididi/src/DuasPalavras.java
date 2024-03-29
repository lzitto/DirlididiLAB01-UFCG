/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA - 121110520
 *
 * Dirlididi: Maior e menor de duas palavras - LGRuJsN1c
 */
import java.util.Scanner;


public class DuasPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada1 = sc.nextLine();
        String entrada2 = sc.nextLine();
        String maior = null;
        String menor = null;

        if (entrada1.length() > entrada2.length()){
            maior = entrada1;
            menor = entrada2;
        }
        if(entrada1.length() < entrada2.length()){
            maior = entrada2;
            menor = entrada1;
        }
        if (entrada1.length() == entrada2.length()){
            maior = entrada1;
            menor = entrada1;
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}
