package Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static List<Cat> cats = new ArrayList<>();
    public static void main(String[] args) {
        run();
    }


    public static void run() {

        CatList();
        Action.ChooseAction(cats);

    }

    public static int number;
    public static void CatList(){


        cats.add(new Cat("Barsik", 4));
        cats.add(new Cat("Tarsik", 8));
        cats.add(new Cat("Murzik", 13));
        printLine(cats);
    }

    public static void printHeader(){
        System.out.println("+---------+---------+-----+--------+------+---------+------------+");
        System.out.println(String.format("|%8s |%7s  | %3s | %3s | %3s | %3s | %s |", "Number", "Name", "Age", "Health", "Mood", "Satiety", "Life Level"));
        System.out.println("+---------+---------+-----+--------+------+---------+------------+");
    }
    public static void printCatList(Cat cat){
        number ++;
        System.out.println(String.format("|%5s    |%8s | %2s  | %4s   | %3s  | %5s   | %6s     |", number, cat.getName(), cat.getAge(), cat.getHealth(), cat.getMood(), cat.getSatiety(), cat.getAverageLifeLevel()));
        System.out.println("+---------+---------+-----+--------+------+---------+------------+");
    }

    public static void printLine(List<Cat> cats){
        number = 0;
        printHeader();
        cats.stream().
                sorted(Comparator.comparing(Cat::getAverageLifeLevel).reversed()).
                forEach(Main::printCatList);
        System.out.println();
    }
}