public class Car extends Vehicle implements ISound, IWeight {

    private int load;

    public Car(String make, int load) {
        super(make);
        this.load = load;
    }

    @Override
    public String getSound() {
        return "Sound of Car";
    }

    @Override
    public int getWeight() {
        return load;
    }


}