package algorithms_homeworks.hw2;

public class Main {
    public static void main(String[] args) {

        System.out.println(task1ByLoop(10, 2));
        System.out.println(task1ByRecursion(10, 2) + '\n');

        for (int i = 0; i <= 30; i++) {
            System.out.println("a(" + i + ") = " + task2(i));
        }
    }

    /** Написать функцию, вычисляющую сумму тех чисел
     в диапазоне от 1 до n, которые делятся на m. **/

    /**
     * а) через цикл
     **/
    public static int task1ByLoop(int n, int m) { //     space: sum,n -> O(2)  -> 0(1)
        int sum = 0;                             //      time: O(4n + 3)      -> O(n)
        for (int i = 1; i <= n; i++) {
            if (i % m == 0)
                sum += i;
        }
        return sum;
    }

    /**
     * б) через рекурсию
     **/
    public static int task1ByRecursion(int n, int m) {
        if (n == 0) {
            return 0;
        } else {
            int sum = task1ByRecursion(n - 1, m);
            if (n % m == 0) {
                sum += n;
            }
            return sum;
        }
    }

    /** Вычислить n-й член последовательности, заданной формулами:
     a(2n) = a(n) + a(n-1),
     a(2n+1) = a(n) — a(n-1),
     a(0) = a(1) = 1. **/

    public static int task2(int n){
        if (n == 0 || n == 1)
            return 1;
        else if (n > -1)
            return n % 2 == 0? task2(n/2) + task2(n/2 - 1) : task2((n-1)/2) - task2((n-2)/2);
        else return 0;
    }

}
