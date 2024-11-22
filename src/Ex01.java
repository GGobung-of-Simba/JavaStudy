public class Ex01 {

    public static void main(String[] arg){

        String[] a = new String[10];
        for (int i = 0; i <a.length; i++){
            System.out.println(i);
            if (i%2 == 0){
                a[i] = "o";
            }else{
                a[i] = "x";
            }
           // System.out.println(a[i]);
        }

    }
}

        
        
