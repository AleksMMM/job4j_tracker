package ru.job4j.tracker;

public class CreateAction implements UserAction {

    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Create";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askString("Enter name");
        Item item =new Item();
        tracker.add(item);
        return true;
    }
}
