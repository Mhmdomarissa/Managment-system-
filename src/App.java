public class App { 
    public static void main(String[] args)throws Exception{
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        bank1.name = "Audi";
        bank2.name = "Franca";

        Account a1 = new Account();

        Client c1 = new Client();

        a1.balance = 100 ; 
        a1.id = "123";

        c1.accountNumber = "123";
        c1.name = "Omar";
        System.out.println(bank1.name);
        System.out.println(bank2.name);


    }
}