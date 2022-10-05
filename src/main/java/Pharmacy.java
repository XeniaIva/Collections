import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    //Класс аптека. Добавляет новое лекарство по наименованию и цене. Позволяет узнать цену лекарства по названию.

    Map<String, Integer> pharmacy = new HashMap<>();

    public void addMedicament(String name, int price) {
        pharmacy.put(name, price);
    }

    public void removeMedicament(String name) {
        pharmacy.remove(name);
    }

    public void searchMedicamentPrice(String name) {
        for (Map.Entry<String, Integer> entry : pharmacy.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
