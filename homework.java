//Задача №1
public class Main {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
//Задача №2
    public class Main {
        public static void main(String[] args) {
            checkSumSign();
        }

        public static void checkSumSign() {
            int a = 5;
            int b = 3;
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }
    }
 //Задача №3
public class Main {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 111; 

        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
 //Задача №4
public class Main {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 10; 
        int b = 5; 

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
