import java.util.List;

class Hamster extends DomesticAnimal {
    public Hamster(String name) {
        super(name, "Hamster");
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
