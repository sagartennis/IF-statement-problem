import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a = input.nextInt();
        
    
        if(a % 2 ==0){
            System.out.println("The number entered is even");
        } else {
            System.out.println("The number entered is odd");
        }
    
    }

}
