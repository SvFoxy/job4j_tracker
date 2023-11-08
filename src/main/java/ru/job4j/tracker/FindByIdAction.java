package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Найти завку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Вывод заявки по id ===");
        int id = Integer.parseInt(input.askStr("Введите id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
