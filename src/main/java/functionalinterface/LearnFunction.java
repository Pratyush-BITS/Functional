package functionalinterface;

import java.util.function.Function;

public class LearnFunction {
    public static void main(String[] args) {

        Integer val = increment(0);
        System.out.println(val);

        val = IncrementByOne.andThen(MultiplyByTwo).apply(val);
        System.out.println(val);
    }

    static int increment(Integer a){return ++a;}

    static Function<Integer, Integer> IncrementByOne = num -> ++num;
    static Function<Integer, Integer> MultiplyByTwo = num -> 2*num;

}
