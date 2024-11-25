public class Study14 {
    public static void main(String[] arg){
        A a = new A();
        /*참조자료형
         * 힙메모리 어딘가에 저장 됨.
         */
        System.out.println(a);
        //new A();
        /*생성자 선언
        A()가 기본 생성자임
        ()안에 뭘 넣으면 기본생성자가 사라지고 새로운 생성자가 생기는 것이기 때문에 그렇다면 생성자 만들어줘야함.
        */
    }
    
}

class A {
    public A(){}
    public A(int a){}
    public A(int a, int b){}
    public String toString(){
        /* */
        return "A클래스 객체 생성 완료";
    }
    /*()안에 뭘 넣으면 기본생성자가 사라지고 새로운 생성자가 생김.
    그렇기 때문에 기본생성자를 작성해주어야 오류가 나지 않음
    생성자는 무한히 많이 만들 수 있음.
    ()안에 변수안에 같은 자료형을 넣으면 안됨. 동일한 생성자이기 때문
    하지만 3번의 생성자의 경우처럼이라면 만들 수 잇음.
    */
}