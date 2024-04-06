//Clase
public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;


    //Constructor
    public Invoice (int partNumber, String partDescription, int quantity, double price) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0){
            this.quantity = quantity;
        }else{this.quantity = 0;}

        if (price > 0){
            this.price = price;
        }else{this.price = 0.0;}

    }


    //Metodos
    public void getPartNumber() {
        System.out.println("El número de pieza es: " + partNumber);
    }
    public void getPartDescription() {
        System.out.println("Descripción de la pieza: " + partDescription);
    }
    public void getQuantity() {
        System.out.println("Cantidad de piezas: " + quantity);
    }
    public void getPrice() {
        System.out.println("Precio: " + price);
    }

    public void getInvoiceDetails(){
        System.out.println("====================");
        System.out.println("Número de pieza: " + partNumber);
        System.out.println("Descripción:     " + partDescription);
        System.out.println("Cantidad:        " + quantity);
        System.out.println("Precio:          " + price+"€");
        System.out.println("---------------------");
        System.out.println("Total factura:   " + getInvoiceAmount()+"€");
        System.out.println("====================");
        //getPartNumber();
        //getPartDescription();
        //getQuantity();
        //getPrice();
        //System.out.println(getInvoiceAmount());
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
        System.out.println("Nuevo número de pieza: " + partNumber);
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
        System.out.println("Nueva descripción de la pieza: " + partDescription);
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        System.out.println("Nueva cantidad de piezas: " + quantity);
    }
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Nuevo precio: " + price);
    }

    public double getInvoiceAmount(){
        double amount = Math.round((quantity * price)*100.0)/100.0;
        return amount;
    }
}


