package md.maib.exception;

import md.maib.methodstask.Customer;

public class InvalidCredential {

    public static void main(String[] args) {
        RestExceptionHandler restExceptionHandler = new RestExceptionHandler();
        Customer ioncustomer = new Customer();
        ioncustomer.setName("Ion Lungu");
        ioncustomer.setEmail("ion.lungu@gmail.com");
        ioncustomer.setAge(26);

        if(ioncustomer.getName().equals("Ion Lunguu") && ioncustomer.getEmail().equals("ion.lungu@gmail.com") && ioncustomer.getAge() == 26){
            //throw new Exception("Invalid credentials");
            restExceptionHandler.handleException("Invalid credentials");

        } else {
            System.out.println("Invalid credentials");
        }
    }

}
