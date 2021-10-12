public class Main1 {
    public static void main(String[] args) {

        ISound[] soundSources = new ISound[4];
        soundSources[0] = new Car("Ford", 250);
        soundSources[1] = new Train("M&M");
        soundSources[2] = new Dog("Tom", 10);
        soundSources[3] = new Cat("Jerry");

        for (var s : soundSources) {
            System.out.println(s.getSound());
        }

    }
}