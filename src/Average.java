/*
* Purpose: To introduce variables, and to show some pitfalls
* that can happen with improper order of operations and wrong types
*/
public class Average {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 6;
        System.out.println(a + b + c/3);
    }
}