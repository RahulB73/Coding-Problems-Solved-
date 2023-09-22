 // Object Creation in java
 
class Laptop {
    String name;
    String processor;
    int price;
    
    Laptop(String name, String processor, int price) {
        this.name = name;
        this.processor = processor;
        this.price = price;
    }
    
    public void print() {
        System.out.println(name);
        System.out.println(processor);
        System.out.println(price);
    }
    
    public static void main(String[] args) {
       Laptop L1 = new Laptop("Acer", "Ryzen", 32000);
       L1.print();
       System.out.println("------------");
       
       Laptop L2 = new Laptop("Asus", "AMD", 35000);
       L2.print();
       System.out.println("------------");
       
       Laptop L3 = new Laptop("HP", "Intel", 39000);
       L3.print();
    }
}


