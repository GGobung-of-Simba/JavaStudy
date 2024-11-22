public class Javaex01_02 {
    public static void main(String[] arg){
    String a = "자바";
    String b = new String("자바");
    String c = "자바";
    String d = new String("자바");
    if(a == b) {
        System.out.println("참");
    } else {
        System.out.println("거짓");
    }
    if(a == c){
        System.out.println("참");  
    } else{
        System.out.println("거짓");
        /*string, 참조자료형, 어딘가에 저장된 주소 값이 있음
        new string 새로운 어딘가에 저장됨
        아니라면 프린트 데이터를 수정해야함.
        equals를 이용해서 출력을 하면 데이터 값만으로 비교 할 수 있음. 
        System.out.println(a.equals b)
        */
    }
    if(b == d){
        System.out.println("참");
    }else{
        System.out.println("거짓");
    }
    System.out.println(b);
    System.out.println(d);
    
    }
}
/*리터럴 표기방식의 자바는 "임지은"이라는 글자 자체 (값)을 말한다면 (작명소에서 이름가지고옴)
 * new를 사용한상태에서의 값 임지은은 사용할 때마다 임지은이라는 사람이 생긴다고보면됨.
 * b의 임지은이 서울 서대문구 임지은이라면
 * c의 임지은은 경기도 어디의 임지은
 * 추가로 계속 만들게 되면 임지은이라는 사람(객체)가 계속해서 생겨나는 개념
 */
