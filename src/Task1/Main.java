package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {

        CatList();

    }

    public static int number = 0;
    public static void CatList(){
        List<Cat> cat = new ArrayList<>();
        cat.add(new Cat("Barsik", 4));
        cat.add(new Cat("Tarsik", 8));
        cat.add(new Cat("Murzik", 13));
        printLine(cat);
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
        printHeader();
        cats.stream().
                sorted(Comparator.comparing(Cat::getAverageLifeLevel).reversed()).
                forEach(Main::printCatList);
        System.out.println();
    }
}