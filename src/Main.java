import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myNameIs;
        final int NUM = 0;
        String word = "world";
        myNameIs = NUM + word;
        System.out.println(myNameIs);
        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("вы сохранили положительное число");
        } else {
            System.out.println("вы сохранили нулевое число");
        }

        Scanner scan = new Scanner(System.in);
        String name = "Isabek";
        System.out.println("Введите Имя: ");

        if (scan.hasNext(name)) {
            for (int i = 0; i < 1; i++) {
                System.out.println("Привет! " + name);
            }
        }
    }
}
