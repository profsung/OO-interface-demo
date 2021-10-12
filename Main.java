public class Main {
    public static void main(String[] args) {

        ISound[] soundSources = new ISound[4];
        soundSources[0] = new Car("Ford");
        soundSources[1] = new Train("M&M");
        soundSources[2] = new Dog("Tom");
        soundSources[3] = new Cat("Jerry");

        for (var s : soundSources) {
            System.out.println(s.getSound());
        }

    }
}