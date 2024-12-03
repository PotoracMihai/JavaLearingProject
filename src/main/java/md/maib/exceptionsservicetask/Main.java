package md.maib.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {

        System.out.println(ArithmeticOperationService.divideIntNoExceptionhandling(10, 0));
        System.out.println(ArithmeticOperationService.divideIntWithExceptionaHand(10, 0));
        System.out.println(TextManager.getTheTextLength("Hello"));
        System.out.println(TextManager.getTheTextLengthTryCatch("Hello"));
        System.out.println(TextManager.getTheTextLengthTryCatch(null));
        System.out.println(TextManager.getTheTextLengthFile("Hello"));
    }
}
