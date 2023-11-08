package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Редактировать заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Редактирование заявки ===");
        int id = Integer.parseInt(input.askStr("Введите id: "));
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Заявка изменена успешно.");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
