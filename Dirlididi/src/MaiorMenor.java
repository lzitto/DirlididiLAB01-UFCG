import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra1 = sc.next();
        String palavra2 = sc.next();

        if (palavra1.length() == palavra2.length()) {
            System.out.println(palavra1);
            System.out.println(palavra2);
        } else if (palavra1.length() > palavra2.length()) {
            System.out.println(palavra1);
            System.out.println(palavra2);
        } else {
            System.out.println(palavra2);
            System.out.println(palavra1);
        }

        sc.close();
    }
}