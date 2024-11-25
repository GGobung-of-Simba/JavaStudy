public class Study16_A {
    
    public Study16_A() {}
    public Study16_A(String msg) {
        System.out.println("화자 B : " + msg);
        run();
    }
    public void run() {

        new Study16_B("B 안녕~");

    }
}
