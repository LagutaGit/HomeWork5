public class Main {
    public static void main(String[] args) {
//       Задача 1

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//        Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

//        Задача 3
        for (int i = 1; i <= 17; i = i + 2) {
            System.out.println(i);
        }

//        Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

//        Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        
//        Задача 6
        for (int i = 7; i <= 98; i = i +7) {
            System.out.println(i);
        }

//        Задача 7
        for (int i = 1; i <= 512 ; i = i * 2) {
            System.out.println(i);
        }

//        Задача 8
        int zanachka = 0;
        for (int i = 1; i <= 12; i++) {
            zanachka = zanachka + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + zanachka);
        }

//        Задача 9
        int bank = 0;
        for (int i = 1; i <= 12; i++) {
            bank = bank + 29000/100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bank);
        }

//        Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}