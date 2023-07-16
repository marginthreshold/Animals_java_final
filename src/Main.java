import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter(); Scanner scanner = new Scanner(System.in)) {
            List<Animal> animals = new ArrayList<>();
            while (true) {
                System.out.println("Animal Registry Menu:");
                System.out.println("1. Register a new animal");
                System.out.println("2. View animal's commands");
                System.out.println("3. Train animal with a new command");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the animal's name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the animal's type (Cat, Dog, Hamster, Horse, Camel, Donkey): ");
                        String type = scanner.nextLine();
                        Animal animal = createAnimal(name, type);
                        if (animal != null) {
                            animals.add(animal);
                            counter.add();
                            System.out.println("New animal registered: " + animal.name + " (" + animal.type + ")");
                        } else {
                            System.out.println("Invalid animal type!");
                        }
                        break;
                    case 2:
                        if (!animals.isEmpty()) {
                            System.out.print("Enter the animal's name: ");
                            name = scanner.nextLine();
                            Animal selectedAnimal = findAnimalByName(animals, name);
                            if (selectedAnimal != null) {
                                List<String> commands = selectedAnimal.getCommands();
                                if (commands.isEmpty()) {
                                    System.out.println("The animal doesn't know any commands yet.");
                                } else {
                                    System.out.println("Commands known by " + selectedAnimal.name + " (" + selectedAnimal.type + "):");
                                    for (String command : commands) {
                                        System.out.println(command);
                                    }
                                }
                            } else {
                                System.out.println("Animal not found!");
                            }
                        } else {
                            System.out.println("No animals registered yet.");
                        }
                        break;
                    case 3:
                        if (!animals.isEmpty()) {
                            System.out.print("Enter the animal's name: ");
                            name = scanner.nextLine();
                            Animal selectedAnimal = findAnimalByName(animals, name);
                            if (selectedAnimal != null) {
                                System.out.print("Enter the new command to train the animal: ");
                                String command = scanner.nextLine();
                                selectedAnimal.train(command);
                            } else {
                                System.out.println("Animal not found!");
                            }
                        } else {
                            System.out.println("No animals registered yet.");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


    private static Animal createAnimal(String name, String type) {
        switch (type.toLowerCase()) {
            case "cat":
                return new Cat(name);
            case "dog":
                return new Dog(name);
            case "hamster":
                return new Hamster(name);
            case "horse":
                return new Horse(name);
            case "camel":
                return new Camel(name);
            case "donkey":
                return new Donkey(name);
            default:
                return null;
        }
    }

    private static Animal findAnimalByName(List<Animal> animals, String name) {
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }
}


