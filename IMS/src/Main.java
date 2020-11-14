public class Main {
    public static void main(String[] args) {
        //These are just dummy values
        //Creating an object for the Product Class
        Product product1 = new Product();
        product1.name = "book";
        product1.active = true;
        product1.cost = 12;
        product1.category = "utensils";
        product1.id = "#1245";
        product1.quantity = 5;
        product1.salesPrice = 15;
        System.out.println(product1.getProfitOrLoss());
        System.out.println(product1.getThreshold());

        System.out.println();

        //Creating an object for the Customer Class
        Customer customer1 = new Customer();
        customer1.contactName = "Led Zepplin";
        customer1.contactPhone = "787878778";
        customer1.contactEmail = "led@acdc.com";
        customer1.addressStreet = "Levatan road";
        customer1.addressCity = "Cincinnati";
        customer1.addressState = "Washingnston DC";
        customer1.noOfTransactions = 5;
        customer1.id = "#42567";
        System.out.println(customer1.calculateDiscount());
        System.out.println(customer1.getAddress());
        System.out.println(customer1.getContact());
        System.out.println(customer1.getTransactions());


    }
}
