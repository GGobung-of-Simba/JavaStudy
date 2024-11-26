import java.util.ArrayList;
import java.util.List;

public class Study21 {
    public static void main(String[] arg) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("일");
        list.add("one");

        // 문제. one를 출력하라
        System.out.println(list.get(2));
        
        // 문제. 리스트에서 인덱스 1을 삭제 후 one를 출력하라
        list.remove(1);
        System.out.println(list.get(1));
    }
    
}
