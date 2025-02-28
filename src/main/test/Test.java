package main.test;

import java.util.function.BiFunction;

public class Test<Is, Should> {

    private final BiFunction<Is, Should, Boolean> test;
    private final String testName;
    private int success = 0;
    private int whole = 0;

    public Test(BiFunction<Is, Should, Boolean> test, String testName) {
        this.test = test;
        this.testName = testName;
    }

    public void getResult() {
        System.out.println(success + " from " + whole + " succeeded. Average: " + (double) success / whole);
    }

    public void test(Is is, Should should) {
        test(is, should, "" + this.whole);
    }

    public void test(Is is, Should should, String testID) {
        boolean success = this.test.apply(is, should);
        if (success) {
            System.out.println(this.testName + ": " + testID + " succeeded!");
            this.success++;
        } else {
            System.out.println(this.testName + ": " + testID + " failed! Is: " + is.toString() + ", should: " + should.toString());
        }
        this.whole++;
    }
    
}