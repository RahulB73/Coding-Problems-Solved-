// Generalization in Java

class Watch {
    String model;
    String color;
    int price;

    Watch(String m, String c, int p) {
        this.model = m;
        this.color = c;
        this.price = p; 
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.price;
    }
    
    void display(){
        System.out.println(this.model + " " + this.color + " " + this.price);
    }
}

class Sonata extends Watch {
    Sonata(String m, String c, int p) {
        super(m, c, p);
    }
}

class Titan extends Watch {
    Titan(String m, String c, int p) {
        super(m, c, p);
    }
}

class Main {
    public static void main(String[] args) {
        Sonata S1 = new Sonata("Sonata", "Black", 1200);
        Titan T1 = new Titan("Titan", "White", 1300);
        Watch x[] = { S1, T1 };
        for (Watch i : x) {
            System.out.println(i);
        }
        for(int i=0;i<=x.length-1;i++){
             x[i].display();
        }
    }
}
