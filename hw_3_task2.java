import java.util.*;

public class hw_3_task2 {
    public static void main(String[] args ){
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите длину массива: ");
        int n = iScanner.nextInt();
        iScanner.close();
        List<Integer> userlist = createListInt(n);
        System.out.println("Сгенерировали новый массив целых чисел от 2 до 100: \n" + userlist);
        HashMap<String, Integer> minmaxmid = getMinMidMax(userlist);
        System.out.println("Min, Max и Среднее арифметическое элементов массива равны: \n" + minmaxmid);
    }

    public static HashMap<String, Integer> getMinMidMax(List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        int counter = list.size();
        HashMap<String, Integer> result = new HashMap<>();

        for (int i : list
        ) {
            if (i < min) min = i;
            if (i > max) max = i;
            sum += i;
        }

        Integer mid = (Integer) sum / (Integer) counter;
        result.put("max", (Integer) max);
        result.put("min", (Integer) min);
        result.put("mid", mid);

        return result;
    }

    public static List<Integer> createListInt(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }
}

