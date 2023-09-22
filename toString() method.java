// toString() method to print content of Object
// toString() method is the part of the object class which is the parent class of every class
// toString() method usualy print the address of the object 
// Automatically called

class Demo{
    String name;
    int sal;
    
    Demo(String name, int sal){
        this.name= name;
        this.sal = sal;
    }
    
    // toString method overriding
    public String toString(){
        return this.name + " " + this.sal;
    }
    
    public static void main(String [] args){
        Demo D1 = new Demo("Rahul", 25000);
        Demo D2 = new Demo("Kunal", 27000);
        Demo D3 = new Demo("Raju", 29000);
        
        Demo x[] = {D1,D2,D3};
        for(int i=0; i<=x.length-1;i++){
            System.out.println(x[i]); // Print address if we don't override toString method
        }
    }
}