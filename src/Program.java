import java.util.Scanner;

/**
 * Created by OUT-Akopyan-SR on 24.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);


    }

}
