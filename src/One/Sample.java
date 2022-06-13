package One;

import java.util.Scanner;

class Sample {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }

    static class Parent {
        int x = 100;

        void method() {
            System.out.println("Parent Method");
        }
    }

    static class Child extends Parent {
        int x = 200;
        void method() {
            System.out.println("Child Method");
        }
    }
}
