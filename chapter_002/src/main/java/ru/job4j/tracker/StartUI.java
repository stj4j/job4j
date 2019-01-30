package ru.job4j.tracker;

public class StartUI {

    private static final int ADD = 0;
    private static final int SHOW = 1;
    private static final int EDIT = 2;
    private static final int DELETE = 3;
    private static final int FINDBYID = 4;
    private static final int FINDBYNAME = 5;
    private static final int EXIT = 6;
    private final ConsoleInput input;
    private final Tracker tracker;

    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.input.printMenu();
            String answer = this.input.askUser("Please select operation : ");
            switch (Integer.parseInt(answer)) {
                case ADD:
                    this.createItem();
                    break;
                case SHOW:
                case EDIT:
                case DELETE:
                case FINDBYID:
                    String id = input.askUser("Input ID : ");
                    this.input.showItem(this.tracker.findById(id));
                case FINDBYNAME:
                case EXIT:
                    exit = true;
                default:
                    this.input.askUser("Please select next operation : ");
            }
        }
    }

    public void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.askUser("Введите имя заявки :");
        String desc = this.input.askUser("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }


}
