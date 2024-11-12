package md.maib.serviceauto;

public class ManageAutoService {
    public static void main(String[] args) {

        //Declararea si initializarea obiectelor folosind toate tipurile de constructori
        Car mercedesBenzSeriaE = new Car("Negru", "Mercedes-Benz", "Seria E");

        //Setarea numarului de inmatriculare pentru obiectul mercedesBenzSeriaE
        mercedesBenzSeriaE.plateNumber = "B-123-CH";
        mercedesBenzSeriaE.kmWhenEnteredTheService = 110000;

        //Afisarea informatiei despre masina mercedesBenzSeriaE
        System.out.println("Masina " + mercedesBenzSeriaE.make + " de model" + mercedesBenzSeriaE.Model +
                " de culoare " + mercedesBenzSeriaE.color + " cu numarul de inamtriculare " + mercedesBenzSeriaE.plateNumber
                + " a intrat in service cu " + mercedesBenzSeriaE.kmWhenEnteredTheService + " km la bord");

        Car VWGolf = new Car("Alb", "Volkswagen", "Golf");
        Car Volvo = new Car("BMW-123-CH");
        Car vwPassat = new Car("VW-123-CH");

        //Declararea si initializarea obiectelor de tipul Tool
        Tool ciocan = new Tool("Ciocan");
        //Setarea pretului si greutatii pentru obiectul ciocan
        ciocan.weight = 1.5;
        //Afisarea informatiei despre obiectul ciocan
        System.out.println("Intrumentul cu numele " + ciocan.name + " are greutatea de " + ciocan.weight + " kg");
        
        Tool surubelnita = new Tool("Surubelnita");

        Worker ionMuncitor = new Worker();

        Garage garageBavaria = new Garage();

    }
}
