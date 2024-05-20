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
 //Задача №5
public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        
        boolean result = checkSumInRange(num1, num2);
        System.out.println(result);
    }
    
    public static boolean checkSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }
}
     //Задача №6
public class Main {
    public static void main(String[] args) {
        int number = -5;
        printNumberType(number);
    }
    
    public static void printNumberType(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
     //Задача №7
public class Main {
    public static void main(String[] args) {
        int number = -5;
        boolean isNegative = isNegativeNumber(number);
        System.out.println(isNegative);
    }
    
    public static boolean isNegativeNumber(int number) {
        return number < 0;
    }
}
         //Задача №8
public class Main {
    public static void main(String[] args) {
        printStringMultipleTimes("Hello, World!", 3);
    }
    
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
         //Задача №9
public class Main {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = isLeapYear(year);
        
        if (isLeapYear) {
            System.out.println(year + " Высокосный год.");
        } else {
            System.out.println(year + " Не высокосный год.");
        }
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
         //Задача №10
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
         //Задача №11
    public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
             //Задача №12
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
             //Задача №13
    public class Main {
    public static void main(String[] args) {
        int n = 5; 
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
                 //Задача №14
public class Main {
    public static void main(String[] args) {
        int len = 10; 
        int initialValue = 42; 

        int[] resultArray = createArray(len, initialValue);

        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
