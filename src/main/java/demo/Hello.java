package demo;

public class Hello {

    public static void main(String[] args) throws InterruptedException {
        boolean test = true;
        while (test) {
            new User().hello();
            Thread.sleep(1000L);
        }
    }

}

class User {
    public void hello() {
        System.out.println("Hello, user!!!~~~！！");
    }
}
