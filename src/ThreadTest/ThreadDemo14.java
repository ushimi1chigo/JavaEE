package ThreadTest;

public class ThreadDemo14 {
    static int a = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(){
          @Override
          public void run(){

              while (a < 100) {
                  System.out.println("线程1 " + a++);
//                  Thread.yield();
              }
          }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                int b = 0;
                while (b < 100){
                    System.out.println("线程2 " + b++);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
