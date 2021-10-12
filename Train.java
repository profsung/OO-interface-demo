public class Train extends Vehicle implements ISound {

    public Train(String make) {
        super(make);
    }

    @Override
    public String getSound() {
        return "Sound of Train";
    }
    
}
