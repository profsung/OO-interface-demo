public class Dog extends Animal implements ISound {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "Sound of Dog";
    }
    
}
