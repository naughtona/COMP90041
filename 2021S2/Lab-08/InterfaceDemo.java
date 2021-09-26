import java.util.ArrayList;

public class InterfaceDemo {
    public InterfaceDemo() {
        ArrayList<Rideable> rideableThings = new ArrayList<Rideable>();
        
        rideableThings.add(new Car());
        rideableThings.add(new Horse());

        for (Rideable r : rideableThings)
            r.ride();
    }

    public static void main(String[] args) {
        new InterfaceDemo();
    }

    private class Vehicle {
        // Vehicle specific code here
    }

    private class Animal {
        // Animal specific code here
    }

    private interface Rideable {
        public void ride();
    }

    private class Car extends Vehicle implements Rideable {
        @Override
        public void ride() {
            System.out.println("Riding on a car!");
        }
    }

    private class Horse extends Animal implements Rideable {
        @Override
        public void ride() {
            System.out.println("Riding on a horse!");
        }
    }
}

