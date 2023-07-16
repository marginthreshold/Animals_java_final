
import java.util.List;

abstract class Animal {
    protected String name;
    protected String type;
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public abstract List<String> getCommands();
    public abstract void train(String command);
}

