import java.util.ArrayList;
import java.util.List;

class PackAnimal extends Animal {
    protected List<String> commands;
    public PackAnimal(String name, String type) {
        super(name, type);
        this.commands = new ArrayList<>();
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