package questions.parallelComp;

public class ReverseString implements StringFunction{
    @Override
    public String transform(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
