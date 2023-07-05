package demo51;

class ABBB {

	 

    void draw() {
        System.out.println("Draw() method: ");
    }

 

    void draw(int a) {
        System.out.println("Draw() method: " + a*a);
    }

 

    void draw(int l, int b) {
        System.out.println("Draw() method: " + l*b);
    }
}

 

class Demo18 {

 

    public static void main(String[] args) {

 

        ABBB a = new ABBB();
        a.draw();
        a.draw(10);
        a.draw(10, 20);
    }
}