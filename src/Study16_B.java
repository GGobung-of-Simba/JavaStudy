public class Study16_B {
    public Study16_B(String msg) {
        System.out.println("화자 A : " + msg);
        run();
    }
    public void run() {
        new Study16_A("A 안녕하세용");
    }
}
