class A extends Thread {
    public void run() {
        try {
            for (int i= 1; i <= 10; i++) {
                System.out.println("I: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
        }
    }
}

 

class B extends Thread {
    public void run() {
        try {
            for (int j= 1; j <= 10; j++) {
                System.out.println("    J: "+ j);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
        }
    }
}

 

class C extends Thread {
    public void run() {
        try {
            for (int k= 1; k <= 10; k++) {
                System.out.println("        K: "+ k);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
        }
    }
}

 

class Main {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();
    }
}

 