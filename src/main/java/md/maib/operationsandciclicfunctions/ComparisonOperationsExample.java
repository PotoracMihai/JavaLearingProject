package md.maib.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        //Diferit de
        boolean isNotEqual = a != b;
        System.out.println("Diferit de : " + isNotEqual);

        //Mai mare decat
        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decat: " + isGreaterThan);

        //Mai mic decat
        boolean isLessThan = a < b;
        System.out.println("Mai mic decat: " + isLessThan);

        //Mai mare sau egal decat
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare sau egal decat: " + isGreaterThanOrEqual);

        //Mai mic sau egal decat
        boolean isLessThanOrEqual = a <= b;
        System.out.println("Mai mic sau egal decat: " + isLessThanOrEqual);
    }
}
