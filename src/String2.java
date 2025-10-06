public class String2 {
    public static String removeDuplicateSandSpaces(String str){
        //Implement your code here and change the return value accordingly
        StringBuilder newString = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char ch= str.charAt(i);

            if (ch == ' ') continue;

            if (newString.indexOf(String.valueOf(ch))==-1){
                newString.append(ch);
            }

        }

        return newString.toString();
    }

    public static void main(String args[]){
        String str = "object oriented programming";
        System.out.println(removeDuplicateSandSpaces(str));
    }
}
