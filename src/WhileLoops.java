public class WhileLoops {
    public static void main(String[] args) {
        boolean t = true;       // boolean
        boolean m = 5 > 2;      // more
        boolean l = 7 < 5;      // less
        boolean me = 5 >= 5;    // more or equals
        boolean ee = 5 == 5;    // are they equal?

        System.out.println(t);
        System.out.println(m);
        System.out.println(l);
        System.out.println(me);
        System.out.println(ee);

        int value = 0;
        while (value < 5) {
            System.out.println("Hello! " + value);
            value += 1;
        }

    }
}
