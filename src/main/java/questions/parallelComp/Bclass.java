package questions.parallelComp;

public class Bclass extends Aclass{

    public Bclass() {
        System.out.println("This is the B class");
    }
    @Override
    public void calc() {
        System.out.println("This is the abstract method implementation in B class");
    }
}
