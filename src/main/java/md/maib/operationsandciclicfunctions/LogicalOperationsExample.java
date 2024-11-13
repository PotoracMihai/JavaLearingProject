package md.maib.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logical and: " + result);

        // a = true
        a = result && b;
        // a = false
        System.out.println("Logical and: " + a);

        //result = false
        result = a || b;
        //result = false
        System.out.println("Logical or: " + result);

        System.out.println("Negation: " + !!!result);
    }
}
