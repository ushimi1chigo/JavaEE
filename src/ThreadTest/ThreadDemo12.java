package ThreadTest;

public class ThreadDemo12 {
    public static void main(String[] args) {
        Thread t = new Thread(){
          @Override
          public void run(){
              System.out.println(Thread.currentThread().getId());
              System.out.println(this.getId());
          }
        };
        //这个代码中，得到的就是t这个引用，也就相当于是在run中直接使用this
        t.start();
    }
}
