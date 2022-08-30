public class deepu {
    public static void main(String[] args) throws Exception {
        int no=5;
        for(int i=no;i>0;i--){
           for(int j=i;j>0;j--){
            System.out.print("-");
           }
           System.out.println();
        }
        System.out.println();
        for(int i=1;i<=no;i++){
            for(int j=0;j<i;j++){
             System.out.print("*");
            }
            System.out.println();
         }
    }
}
