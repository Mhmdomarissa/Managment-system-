public class App { 
    public static void main(String[] args)throws Exception{
        Bank bank1 = new Bank("Audi");
        Bank bank2 = new Bank("Franca");

        Account a1 = new Account("123",100);

        Client c1 = new Client("Sami","123");





        bank1.greet(c1);
        bank2.greet(c1);

    }
}