import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String input = scanner.nextLine();

        switch (input.toLowerCase()) {
            case "monday":
                System.out.println("It's Monday.");
                break;
            case "tuesday":
                System.out.println("It's Tuesday");
                break;
            case "wednesday":
                System.out.println("It's Wednesday.");
                break;
            case "thursday":
                System.out.println("It's Thursday");
                break;
            case "friday":
                System.out.println("It's Friday.");
                break;
            default:
                System.out.println("It is Weekend or an invalid day.");
                break;
        }

        scanner.close();
    }
}
