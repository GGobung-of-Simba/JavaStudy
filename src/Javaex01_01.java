public class Javaex01_01{
    public static void main(String[] arg){
        int a = 10;
        boolean b = false;
        int booleanb = b ? 1 : 0;
        String inta = "10";
        System.out.println(a); //10이 출력 됨.
        System.out.println(b); //false가 출력 됨.
        System.out.println(booleanb); //0이 출력 됨.
        System.out.println(inta); //0이 출력 됨.

        System.out.println(a+booleanb); //10+0=10
        System.out.println(inta+b); //10false가 출력됨.
        //불린은 밸류값이 아닌 논리값만 있기 때문에 연산이 안됨. t/f 사실관계만 나타내줌
        //자바에서만 그럼
    }
        /*
        int a = 10;
        boolean b = false;
        System.out.println(a);  //10으로 출력 (수)
        System.out.println(b);  //false로 출력된다. (문)

        a와 b를 + 연산자로 연산하려면 두 값 모두가 수여야 한다.
        b를 0 또는 1로 출력값을 내기 위한 추가 코드를 만든다.
    } */
      
}