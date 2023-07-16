import java.util.List;

class Horse extends PackAnimal {
    public Horse(String name) {
        super(name, "Horse");
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