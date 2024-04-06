public class Main {
    public static void main(String[] args) {

        Invoice factura = new Invoice(2,"zapatillas", 3, 35.93);
        factura.getInvoiceDetails();
        System.out.println("El precio final de la factura es: " + factura.getInvoiceAmount() + "€");

        Invoice factura2 = new Invoice(5,"Cacerolas",5,19.99);
        factura2.setPartNumber(12);
        factura2.setPrice(17.99);
        factura2.setPartDescription("Cacerolas en oferta!!!");
        factura2.getInvoiceDetails();

    }
}