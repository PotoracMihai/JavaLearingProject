package md.maib.accessmodifires.peopleevidence;

public class Person {
    private String name;
    private String surname;
    private final long ID;
    protected String residence;
    public boolean isRetired;


    public Person(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        System.out.println("Un obiect de tip Person a fost creat, folosind un cosntructor cu 3 parametri formali");
    }


    public Person(String name, String surname, int ID, String residence, boolean isRetired) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.residence = residence;
        this.isRetired = isRetired;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 5 parametri formali");
    }
}
