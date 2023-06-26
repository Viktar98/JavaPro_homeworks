package extra;

public class First {

    public static void main(String[] args) {

        System.out.println(isArrayMonotonic(new int[]{14,13,12,0,0}));

    }

    public static boolean isArrayMonotonic(int[] arr){
        int i;
        boolean mono = true;
        for (i = 1; i < arr.length; i++) {
            if (arr[i-1] <= arr[i])
                continue;
            else {
                mono = false;
                break;
            }
        }
        if (!mono){
            mono = true;
            for (i = 1; i < arr.length; i++) {
                if (arr[i-1] >= arr[i])
                    continue;
                else {
                    mono = false;
                    break;
                }
            }
        }
        return mono;
    }


}


