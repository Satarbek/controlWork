package Task3;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Action {

    public static void ChooseAction(List<Cat> cats){
        System.out.print("Please, enter num of action which you want to do: ");
        System.out.println("1 - To feed   |   2 - To play   |   3 - To the vet   |   4 - To add new cat");
        Scanner scanner = new Scanner(System.in);
        int numAct = scanner.nextInt();
        switch (numAct){
            case 1:
                System.out.println("Choose the cat, enter cat's number: ");
                int catNum = scanner.nextInt();
                cats.sort(Comparator.comparing(Cat::getAverageLifeLevel).reversed());
                System.out.printf("You fed the cat %s\n", cats.get(catNum - 1).getName());
                break;
            case 2:
                System.out.println("Choose the cat, enter cat's number: ");
                int catNum2 = scanner.nextInt();
                cats.sort(Comparator.comparing(Cat::getAverageLifeLevel).reversed());
                System.out.printf("You played the cat %s\n", cats.get(catNum2 - 1).getName());
                break;
            case 3:
                System.out.println("Choose the cat, enter cat's number: ");
                int catNum3 = scanner.nextInt();
                cats.sort(Comparator.comparing(Cat::getAverageLifeLevel).reversed());
                System.out.printf("You took the cat %s to the veterinarian\n", cats.get(catNum3 - 1).getName());
                break;
            case 4:
                System.out.print("Enter cat's name for add in table: ");
                Scanner scr = new Scanner(System.in);
                String name = scr.nextLine();
                System.out.print("Enter cat's age for add in table: ");
                int age = scr.nextInt();
                cats.add(new Cat(name,age));
                Main.printLine(cats);
                break;
            default:
                ChooseAction(cats);
        }
    }
}
