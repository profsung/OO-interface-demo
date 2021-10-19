public class Rock implements IWeight {

    private int kg;

    public Rock(int kg) {
        this.kg = kg;
    }

    @Override
    public int getWeight() {
        return kg;
    }
    
}
