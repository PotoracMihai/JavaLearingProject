package md.maib.methodstask;


public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(150, 350);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt1: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila radomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble1: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(256));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(257));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer ioncustomer = new Customer();
        ioncustomer.setName("Ion Lungu");
        ioncustomer.setEmail("ion.lungu@gmail.com");
        ioncustomer.setAge(26);

        System.out.println("Nume obiect Ion: " + ioncustomer.getName());
        System.out.println("Email obiect Ion: " + ioncustomer.getEmail());
        System.out.println("Varsta obiect Ion: " + ioncustomer.getAge());

        ioncustomer.setName("Ion Borta");
        ioncustomer.setEmail("IonBorta@gmail.com");
        ioncustomer.setAge(29);

        System.out.println("Nume obiect Ion: " + ioncustomer.getName());
        System.out.println("Email obiect Ion: " + ioncustomer.getEmail());
        System.out.println("Varsta obiect Ion: " + ioncustomer.getAge());


        Customer randomDataCustomer = new Customer();
        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(12));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(127));

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}
