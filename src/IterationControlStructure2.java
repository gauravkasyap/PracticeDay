import java.util.Scanner;

public class IterationControlStructure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digits: ");
        int X = sc.nextInt();
        int p =X;
        int count =0;
        int V=0;
        while (p > 0) {
            count++;
            p /= 10;
        }
        int j = X;
        if (count%2==0){
            for (int i = 1; i<j; i++){
                if (i%2!=0) {
                    int h = j%10;
                    V += Math.pow(h,2);
                }
                j/=10;
            }
        } else if (count %2!=0) {
            for (int i = 1; i<j; i++){
                if (i%2==0) {
                    int h = j%10;
                    V += Math.pow(h,2);
                }
                j/=10;
            }
        }else {
            V=1;
        }

        if (V%9==0 && V!=0){
            System.out.println(X+" is a lucky number");
        }else {
            System.out.println(X+ " is not a lucky number");
        }
    }
}
