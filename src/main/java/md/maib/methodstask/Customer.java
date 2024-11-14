package md.maib.methodstask;

public class Customer {

    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age > 100 || this.age < 18) {
            this.age = 0;
            System.out.println("Entered value for age is not valid. Age should be between 18 and 100");
        } else {
            this.age = age;
        }
    }

    private String email;
    private int age;

    public Customer() {


    }

    public Customer(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        if ((age <= 1) || (age > 127)){
            System.out.println("The age is not valid");
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
