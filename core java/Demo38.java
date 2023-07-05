class A {

 

    int ss=0;
    int mm=0;
    int hh=0;
    void abc(){
    try{
        for (int i=0;i<10000;i++){
        if(i==5){
            mm++;
            i=0;
            }
        System.out.printf("%02d:%02d:%02d%n", hh, mm, i);
        Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){}
}
}

 

class demo38{
public static void main(String args[]){

 

    A a = new A();
    a.abc();
}

 

}