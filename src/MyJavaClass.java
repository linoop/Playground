
public class MyJavaClass {
    public static void main(String[] args) throws Throwable {

        Calc calc = new Calc() {
            @Override
            public int add(int a, int b) {
                return 0;
            }
        };
        int result = calc.add(10, 30);

        System.out.println(result);
    }
}

interface Calc {
    int add(int a, int b);
}

