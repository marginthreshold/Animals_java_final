import java.util.List;

class Cat extends DomesticAnimal {
    public Cat(String name) {
        super(name, "Cat");
    }
    @Override
    public List<String> getCommands() {
        return commands;
    }
    @Override
    public void train(String command) {
        commands.add(command);
        System.out.println(name + " learned a new command: " + command);
    }
}