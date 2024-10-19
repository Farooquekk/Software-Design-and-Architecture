
public class TestPattern {
    public static void main(String[] args) {
        Subject sub = new Data();
        new BinaryObserver(sub);
        new OctalObserver(sub);
        new HexaObserver(sub);

        System.out.print("Testing with 10");
        sub.setState(10);

        System.out.print("Testing with 15");
        sub.setState(15);
    }
}
