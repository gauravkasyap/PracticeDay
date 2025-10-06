public class String1 {
    public static int findHighestOccurrence(String str){
        //Implement your code here and change the return value accordingly
        int count =0;
        for (int i =0; i<str.length(); i++){
            int p =0;
            for (int j =0; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    p++;
                }
            }
            if (p>=count){
                count=p;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str = "success";
        System.out.println(findHighestOccurrence(str));
    }
}
