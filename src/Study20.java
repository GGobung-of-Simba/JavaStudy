import java.util.ArrayList;
import java.util.List;

public class Study20 {
    

    public static void main(String[] arg) {
        List list = new ArrayList<>();
        list.add(1); //index 0 정수값
        list.add("1"); //index 1 문자값
        list.add(true); //index 2 논리값
        // <>내부에는 자료형을 넣는 곳
        // 해당 자료형에 대한 리스트라는 것을 의미한다.
        // <>가 비어있으면 서로다른 자료형을 담을 수 있다.
        /* 예시
         * list.add(1);
         * list.add("1");
         * list.add(true);
        */
        
        //System.out.println(list.get(1) instanceof integer);
        //System.out.println(list.size());

        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(0) instanceof String);
        System.out.println(list);




    }
}
