package oneday.dd;

class A implements Runnable {
    public A(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    private Object a;
    private Object b;

    @Override
    public void run() {
        synchronized (a) {
            System.out.println(Thread.currentThread().getName());
            synchronized (b) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}

class B implements Runnable {
    public B(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    private Object a;
    private Object b;

    @Override
    public void run() {
        synchronized (b) {
            System.out.println(Thread.currentThread().getName());
            synchronized (a) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}

public class Abc {
    public static void main(String[] args) {
        // 死锁
        Object a = new Object();
        Object b = new Object();
        Thread t1 = new Thread(new A(a, b));
        Thread t2 = new Thread(new B(a, b));
        t1.start();
        t2.start();
    }

}
