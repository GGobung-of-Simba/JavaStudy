public class Study18 {
    public static void main(String[] args){
        new Study18_C().run();
        //1
    }
}    

class Study18_C implements Study18_I {

    @Override
    public void run() {
        // 3
        System.out.println(txt);
        
    }
}

interface Study18_I {
    final String txt = "INTERFACE";
    //4
    //final : 상수값을 만드는 명령어
    public void run();
    //2
    // 추상메서드 :구체적인 구현을 하지 않는 메서드
    // 이름과 매개변수, 반환형만 선언하고, 그 메서드가 어떤 일을 해야 하는지는 나중에 이를 상속받은 **자식 클래스에서 정의(구현)**해야 합니다
    // 인터페이스 내에서 메서드에는 {}를 사용하지 못함.
    // 변수를 넣는 것은 불가능 하지만 상수를 넣는 것은 가능함.
    // 인터페이스의 추상매서드는 상속받은 클래스에서 구현해주어야함.
    // 인터페이스의 경우 
    //  - 클래스에서 인터페이스를 꼭 사용해야하기 때문에 접근제한자 private를 사용 할 수 없다.
    //=public abstract void run();
    //abstract는 생략이 가능 함. 추상
}

