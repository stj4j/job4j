package ru.job4j.tracker;

public class StartUI {

    private static final int ADD = 0;
    private static final int SHOW = 1;
    private static final int EDIT = 2;
    private static final int EDITID = 20;
    private static final int EDITNAME = 21;
    private static final int EDITDESCRIPTION = 22;
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
                    Item[] rezult = tracker.findAll();
                    this.input.showItems(rezult);
                    break;
                case EDIT:
                    this.input.showItems(tracker.findAll());
                    String editID = input.askUser("Input ID for editing: ");
                    Item newItem = new Item();
                    newItem.setId(editID);
                    newItem.setName(this.input.askUser("Input Name : "));
                    newItem.setDescription(this.input.askUser("Input description"));
                    tracker.replace(editID, newItem);
                    break;
                case DELETE:
                    String delId = input.askUser("Input ID : ");
                    tracker.delete(delId);
                    break;
                case FINDBYID:
                    String id = input.askUser("Input ID : ");
                    this.input.showItem(this.tracker.findById(id));
                    break;
                case FINDBYNAME:
                    String findName = input.askUser("Input Name: ");
                    this.input.showItems(tracker.findByName(findName));
                    break;
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
