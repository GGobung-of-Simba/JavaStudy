public class Study15_01 {

    int a;
    int b;

    public Study15_01() {}
    public Study15_01(int a, int b){
        this.a = a;
        this.b = b;
        /*전역변수 안에 있는 지역변수를 전역변수에 넣어라
         * 생성자를 만들 때 쓰는 기본 문법
         */
    }/*중괄호 안에만 있는 변수 ->지역변수
    */
    public String toString() {
        return "a:" +a+", b:"+b;
    

    }
}
