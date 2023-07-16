import java.util.List;

class Donkey extends PackAnimal {
    public Donkey(String name) {
        super(name, "Donkey");
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
