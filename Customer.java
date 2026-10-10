public class Customer {
    private String firstName, lastName;
    private Account [] acc = new Account [5];
    private int numberOfAccounts = 0;

    public Customer (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setAccount(Account acc) {
        if (numberOfAccounts < 5) {
            this.acc[numberOfAccounts] = acc;
            numberOfAccounts++;
        }
    }
    public Account getAccount(int accountIndex) {
        return this.acc[accountIndex];
        }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}