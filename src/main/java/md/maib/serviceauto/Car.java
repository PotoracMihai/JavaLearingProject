package md.maib.serviceauto;

public class Car {
    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String make;
    String Model;

    //Constructorul de mai jos primeste 3 parametri de intrare, in rezultat se va crea un obiect de tipul Car
    //Despre care vom cunoaste culoarea, marca si modelul
    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        Model = model;
    }

    //Acest constructor va crea un obiect de tipul Car despre care vom cunaoste doar numarul de inmatriculare
    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
