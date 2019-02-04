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
    private boolean exit = false;

    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        while (!exit) {
            this.input.printMenu();
            String answer = this.input.askUser("Please select operation : ");
            switch (Integer.parseInt(answer)) {
                case ADD:
                    this.createItem();
                    break;
                case SHOW:
                    this.showAllItems();
                    break;
                case EDIT:
                    this.editItem();
                    break;
                case DELETE:
                    this.deleteItem();
                    break;
                case FINDBYID:
                    this.findById();
                    break;
                case FINDBYNAME:
                    this.findByName();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    doDefault();
            }
        }
    }

    public void showAllItems() {
        Item[] rezult = tracker.findAll();
        this.input.showItems(rezult);
    }

    public void editItem() {
        this.input.showItems(tracker.findAll());
        String editID = input.askUser("Input ID for editing: ");
        Item newItem = new Item();
        newItem.setId(editID);
        newItem.setName(this.input.askUser("Input Name : "));
        newItem.setDescription(this.input.askUser("Input description"));
        this.input.message((tracker.replace(editID, newItem)));
    }

    public void createItem() {
        input.message("------------ Добавление новой заявки --------------");
        String name = this.input.askUser("Введите имя заявки :");
        String desc = this.input.askUser("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        input.message("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    public void deleteItem() {
        String delId = input.askUser("Input ID : ");
        this.input.message(tracker.delete(delId));
    }

    public void findByName() {
        String findName = input.askUser("Input Name: ");
        this.input.showItems(tracker.findByName(findName));
    }

    public void findById() {
        String id = input.askUser("Input ID : ");
        this.input.showItem(this.tracker.findById(id));
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

    public void doDefault() {
        this.input.askUser("Please select next operation : ");
    }

    private void exit() {
        exit = true;
    }

}
