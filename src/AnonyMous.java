public class AnonyMous {
    public static void main(String[] args) {
        Test t = new Test() {
        void print() {
            System.out.println("익명 클래스에서 오버라이딩");
        }
        };
        t.print();
        t.test();

    }
}
class Test {
    int val = 1;
    String str = "abc";

    void print() {
        System.out.println("부모 클래스 print 메서드");
    }

    void test() {
        System.out.println("부모 클래스 test 메서드");
    }
}

