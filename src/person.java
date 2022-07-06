public class person {
    public static void main(String[] args) {
       VipCustomer customer1 = new VipCustomer();
       VipCustomer customer2 = new VipCustomer("siddhant",2009.00);
       VipCustomer customer3 = new VipCustomer("sex",2009.00,"siddhant.tripathy4@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());

    }



}
