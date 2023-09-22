// Contructor Implementation

class Student{
    String name;
    
   Student(String name){
       this.name = name;
       this.display();
   } 
   
   void display(){
       System.out.println(this.name);
   }
   public static void main(String [] args){
       Student S1 = new Student("Rahul Suresh Borkar");
   }
}