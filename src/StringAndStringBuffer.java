public class StringAndStringBuffer {
    public static void main(String[] args) {
        string();
        stringBuffer();
    }

    public static void string() {
        long start = System.nanoTime();
        String s = "Hello";

        for (int i = 0; i < 1000; i++) {
            s = s + "World";
        }

        long end = System.nanoTime();

        System.out.println("String: " + (end - start));
    }

    public static void stringBuffer() {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer("Hello");

        for (int i = 0; i < 1000; i++) {
            sb.append("World");
        }

        String s = sb.toString();

        long end = System.nanoTime();

        System.out.println("String Buffer: " + (end - start));
    }
}
