package homework_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // необходимые переменные и объекты
        List<Integer> nums = new ArrayList<>();
        int arrayLength, intForFor;
        double delta0, delta1, delta2, delta3, delta4, delta5, delta6;
        long timeStart, timeFinish;
        Integer tmp;
        Scanner sc = new Scanner(System.in);

        // запрос длины через консоль
        while(true){
            System.out.print("ВВЕДИТЕ ДЛИНУ ЛИСТА: ");
            arrayLength = sc.nextInt();
            if (arrayLength >= 1)
                break;
            System.out.println("НЕКОРЕКТНЫЙ ВВОД!\nДЛИНА ДОЛЖНА БЫТЬ ПОЛОЖИТЕЛЬНОЙ!\nПОВТОРИТЕ ВВОД.");
        } sc.close();

        // создание листа
        System.out.print("СПАСИБО! СОЗДАЁТСЯ ЛИСТ");
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println();
        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= arrayLength; i++) {
            nums.add(i);
        }
        timeFinish = System.currentTimeMillis();
        delta0 = (timeFinish - timeStart) * 0.001; // вычисления
        System.out.println("ЛИСТ СОЗДАН.");
        Iterator<Integer> iterator = nums.iterator();
        ListIterator<Integer> listIterator = nums.listIterator();

        // "обнуление" временных переменных (для равных условий эксперемента)
        tmp = 0;
        timeStart = 0;
        timeFinish = 0;

        // перебор циклом for-each
        timeStart = System.currentTimeMillis();
        for (int current: nums){
            tmp = current;
        }
        timeFinish = System.currentTimeMillis();
        delta1 = (timeFinish - timeStart) * 0.001; // вычисления

        // "обнуление" временных переменных (для равных условий эксперемента)
        tmp = 0;
        timeStart = 0;
        timeFinish = 0;

        // перебор циклом for (1)
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < nums.size(); i++) {
            tmp = nums.get(i);
        }
        timeFinish = System.currentTimeMillis();
        delta2 = (timeFinish - timeStart) * 0.001; // вычисления

        // "обнуление" временных переменных (для равных условий эксперемента)
        tmp = 0;
        timeStart = 0;
        timeFinish = 0;

        // перебор циклом for (2)
        intForFor = nums.size();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < intForFor; i++) {
            tmp = nums.get(i);
        }
        timeFinish = System.currentTimeMillis();
        delta3 = (timeFinish - timeStart) * 0.001; // вычисления

        // "обнуление" временных переменных (для равных условий эксперемента)
        tmp = 0;
        timeStart = 0;
        timeFinish = 0;

        // перебор циклом for (3)
        intForFor = nums.size();
        timeStart = System.currentTimeMillis();
        for (int i = intForFor-1; i >= 0; i--) {
            tmp = nums.get(i);
        }
        timeFinish = System.currentTimeMillis();
        delta4 = (timeFinish - timeStart) * 0.001; // вычисления

        // "обнуление" временных переменных (для равных условий эксперемента)
        tmp = 0;
        timeStart = 0;
        timeFinish = 0;

        // перебор итератором
        timeStart = System.currentTimeMillis();
        while(iterator.hasNext()){
            tmp = iterator.next();
        }
        timeFinish = System.currentTimeMillis();
        delta5 = (timeFinish - timeStart) * 0.001; // вычисления

        // "обнуление" временных переменных (для равных условий эксперемента)
        tmp = 0;
        timeStart = 0;
        timeFinish = 0;

        // перебор итератором
        timeStart = System.currentTimeMillis();
        while(listIterator.hasNext()){
            tmp = listIterator.next();
        }
        timeFinish = System.currentTimeMillis();
        delta6 = (timeFinish - timeStart) * 0.001; // вычисления

        //финальные вычисления
        double deltaMean = (delta1 + delta2 + delta3 + delta4 + delta5 + delta6) / 6.0;
        String v1, v2;
        v1 = "на " + String.format("%.2f",delta1/deltaMean - 1) + "% медленее среднего перебора";
        v2 = "на " + String.format("%.2f",1 - delta1/deltaMean) + "% быстрее среднего перебора";
        String procentOfMean1 = delta1/deltaMean>1 ? v1 : v2;
        v1 = "на " + String.format("%.2f",delta2/deltaMean - 1) + "% медленее среднего перебора";
        v2 = "на " + String.format("%.2f",1 - delta2/deltaMean) + "% быстрее среднего перебора";
        String procentOfMean2 = delta2/deltaMean>1 ? v1 : v2;
        v1 = "на " + String.format("%.2f",delta3/deltaMean - 1) + "% медленее среднего перебора";
        v2 = "на " + String.format("%.2f",1 - delta3/deltaMean) + "% быстрее среднего перебора";
        String procentOfMean3 = delta3/deltaMean>1 ? v1 : v2;
        v1 = "на " + String.format("%.2f",delta4/deltaMean - 1) + "% медленее среднего перебора";
        v2 = "на " + String.format("%.2f",1 - delta4/deltaMean) + "% быстрее среднего перебора";
        String procentOfMean4 = delta4/deltaMean>1 ? v1 : v2;
        v1 = "на " + String.format("%.2f",delta5/deltaMean - 1) + "% медленее среднего перебора";
        v2 = "на " + String.format("%.2f",1 - delta5/deltaMean) + "% быстрее среднего перебора";
        String procentOfMean5 = delta5/deltaMean>1 ? v1 : v2;
        v1 = "на " + String.format("%.2f",delta6/deltaMean - 1) + "% медленее среднего перебора";
        v2 = "на " + String.format("%.2f",1 - delta6/deltaMean) + "% быстрее среднего перебора";
        String procentOfMean6 = delta6/deltaMean>1 ? v1 : v2;

        //вывод результата
        System.out.println(">>>_____________РЕЗУЛЬТАТЫ: (размер - " + arrayLength + ")");
        System.out.println(">>>_____СОЗДАНИЕ КОЛЛЕКЦИИ: " + String.format("%.3f",delta0) + " cек.");
        System.out.println(">>>_СРЕДНЕЕ ВРЕМЯ ПЕРЕБОРА: " + String.format("%.3f",deltaMean) + " cек.");
        System.out.print(">>>перебор циклом for-each: " + String.format("%.3f",delta1) + " cек.");
        System.out.println(", что " + procentOfMean1 + ".");
        System.out.print(">>>_перебор циклом for (1): " + String.format("%.3f",delta2) + " cек.");
        System.out.println(", что " + procentOfMean2 + ".");
        System.out.print(">>>_перебор циклом for (2): " + String.format("%.3f",delta3) + " cек.");
        System.out.println(", что " + procentOfMean3 + ".");
        System.out.print(">>>_перебор циклом for (3): " + String.format("%.3f",delta4) + " cек.");
        System.out.println(", что " + procentOfMean4 + ".");
        System.out.print(">>>_____перебор итератором: " + String.format("%.3f",delta5) + " cек.");
        System.out.println(", что " + procentOfMean5 + ".");
        System.out.print(">>>_перебор листитератором: " + String.format("%.3f",delta6) + " cек.");
        System.out.println(", что " + procentOfMean6 + ".");









    }
}
