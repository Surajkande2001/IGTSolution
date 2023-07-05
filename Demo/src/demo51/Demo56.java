package demo51;

class Ab {

    Ab () {

        System.out.println("Class A");

    }

   

    void abc() {

 

        int a = 10, b = 20, c = 55, res;

 

        if(a > b && a > c) res = a;

        else if(b > a && b > c ) res = b;

        else res = c;

 

        System.out.println(res);

    }

}

 

class Demo56 {

    public static void main(String[] args) {

        Ab a = new Ab();

        a.abc();

    }

}

 
