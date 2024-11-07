// Define the Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Implement the Gorilla class
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla.");
            return true;
        } else {
            System.out.println("It's not feeding time.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla: lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla: pet at your own risk!");
    }
}

// Main class to test Gorilla
public class Main {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        // Test feeding
        System.out.println("Feed gorilla: " + gorilla.feed(true));

        // Test grooming
        gorilla.groom();

        // Test petting
        gorilla.pet();
    }
}