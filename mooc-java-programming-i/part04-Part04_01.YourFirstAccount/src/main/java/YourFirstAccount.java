
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("Arto's acconte", 100.00);

        account.deposit(20);
        System.out.println(account);
    }
}
