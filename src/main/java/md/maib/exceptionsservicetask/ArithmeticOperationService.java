package md.maib.exceptionsservicetask;

public class ArithmeticOperationService {

    public static int divideIntNoExceptionhandling(int a, int b){
        return a / b;
    }

    public static int divideIntWithExceptionaHand(int a, int b){
        try{
            int result = a / b;
            return result;
        }catch(ArithmeticException exceptionObject){
            System.out.println("An exception o ccured: " + exceptionObject.getMessage());
            return 0;
        }
    }
}
