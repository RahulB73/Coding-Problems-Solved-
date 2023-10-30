class ConstructorChaining{
    ConstructorChaining(int x){
        System.out.println("This is ConstructorChaining Class constructor");
    }
}

class Derived extends ConstructorChaining{
    Derived(){
        this();
        super(21);
        System.out.println("This is Derived Class constructor");
    }
    
    
    
    public static void main(String [] args){
        Derived D1 = new Derived();
    }
}