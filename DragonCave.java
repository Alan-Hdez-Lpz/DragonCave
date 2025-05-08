import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "You see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2) ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("You approach the cave…\n" +
                    "It is dark and spooky…\n" +
                    "A large dragon jumps out in front of you!\n" +
                    "He opens his jaws and…\n" +
                    "Gobbles you down in one bite!");
        } else if (option == 2) {
            System.out.println("You approach the cave…\n" +
                    "It is so quiet\n" +
                    "A large dragon look at you!\n" +
                    "He is so friendly and…\n" +
                    "He will share his treasure with you.!");
        } else {
            System.out.println("Enter number between 1 and 2");
        }
    }
}
