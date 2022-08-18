import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] arr = generateRandomArray();


    public static void main(String[] args) {
        task15();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        int sumExpense = 0;
        for (int i = 0; i < arr.length; i++) {
            sumExpense += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumExpense + " рублей.");
    }

    public static void task2() {
        int maxExpense = 0;
        int minExpense = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (maxExpense < arr[i]) {
                maxExpense = arr[i];
            }
        }

        for (int b = 0; b < arr.length; b++) {
            if (minExpense > arr[b]) {
                minExpense = arr[b];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. " +
                "Максимальная сумма трат за день составила " + maxExpense + " рублей");
    }

    public static void task3() {
        int sumExpense = 0;

        for (int i = 0; i < arr.length; i++) {
            sumExpense += arr[i];
        }

        double avgExpense = sumExpense / (arr.length * 1.0);

        System.out.println("Средняя сумма трат за месяц составила " + avgExpense + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static void task5() {
        /*Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом
        массиве максимальным и сообщите индекс его последнего вхождения в массив.*/

        java.util.Random random = new java.util.Random();

        int[] nums = new int[12];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(31) - 15;
        }

        int max = -16;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        System.out.println("Максимальное значение " + max);
        System.out.println("Индекс элемента в массиве " + index);
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void task6() {
        /*Создайте массив из 11 случайных чисел из промежутка [0;1].
        Выведите данный массив в консоль. Напишите программу, которая определяет, какой элемент встречается в массиве
        чаще всего. Выведите данную информацию в консоль. Если два разных элемента встречаются одинаковое количество
        раз, то выведите -1.*/

        java.util.Random random = new java.util.Random();

        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int zero = 0;
        int one = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zero++;
            } else {
                one++;
            }
        }

        if (zero > one) {
            System.out.println("0");
        } else if (one > zero) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }

    public static void task7() {
        /*Напишите программу, которая генерирует двумерный массив из 8 строк по 5
        столбцов в каждой из случайных целых чисел из отрезка [10;99]. Результат программы выведите в консоль.*/
        Random rnd = new Random();

        int[][] array = new int[8][5];

        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[i].length; b++) {
                array[i][b] = rnd.nextInt(90) - 10;
            }
        }
        for (int[] Arr : array) {
            System.out.println(Arrays.toString(Arr));
        }
    }

    public static void task8() {

        /*Напишите программу, которая генерирует двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых
        чисел из отрезка [-99;99]. Результат программы выведите в консоль. Отдельно выведите значение максимального
        элемента этого массива.*/

        Random rnd = new Random();

        int[][] array = new int[5][8];

        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[i].length; b++) {
                array[i][b] = rnd.nextInt(199) - 99;
            }
        }

        for (int[] Arr : array) {
            System.out.println(Arrays.toString(Arr));
        }
        int maxNumber = -100;
        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[i].length; b++) {
                if (maxNumber < array[i][b]) {
                    maxNumber = array[i][b];
                }
            }
        }
        System.out.println();
        System.out.println("Максимальное значение равно " + maxNumber);
    }

    public static void task9() {
        /*Напишите программу, которая генерирует массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
        отрезка [-5;5]. Результат программы выведите в консоль. Отдельно выведите индекс строки с наибольшим
        произведением элементов.*/

        Random rnd = new Random();

        int[][] array = new int[7][4];

        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[i].length; b++) {
                array[i][b] = rnd.nextInt(11) - 5;
            }
        }

        for (int[] Arr : array) {
            System.out.println(Arrays.toString(Arr));
        }

        System.out.println();
        int maxNumb = Integer.MIN_VALUE;
        int maxNumbIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int a = 1;
            for (int num : array[i]) {
                a *= num;
            }
            if (a > maxNumb) {
                maxNumb = a;
                maxNumbIndex = i;
            }
        }
        System.out.println("Максимальное произведение в строке № " + maxNumbIndex);
    }

    public static void task10() {
        /*Напишите программу, которая генерирует двумерный массив из 6 строк по 7 столбцов в каждой. Массив должен
        состоять из случайных целых чисел из промежутка [0;9].
        Результат программы выведите в консоль.
        Преобразуйте массив таким образом, чтобы на первом месте (индекс 0) в каждой строке стоял самое большое число в
        строке. Состав массива изменять нельзя, но можно  переставлять элементы в рамках одной строки. Порядок остальных
        элементов строки не важен. Результат преобразований выведите в консоль.*/

        Random rnd = new Random();

        int[][] array = new int[6][7];

        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[i].length; b++) {
                array[i][b] = rnd.nextInt(10);
            }
        }

        for (int[] Arr : array) {
            System.out.println(Arrays.toString(Arr));
        }

        System.out.println();

        for (int[] array1 : array) {
            int maxNumb = array1[0];
            int maxIndex = 0;
            for (int i = 1; i < array1.length; i++) {
                if (array1[i] > maxNumb) {
                    maxNumb = array1[i];
                    maxIndex = i;
                }
            }
            if (maxIndex > 0) {
                int a = array1[0];
                array1[0] = maxNumb;
                array1[maxIndex] = a;
            }
        }
        System.out.println("После преобразований:");
        System.out.println();

        for (int[] Arr : array) {
            System.out.println(Arrays.toString(Arr));
        }
    }

    public static void task11() {
        /*Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в
        консоль. Постарайтесь заполнить обе диагонали в одном цикле.*/

        int[][] array = new int[3][3];

        int num = 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = num;
            for (int a = array.length - 1; a >= 0; a--) {
                array[i][a] = num;
                i++;
                if (i == 3) {
                    array[2][2] = num;
                }
            }
        }

        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task12() {
        /*У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.*/

        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));

        int[] arrayConvert = new int[5];

        int element = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            arrayConvert[i] = array[element];
            element--;
        }
        System.out.println(Arrays.toString(arrayConvert));

    }

    public static void task13() {
        /*Решите предыдущее задание, но без использования дополнительного массива.
        Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        Выведите результат программы в консоль тем же способом.*/

        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println();

        int elementNew = array.length - 1;
        for (int i = 0; i < 2; i++) {
            int elementOld = array[i];
            array[i] = array[elementNew];
            array[elementNew] = elementOld;
            elementNew--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task14() {
        /*Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.*/

        int[] number = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        metka:
        for (int i = 0; i < number.length; i++) {
            for (int b = 0; b < number.length; b++) {
                int sum = number[i] + number[b];
                if (sum == -2) {
                    System.out.println("Первое число " + number[i] + " второе число " + number[b]);
                    break metka;
                }
            }
        }
    }

    public static void task15(){
//      Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.

        int[] number = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(number);

        for (int i = 0; i < number.length; i++) {
            for (int b = 0; b < number.length; b++) {
                int sum = number[i] + number[b];
                if (sum == -2) {
                    System.out.println("Первое число " + number[i] + " второе число " + number[b]);
                }
            }
        }
    }
}
