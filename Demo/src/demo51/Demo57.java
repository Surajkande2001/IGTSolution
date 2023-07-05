package demo51;

class Ax {

    int a1 = 10;

}

 

class Bx extends Ax {

   

    int a1 = 100;

    void xyz(int a1) {

 

        System.out.println(a1);

        System.out.println(this.a1);

        System.out.println(super.a1);

    }

}

 

class Demo57 {

 

    public static void main(String[] args) {

       

        Bx b = new Bx();

        b.xyz(1000);

    }

}