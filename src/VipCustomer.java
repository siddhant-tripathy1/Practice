public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email_address;

 public VipCustomer() {
     this("Default Name", 5000.00 ,"SIDDHANT.TRIPATHY5@GMAIL.COM");
 }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit,"unkwon");
    }

    public VipCustomer(String name, double creditLimit, String email_address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email_address = email_address;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail_address() {
        return email_address;
    }
}
