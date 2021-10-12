public class Car extends Vehicle implements ISound {

    public Car(String make) {
        super(make);
    }

    @Override
    public String getSound() {
        return "Sound of Car";
    }

}