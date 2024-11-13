package md.maib.operationsandciclicfunctions;

public class AssigmentOperationExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        //Atribuire simpla
        int result = a;
        System.out.println("Rezultatul: " + result);

        //Atribuirea cu adunare
        result += b;
        System.out.println("Atribuirea cu adunarea: " + result);

        //Atribuirea cu scadere
        result -= b;
        System.out.println("Atribuirea cu scaderea: " + result);

        //Atribuirea cu inmultire
        result *= b;
        System.out.println("Atribuirea cu inmultirea: " + result);

        //Atribuira cu impartire
        result /= b;
        System.out.println("Atribuirea cu impartira: " + result);

        //Atriburiea cu restul impartirii
        result %= b;
        System.out.println("Atribuirea cu restul impartirii: " + result);
    }
}
