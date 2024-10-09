package homeworks.first;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }
    public void sayMeow() {
        System.out.println("meow");
    }
    public void sayMeow(int n) {
        if (n <= 0) return;
        StringBuilder out =  new StringBuilder();
        while (n > 1) {
            out.append("meow-");
            n--;
        }
        out.append("meow");
        System.out.println(out);
    }
    @Override
    public String toString() {
        return "кот: " + name;
    }
}

class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        cat.sayMeow();
        cat.sayMeow(3);
    }
}
