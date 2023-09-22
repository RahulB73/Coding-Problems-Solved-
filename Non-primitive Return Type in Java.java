// Non-primitive Return Type in Java
// toString() method to access the object data and behaviour using object name


class Watch {
    String name;
    String color;
    int price;

    Watch(String n, String c, int p) {
        this.name = n;
        this.color = c;
        this.price = p;
    }

    public String toString() {
        return this.name + " " + this.color + " " + this.price;
    }
}

class Titan extends Watch {
    Titan(String n, String c, int p) {
        super(n, c, p);
    }
}

class Sonata extends Watch {
    Sonata(String n, String c, int p) {
        super(n, c, p);
    }
}

public class Main {
    static Titan getTitan() {
        Titan T1 = new Titan("Titan", "Black", 20000);
        return T1;
    }

    static Sonata getSonata() {
        Sonata S1 = new Sonata("Sonata", "White", 20000);
        return S1;
    }

    public static void main(String[] args) {
        Titan x1 = getTitan();
        System.out.println(x1);
        Sonata x2 = getSonata();
        System.out.println(x2);
    }
}
