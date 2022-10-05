import java.util.ArrayList;
import java.util.List;

public class Shopping {
    // Класс список покупок. Позволяет записать или удалить товар, а также выводит общий список нужных покупок.
    List<String> shopping = new ArrayList<>();

    public void addProduct(String product) {
        shopping.add(product);
    }

    public void removeProduct(String product) {
        shopping.remove(product);
    }

    public void printShoppingList() {
        for (int i = 0; i < shopping.size(); i++) {
            System.out.println(shopping.get(i));
        }
    }
}
