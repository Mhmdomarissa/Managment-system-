puplic class Bank {
    public String name ;

    public Bank(String name){
        System.out.println("The Bank"+ name +  "is being Created ");
        this.name = name ; 
    }


    public void greet(Client client){
        System.out.println("Hello mr "+client.name + " ,Welcome to bank"+ this.name);
    }
}
