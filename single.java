class Super {
    void show() {
        System.out.println("I am in superclass");
    }
}

class Sub extends Super {
    void display() {
        System.out.println("I am in CSM A");
    }
}

class Inherit {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.show();
        obj.display();
    }
}
