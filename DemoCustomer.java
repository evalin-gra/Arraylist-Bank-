public class DemoCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Evalinda", "Faozi");
        Customer customer2 = new Customer("Ghavan", "Faozi");
        Customer customer3 = new Customer("Ibra", "Faozi");

        Account account1 = new Account( 9000000, "00250700");
        Account account2 = new Account( 1500000, "00261100");
        Account account3 = new Account( 1000000, "00271800");

        customer1.setAccount(account1);
        customer2.setAccount(account2);
        customer3.setAccount(account3);

        System.out.println("\n--- DATA CUSTOMER ---");
        System.out.println("\nNama         : "  + customer1.getfirstName() + " " + customer1.getlastName());
        System.out.println("No. Rekening : " + customer1.getAccount(0).getAccountNumber());
        System.out.println("Saldo        : Rp" + customer1.getAccount(0).getBalance());
        System.out.println("\nNama         : "  + customer2.getfirstName() + " " + customer2.getlastName());
        System.out.println("No. Rekening : " + customer2.getAccount(0).getAccountNumber());
        System.out.println("Saldo        : Rp" + customer2.getAccount(0).getBalance());
        System.out.println("\nNama         : "  + customer3.getfirstName() + " " + customer3.getlastName());
        System.out.println("No. Rekening : " + customer3.getAccount(0).getAccountNumber());
        System.out.println("Saldo        : Rp" + customer3.getAccount(0).getBalance());
        
        //Transaksi customer 1
        System.out.println("\n--- TRANSAKSI ---");
        System.out.println("\nNama         : "  + customer1.getfirstName() + " " + customer1.getlastName());
        System.out.println("No. Rekening : " + customer1.getAccount(0).getAccountNumber());
        customer1.getAccount(0).deposit(500000);
        System.out.println("Deposit : Rp500000");
        System.out.println("Saldo setelah depposit : Rp" + customer1.getAccount(0).getBalance());
        customer1.getAccount(0).withdraw(200000);
        System.out.println("Withdraw : Rp200000");
        System.out.println("Saldo setelah withdraw : Rp" + customer1.getAccount(0).getBalance());
        //Transaksi customer 2
        System.out.println("\nNama         : "  + customer2.getfirstName() + " " + customer2.getlastName());
        System.out.println("No. Rekening : " + customer2.getAccount(0).getAccountNumber());
        customer2.getAccount(0).deposit(100000);
        System.out.println("Deposit : Rp100000");
        System.out.println("Saldo setelah deposit : Rp" + customer2.getAccount(0).getBalance());
        customer2.getAccount(0).withdraw(1700000);
        System.out.println("Withdraw : Rp1700000");
        System.out.println("Saldo setelah withdraw : Rp" + customer2.getAccount(0).getBalance());
    }

}