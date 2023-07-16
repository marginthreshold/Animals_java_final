import java.util.List;

class Dog extends DomesticAnimal {
    public Dog(String name) {
        super(name, "Dog");
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