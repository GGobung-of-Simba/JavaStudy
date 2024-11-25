public class Study17 {

    public static void main(String[] arg){
        S17A s17a = new S17A();
        S17B s17b = new S17B();
        
        //1빠로 만듦
        //s17a.run();
        //s17b.run();
        s17b.call(s17a, s17b);        
       
    }
    
}
class S17AB{
    public void run() {
        System.out.println(this + "안녕하세요");
        // 위의 this는 각 각 자식의 값임.
    }
}

class S17A extends S17AB {
    public void call(S17A s17a, S17B s17b) {
        s17a.run();
        s17b.call(s17a, s17b);
    }

}

class S17B extends S17AB {
    public void call(S17A s17a, S17B s17b) {
        s17b.run();
        s17a.call(s17a, s17b);
    }

}
