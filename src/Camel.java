import java.util.List;

class Camel extends PackAnimal {
    public Camel(String name) {
        super(name, "Camel");
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