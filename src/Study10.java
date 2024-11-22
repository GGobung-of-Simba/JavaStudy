public class Study10 {
    public static void main(String[] arg){

        String[] table1 = new String[9];
        for(int i = 1; i<=table1.length; i++){
            //System.out.prinln(1 + "*" + i + "=" + (1*i))
            table1[i-1] = (1 + "*" + i + "=" + (1*i));
            System.out.println(table1[i-1]);
            //index는 0부터
        }
    }
    
}
