abstract class Bike {
    Bike() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear is changed");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("running");
    }
}

public class TestBike {
    public static void main(String[] args) {
        Honda obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}

