class A {
    int n = 15;
    
    // Method to check even or odd
    int oddEven() {
        if (n % 2 == 0) {
            return 1; // Even
        } else {
            return 0; // Odd
        }
    }
}

class B extends A {
    public static void main(String[] args) {
        B ob = new B();
        int r = ob.oddEven(); // Calling the method from parent class
        
        if (r == 1) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
