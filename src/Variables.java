public class Variables {
    public static void main(String[] args) {

        byte myByte = 127;          // 8-bit integer    -128 to 127 (inclusive)
        short myShort = 32767;      // 16-bit integer   -32,768 to 32,767 (inclusive)
        int myInt = 2147483;        // 32-bit integer   -2,147,483,648(-2^31) to 2,147,483,647(2^31-1)(inclusive)
        long myLong = 922337206;    // 64-bit integer   -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63-1)(inclusive)

        float myFloat = 2353.3f;    // 32-bit floating point
        double myDouble = 235.35;   // 64-bit floating point

        char c = 'a';               // 16-bit character
        boolean b = true;           // true or false

        // Printing out the values
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);

        System.out.println(myFloat);
        System.out.println(myDouble);

        System.out.println(c);
        System.out.println(b);
    }
}
