import java.util.Scanner;

public class SelectionControlStructure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day: ");
        int Day = sc.nextInt() ;

        Scanner pc = new Scanner(System.in);
        System.out.print("Enter Month: ");
        int Month = pc.nextInt();

        Scanner dc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = pc.nextInt();

        if(Day<=31 && Month <=12){
            System.out.println("Date: "+Day+"-"+Month+"-"+"20"+year);
        }else{
            System.out.println("input date is invalid");
        }
    }
}
