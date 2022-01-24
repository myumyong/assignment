package coffeeMaker;

import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    // 이 메서드때문에 아메리카노를 넣으면 가격도 같이 나오는것
    public MenuItem choose(String name) {
        for (MenuItem each : items) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }
}
