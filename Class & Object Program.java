class Customer{
    String name;
    int Balance;
    boolean parncard;
    long phone;
    int pin;
    
    Customer(String name, int balance, boolean parncard,long phone,int pin){
        this.name = name;
        this.Balance = balance;
        this.parncard = parncard;
        this.phone = phone;
        // this.pin = pin;
        this.Setpin(pin);
    }
    
    void Setpin(int p){
        if(p>=1000 && p<=9999){
            this.pin = p;
            System.out.println("Pin is set");
        }
        else{
             System.out.println("Entered pin is more than 4 digits");
        }
    }
    
    void Deposite(boolean parncard, int amount){
        if(amount <= 10000){
            if(parncard == true){
                this.Balance += amount;
                System.out.println("Amount is deposited");
            }
            else{
                 System.out.println("Link you pan card first");
            }
        }
        else{
           this.Balance += amount; 
           System.out.println("Amount is deposited");
        }
    }
    
    void Withdraw(int pin, int amount, boolean pancard){
        if(this.pin == pin){
            if(amount <= 10000){
                if(pancard == true){
                    this.Balance -= amount;
                    System.out.println("Amount is Withdrawed");
                }
                else{
                     System.out.println("Link Pancard first");
                }
            }
            else{
                this.Balance -= amount;
                System.out.println("Amount is Withdrawed");
            }
        }
        else{
            System.out.println("Pin is incorrect");
        }
    }
    
    void checkBalance(int pin, int Bankcode){
        if(this.pin == pin){
            if(Bankcode == 10 && Bankcode == 20){
                if(this.Balance > 10000){
                    int b = 10000-Balance;
                    System.out.println("You need to add" + b + "amount to you bank account");
                }
                else{
                    System.out.println("Your amount is " + Balance);
                }
            }
            else{
                System.out.println("Your amount is " + Balance);
            }
        }
        else{
            System.out.println("Pin is incorrect");
        }
    }
    
    public static void main(String [] args){
        Customer C1 = new Customer("Rahul", 0, true, 738789, 1234);
        C1.Deposite(true, 10000);
        C1.Withdraw(1234, 3000, true);
        C1.checkBalance(1234, 10);
    }
} 
