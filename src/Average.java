/*
* Purpose: To introduce variables, and to show some pitfalls
* that can happen with improper order of operations and wrong types
*/
public class Average {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 6;
        /* We need to cast to a double type so we get
           a decimal answer, and we also have to be careful
           with order of operations, since we do a+b+c
           before dividing */
        System.out.println(((double)(a + b + c))/3);
    }
}
