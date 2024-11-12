package md.maib.accessmodifires;

import md.maib.accessmodifires.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person ionPerson = new Person("Ion", "Creanga", 134353535);

        ionPerson.isRetired = true;

        if(ionPerson.isRetired){
            System.out.println("Ion este la pensie");
        }else{
            System.out.println("Ion inca munceste");
        }

        Person dariaPerson = new Person("Daria", "Ivanova", 134353536, "Chisinau", false);

        if(dariaPerson.isRetired){
            System.out.println("Daria este la pensie");
        }else{
            System.out.println("Daria inca munceste");
        }

        Person mihaiPeson = new Person("Mihai", "Eminescu", 134353537, "Chisinau", true);
        if(mihaiPeson.isRetired){
            System.out.println("Mihai este la pensie");
        }else {
            System.out.println("Mihai inca munceste");
        }

        Person anaPerosn = new Person("Ana", "Blandiana", 134353538, "Chisinau", false);
        if(anaPerosn.isRetired) {
            System.out.println("Ana este la pensie");
        }else {
            System.out.println("Ana inca munceste");
        }

        Person vasilePerson = new Person ("Vasile", "Blochi", 213143234);
        vasilePerson.isRetired = true;

        if (vasilePerson.isRetired) {
            System.out.println("Vasile este la pensie");
        } else {
            System.out.println("Vasile inca munceste");
        }

    }
}
