public class Study08 {
    public static void main(String[] arg){

        int[] a = new int[5];    // int a[];와 int[] a;는 같은 뜻임
        // 배열 a는 항이 5개가 들어가는 배열을 만든 것.
        // 배열에 위치값을 지정해줘야함. 이게 index
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        System.out.println(a[2]);

        int b[] = new int[] {6,7,8,9,10};
        //System.out.println(b[3]);

        //배열 안에 있는 데이터 교체해보기
        b[0] = 11;
  
        System.out.println(b[0]);
        System.out.println(b);

    }
    
}
