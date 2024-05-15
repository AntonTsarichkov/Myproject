import java.util.Scanner;
public class Colours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перший колір (червоний, синій або зелений): ");
        String колір1 = scanner.nextLine();

        System.out.print("Введіть другий колір (червоний, синій або зелений): ");
        String колір2 = scanner.nextLine();

        String змішанийКолір = змішатиКольори(колір1, колір2);

        if (змішанийКолір != null) {
            System.out.println("Змішаний колір: " + змішанийКолір);
        } else {
            System.out.println("Невідомий колір. Будь ласка, введіть один з трьох кольорів: червоний, синій або зелений.");
        }
    }

    private static String змішатиКольори(String колір1, String колір2) {
        if (колір1.equalsIgnoreCase("червоний") && колір2.equalsIgnoreCase("червоний")) {
            return "червоний";
        } else if (колір1.equalsIgnoreCase("червоний") && колір2.equalsIgnoreCase("синій")) {
            return "фіолетовий";
        } else if (колір1.equalsIgnoreCase("червоний") && колір2.equalsIgnoreCase("зелений")) {
            return "жовтий";
        } else if (колір1.equalsIgnoreCase("синій") && колір2.equalsIgnoreCase("синій")) {
            return "синій";
        } else if (колір1.equalsIgnoreCase("синій") && колір2.equalsIgnoreCase("зелений")) {
            return "бірюзовий";
        } else if (колір1.equalsIgnoreCase("зелений") && колір2.equalsIgnoreCase("зелений")) {
            return "зелений";
        } else {
            return null;
        }
    }
}