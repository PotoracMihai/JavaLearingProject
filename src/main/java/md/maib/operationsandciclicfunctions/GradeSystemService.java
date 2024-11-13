package md.maib.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 98;

        if (testResult >= 90) {
            System.out.println("Calicativul A");
        } else if (testResult >= 80) {
            System.out.println("Calicativul B");
        } else if (testResult >= 70) {
            System.out.println("Calicativul C");
        } else if (testResult >= 60) {
            System.out.println("Calicativul D");
        } else {
            System.out.println("Un astfel de calicativ nu este definit");
        }

        System.out.println("Programul s-a  terminat");
    }
}
