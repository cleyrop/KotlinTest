public class Main {

    public static void main(String... args) {
        OuterClassJava outerInstance = new OuterClassJava("first");
        // Please note the syntax differences to instantiate nested or inner classes
        OuterClassJava.NestedClass nestedInstance = new OuterClassJava.NestedClass();
        OuterClassJava.InnerClass innerInstance = outerInstance.new InnerClass();
        OuterClassJava.InnerClass innerInstance2 = new OuterClassJava("second").new InnerClass();

        outerInstance.show();
        nestedInstance.show();
        innerInstance.show();
        innerInstance2.show();
    }

}
