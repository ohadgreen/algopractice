package questions.parallelComp;

public class UppercaseString implements StringFunction{
    @Override
    public String transform(String str) {
        return str.toUpperCase();
    }
}
