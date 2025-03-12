package rules;

import java.util.Scanner;

public class Answer {
    Scanner scanner = new Scanner(System.in);
    String regex = "^[12]$";

    public boolean getAnswer(String answer) {
        System.out.println(answer);
        System.out.println("1. Да" +
                "\n" +
                "2. Нет");
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            if (Integer.parseInt(input) == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Некорректный ответ.");
            return getAnswer(answer);
        }
    }
}
