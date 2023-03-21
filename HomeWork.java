import java.io.IOException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        String formatter = "Моему другу %s на данный момент %s лет";

        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        var name = input.nextLine();

        while (true) {
            System.out.println("Введите возраст: ");
            var age = input.nextLine();

            if (checkUserInput(name, age))
                System.out.println(String.format(formatter, name, age));

            System.out.println("Для выхода введите: выход. Для продолжения введите имя: ");
            name = input.next();
            if (name.equals("выход")) {
                break;
            }

            input = new Scanner(System.in);
        }
    }

    private static boolean checkUserInput(String name, String age) {
        try {
            var iAge = Integer.parseInt(age);
            if (name.isEmpty() || iAge < 0) {
                throw new IllegalArgumentException("Проверьте ввод, имя не может быть пустым и возраcт не должен быть меньше 0 лет");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Проверьте ввод, возраст должен быть числом");
        }
        return true;
    }


}
