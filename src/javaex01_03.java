public class javaex01_03 {
    public static void main(String[] arg){
        for(int table = 2; table <= 9; table = table + 2 ){
            for(int times = 1; times <= 9; times++){
                System.out.println(table + " * " + times + "=" +(table * times)+"\t");
            }
        }
    }
    
}
/*
 * for(int table%2 = 0) continue;
 * 위의 한 줄을 추가하면 가능하기도
 */