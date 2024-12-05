package md.maib.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Library puskinLibrary = new Library("Puskin Library");

        //Adaugarea cartilor in biblioteca
        puskinLibrary.addBook(new Book("Eugene Onegin", "Alexander Pushkin"));
        puskinLibrary.addBook(new Book("The Captain's Daughter", "Alexander Pushkin"));

        //Afisam cartile din biblioteca
        puskinLibrary.printBooks();

        //Eliminarea carte din biblioteca
        Book bookToRemove = new Book("Eugene Onegin", "Alexander Pushkin");
        puskinLibrary.removeBook(bookToRemove);

        //Afisarea carti actualizate din biblioteca
        puskinLibrary.printBooks();

        Library eminescuLibrary = new Library("Eminescu Library");

        eminescuLibrary.addBook(new Book("Luceafarul", "Mihai Eminescu"));
        eminescuLibrary.addBook(new Book("Oda in metru antic", "Mihai Eminescu"));

        Map<String, Library> libraries = new HashMap<>();

        //Adaugam cateva librarii in Map
        libraries.put("Puskin Library", puskinLibrary);
        libraries.put("Eminescu Library", eminescuLibrary);

        //Verificam daca o anumita valoare exista in Map
        String valoareaCautata = "Puskin Library";
        boolean existaValoarea = libraries.containsKey(valoareaCautata);
        System.out.println("Valoarea cautata exista in Map: " + existaValoarea);

        //Printarea cartile care se afla in libraria Eminescu Library
        libraries.get("Eminescu Library").printBooks();

        int[] integeres = new int[5];

        integeres[0] = 6;
        integeres[1] = 8;
        integeres[2] = 5;
        integeres[3] = 9;
        integeres[4] = 10;

        System.out.println("Maximul din array-ul de numere intregi este: " + IntNumberArrayService.maxIntFromArray(integeres));
        System.out.println("Media aritmetica a numerelor intregi este: " + IntNumberArrayService.arithmeticAverage(integeres));

    }
}
