public class Cat extends Animal implements ISound {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        return "Sound of Cat";
    }
    
}
