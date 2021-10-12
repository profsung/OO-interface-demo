public class Dog extends Animal implements ISound, IWeight {

    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public String getSound() {
        return "Sound of Dog";
    }

    @Override
    public int getWeight() {
        return weight;
    }
    
}
