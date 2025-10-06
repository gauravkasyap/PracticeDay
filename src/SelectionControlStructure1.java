public class SelectionControlStructure1 {
//public static int Changes(int $1NotesAbl , int $5NotesAbl , int PurchaseAmount ){
//    int $1NotesNeed =0;
//    int $5NotesNeed =0;
//    for (int i =1 ; i<=PurchaseAmount && PurchaseAmount!=0 ; i++){
//        if (PurchaseAmount%5!=0){
//            PurchaseAmount--;
//            $1NotesNeed++;
//        } else if (PurchaseAmount%5==0) {
//            $5NotesNeed = PurchaseAmount/5;
//            PurchaseAmount=0;
//        }
//    }
//    if ($1NotesNeed<=$1NotesAbl && $5NotesNeed<=$5NotesAbl){
//        return $5NotesNeed;
//    }else {
//        return -1;
//    }
//}
    public static void main(String[] args) {
     int $1NotesAbl = 2;
     int $5NotesAbl = 4;
     int PurchaseAmount = 21;
        int $1NotesNeed =0;
        int $5NotesNeed =0;
        for (int i =1 ; i<=PurchaseAmount && PurchaseAmount!=0 ; i++){
            if (PurchaseAmount%5!=0){
                PurchaseAmount--;
                $1NotesNeed++;
            } else if (PurchaseAmount%5==0) {
                $5NotesNeed = PurchaseAmount/5;
                PurchaseAmount=0;
            }
        }
        if ($1NotesNeed<=$1NotesAbl && $5NotesNeed<=$5NotesAbl){
            System.out.println("$1 Notes Need: "+$1NotesNeed );
            System.out.println("$5 Notes Need: "+$5NotesNeed);

        }else {
            System.out.println("-1");
        }

    }
}
