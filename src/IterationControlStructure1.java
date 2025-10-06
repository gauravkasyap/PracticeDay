import java.util.Scanner;

public class IterationControlStructure1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int X = sc.nextInt() ;

        Scanner pc = new Scanner(System.in);
        System.out.print("Enter Y: ");
        int Y = pc.nextInt();
        int Q = X;
        int P =X;

        for (int i= 0; i<Q; i++ ){
            int g = Q%10;
            P *=g;
            Q/=10;
        }

        if (P==Y){
            System.out.println(X+" is a seed of "+Y);
        }else {
            System.out.println(X+" is not a seed of "+Y);
        }
    }
}
