import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


public class MavenExercise {
    public static void main(String[] args) {
        System.out.println("Hiiiiiiii");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something ");
        String userInput = scanner.nextLine();
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));

    }
}
