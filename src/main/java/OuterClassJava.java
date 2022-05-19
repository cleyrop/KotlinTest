public class OuterClassJava {

    private String name;

    public OuterClassJava(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void show() {
        System.out.println("OuterJava");
    }

    // In java to have a nested class without reference to their outer class you must declare it as static
    static class NestedClass {
        public void show() {
            // Impossible here to write OuterClass.this.getClass()
            System.out.println("NestedJava");
        }
    }

    // In Java by default nested classes are inner meaning they maintain a reference to the outer class
    class InnerClass {
        public void show() {
            System.out.println("InnerJava inside " + OuterClassJava.this.getName());
        }
    }

}
