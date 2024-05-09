import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            var math = new ArrayService();
            var data = Files.readString(Paths.get("data.txt"));
            var strings = data.split("\r\n");
            for (int i = 0; i < strings.length; i++) {
                var start = System.nanoTime();
                var current = strings[i];
                var set = current.split(" ");
                var array = new int[set.length];
                System.out.print("В файле: ");
                for (int j = 0; j < array.length; j++) {
                    array[j] = Integer.parseInt(set[j]);
                    System.out.print(array[j] + " ");
                }
                System.out.println();
                var min = math._min(array);
                System.out.println("Минимальное: " + min);
                var max = math._max(array);
                System.out.println("Максимальное: " + max);
                var sum = math._sum(array);
                System.out.println("Сумма: " + sum);
                var mult = math._mult(array);
                System.out.println("Произведение: " + mult);
                var finish = System.nanoTime();
                var delta = (finish - start) / 1000;
                System.out.println("Количество элементов: " + array.length);
                System.out.println("Время выполнения: " + delta + " мкс");
                System.out.println();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}