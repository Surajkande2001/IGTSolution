package demo51;
class Aq {

	 

    Aq() {

 

        System.out.println("Class A");

    }

}





class Bq {

 

    Bq() {

 

        System.out.println("Class B");

    }

}





class Cq {

 

    Cq() {

 

        System.out.println("Class C");

    }

}





class Temp {

 

    public static void main(String[] args) {

 

        System.out.println("Class Demo");

 

        Aq a = new Aq();

        Bq b = new Bq();

        Cq c = new Cq();

    }

}