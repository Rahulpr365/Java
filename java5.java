public class A {
    int n = 15, flag = 0;

    protected int odd_even() {
        if (n % 2 == 0) {
            flag = 1;
        }
        return flag;
    }
}

public class B extends A {
    public static void main(String[] args) {
        B ob = new B();
        int r = ob.odd_even();

        if (r == 1) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
