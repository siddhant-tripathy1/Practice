public class bank {
 private String number;
 private double balance;
 private String customerName;
 private String customerEmailId;
 private String customerPhoneNumber;
 public void deposit(double depositAmount){
  this.balance +=depositAmount;
 }
 public void withdrawal(double withdrawalAmount){
  if(this.balance-withdrawalAmount <0){
   System.out.println("insufficient funds");
  } else {
   this.balance-=withdrawalAmount;
  }
 System.out.println(this.balance);
 }


 public String getCustomerEmailId() {
  return customerEmailId;
 }

 public void setCustomerEmailId(String customerEmailId) {
  this.customerEmailId = customerEmailId;
 }

 public String getNumber() {
  return number;
 }

 public void setNumber(String number) {
  this.number = number;
 }

 public String getCustomerPhoneNumber() {
  return customerPhoneNumber;
 }

 public void setCustomerPhoneNumber(String customerPhoneNumber) {
  this.customerPhoneNumber = customerPhoneNumber;
 }

 public String getCustomerName() {
  return customerName;
 }

 public void setCustomerName(String customerName) {
  this.customerName = customerName;
 }

 public double getBalance() {
  return balance;
 }

 public void setBalance(double balance) {
  this.balance = balance;
 }
}
