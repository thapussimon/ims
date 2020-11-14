public class Customer {
    //This is a dummy Customer class, This will be modified further
    String id;
    String contactName;
    String contactPhone;
    String contactEmail;
    String addressState;
    String addressCity;
    String addressStreet;

    int noOfTransactions;

    public int getTransactions() {
        return noOfTransactions;
    }

    public float calculateDiscount() {
        return (float) (noOfTransactions * 0.1);
    }

    public String getAddress() {
        return addressStreet + ", " + addressCity + ", " + addressState;
    }

    public String getContact() {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }

}
