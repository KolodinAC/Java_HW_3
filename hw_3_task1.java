import java.util.*;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class hw_3_task1 {
    public static void main(String[] args ){
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите длину массива: ");
        int n = iScanner.nextInt();
        iScanner.close();
        List<Integer> userlist = createListInt(n);
        System.out.println("Сгенерировали новый массив целых чисел от 2 до 100: \n" + userlist);
        List<Integer> result = removeEvenNums(userlist);
        System.out.println("Убрали из массива четные числа: \n" + result);
    }

    public static List<Integer> createListInt(int size) {
        Random random = new Random();
        if (size == 0) {
            size = random.nextInt(2, 100);
        }
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static List<Integer> removeEvenNums(List<Integer> list) {
        list.removeIf(n -> n % 2 == 0);
        return list;
    }
}
