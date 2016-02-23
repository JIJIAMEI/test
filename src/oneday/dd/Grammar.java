package oneday.dd;

public class Grammar {
    Grammar() {
        System.out.println("-_-  555");
        System.out.println("-_-  eee");
    }

    static {// 111-aaa
        System.out.println("static 111");
        System.out.println("static aaa");
    }
    {// 222-bbb
        System.out.println("static 222");
        System.out.println("static bbb");
    }
    static {// 333-ccc
        System.out.println("static 333");
        System.out.println("static ccc");
    }
    {// 444-ddd
        System.out.println("static 444");
        System.out.println("static ddd");
    }

    public static void main(String[] args) {
         new Grammar();
    }
}
