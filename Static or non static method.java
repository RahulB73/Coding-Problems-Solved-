// Static and non-static methods and properties in java

class Main{
    static String name;
    static int data;
    
    static void Init(String n, int d){
        name = n;
        data = d;
    }
    
    public static void main(String [] args){
        Init("Rahul")
    }
}
