import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Registry {
    // Класс ЗАГС. Добавляет новую семью по номеру свидетельства о браке и массивом из 2-х новобрачных.
    // Позволяет узнать фамилия мужа и жены по номеру свидетельства о браке.
    Map<Integer, String[]> registry = new HashMap<>();

    public void addNewFamily(int number, String[] fio) {
        registry.put(number, fio);
    }

    public void divorce(int number) {
        registry.remove(number);
    }

    public void searchFamily(int number) {
        for (Map.Entry<Integer, String[]> entry : registry.entrySet()) {
            if (entry.getKey().equals(number)) {
                System.out.println(Arrays.toString(entry.getValue()));
            }
        }
    }
}

