package algorithms_homeworks.hw1;

public class Main {
    public static void main(String[] args) {

        // Илья, еденственный момент, по самому заданию: нам вернуть надо значение
        // элемента или его индекс ?
        // Точной формульровки не было, вернул значение, так посчитал более наглядно.

        int[] test1 = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11};
        int[] test2 = new int[]{12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 20, 20, 32, 32, 44, 44};
        int[] test3 = new int[]{10, 10, 11, 12, 12, 17, 17};
        int[] test4 = new int[]{1,1,2,2,3,3,4,4,5,6,6,6,7,7};
        int[] test5 = new int[]{1,1,2,2,5,6,6,6,7,7};

        System.out.println("Сложность алгоритма: O(n).");
        // или O(n/4), если неопускать множетели (сам пока не понял)

        System.out.println("\nTEST 1:");
        System.out.println(searchNotDoubleElem(test1));

        System.out.println("\nTEST 2:");
        System.out.println(searchNotDoubleElem(test2));

        System.out.println("\nTEST 3:");
        System.out.println(searchNotDoubleElem(test3));

        System.out.println("\nTEST 4:");
        System.out.println(searchNotDoubleElem(test4));

        System.out.println("\nTEST 5:");
        System.out.println(searchNotDoubleElem(test5));

    }

    public static int searchNotDoubleElem(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        for (; i <= j; ) {
            if (nums[i] != nums[i + 1])
                return nums[i];
            if (nums[j] != nums[j - 1])
                return nums[j];
            i += 2;
            j -= 2;
        }
        System.out.print("Массив не содержит не повторяющегося элемента ");
        return -1;
    }
}
