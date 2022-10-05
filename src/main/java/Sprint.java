import java.util.HashSet;
import java.util.Set;

public class Sprint {
    // Класс забег. Позволяет добавить и удалить номер бегуна, а также покажет, сколько бегунов есть с номерами в заданном промежутке
    Set<Integer> sprinters = new HashSet<>();

    public void addSprinter(Integer number) {
        sprinters.add(number);
    }

    public void deleteSprinter(Integer number) {
        sprinters.remove(number);
    }

    public void searchSprintersInRange(Integer range) {
        int i = 1;
        int sum = 0;
        while (i <= range) {
            if (sprinters.contains(i)) {
                sum++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
