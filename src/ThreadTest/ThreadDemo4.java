package ThreadTest;

public class ThreadDemo4 {
    public static void main(String[] args) {
        //这个语法就是匿名内部类
        //相当于创建了一个匿名的类，这个类继承了Thread
        //此处new的实例，是Thread的新的子类的实例
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("hi Thread");
            }
        };
        t.start();
    }
}
