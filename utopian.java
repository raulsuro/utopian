import java.util.Scanner;

public class Solution {
    
   static int crece(int ciclos, int tam) {       
       if(ciclos==0){
           return 1;
       }else{
           if(ciclos==1){
              return 2;           
           }else{
               for(int i=1; i<=ciclos; i++){
                   if(i%2!=0){
                      tam *= 2;
                   }else{
                      tam+=1;
                   }
               }
              return tam;
           }
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0; i<N; i++){
            int ciclos = scanner.nextInt(); 
            System.out.println(crece(ciclos,1));            
        }
    }
}
 
