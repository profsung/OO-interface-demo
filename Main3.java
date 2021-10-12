public class Main3 {

    public static void main(String[] args) {
        Car c1 = new Car("GM", 200);
        Dog d1 = new Dog("Mark", 15);

        boolean answer = isHeavier(c1, d1);
        System.out.println(answer);

    }

    public static boolean isHeavier(IWeight o1, IWeight o2) {
        if (o1.getWeight() > o2.getWeight())
            return true;
        else
            return false;
    }
    
}
