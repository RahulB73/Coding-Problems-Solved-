// Block in the Java

class Demo{
    String name;
    int sal;
    
    {
        System.out.println("This is Static block");
        name = "Rahul";
        sal = 25000;
    }
    
    public static void main(String [] args){
        Demo D1 = new Demo();
        System.out.println(D1.name);
        System.out.println(D1.sal);
    }
}