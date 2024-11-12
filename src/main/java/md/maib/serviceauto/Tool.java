package md.maib.serviceauto;

public class Tool {

    double price;
    String name;
    double weight;

    public Tool(String name) {
        this.name = name;
        System.out.println("O noua unealta a fost creata, numele ei este: " + this.name);
    }

    public Tool(){
        System.out.println("O noua unealta a fost creata in cadrul programului. Nu dispune despre detaliile ei" + " pentru detalii Numele este " + this.name + " iar greutatea este " + this.weight);
    }
}
