import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = scanner.nextInt();

        if (guests % 2 == 1 && guests > 1) {
            System.out.println(guests);
        } else {
            System.out.println(guests / 2);

        }
    }
}