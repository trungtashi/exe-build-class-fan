public class CheckFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan("Yellow", 10);
        Fan fan2 = new Fan("Blue", 5);
        fan1.turnOn();
        fan1.plusSpeed();

        System.out.println(fan1.showStatus());
        fan2.turnOn();
        fan2.plusSpeed();
        fan2.turnOff();
        System.out.println(fan2.showStatus());
    }
}
