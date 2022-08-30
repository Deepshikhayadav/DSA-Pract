public class deepu {
    public static void main(String[] args) throws Exception {
        int no = 5;

        /* 
         *  -----
            ----
            ---
            --
            -
         */
        for (int i = no; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("-");
            }
            System.out.println();
        }

        /* 
            *
            **
            ***
            ****
            *****
 */
        System.out.println();

        for (int i = 1; i <= no; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

 /*     *****
        *   *
        *   *
        *   *
        *****   */

        for (int i = 0; i < no; i++) {
            for (int j = 0; j < no; j++) {
                if (i == 0 || i == (no - 1) || j == 0 || j == (no - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  
        }
    
        System.out.println();  

        /* 
        
    *
   ***
  *****
 *******
*********
         */
        for (int i = no-1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <no-i; j++) {
                System.out.print("*");
            }
           // System.out.println();
           
            for (int j = 1; j < no-i; j++) {
                System.out.print("*");
            }
            System.out.println();
           
        }
        System.out.println();

        /* 
        1
        12
        123
        1234
        12345
 */
        for (int i = 0; i <= no; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    
        System.out.println();
            /* 
            12345
            1234
            123
            12
            1
            */
        for (int i = no; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        /* 
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15 
         */
        int counter=1;
        for (int i = 0; i <= no; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    
        System.out.println();
    /* 
    1
    01
    101
    0101
    10101
     */
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    
        System.out.println();
    

        /* 
    xxxxxx
   xxxxxx
  xxxxxx
 xxxxxx
xxxxxx
         */
    for(int i=no-1;i>=0;i--){
        for(int j=i;j>0;j--){
            System.out.print(" ");
        }
        for(int j=no;j>=0;j--){
            System.out.print("x");
        }
        System.out.println();
    }
    
    }   
}

