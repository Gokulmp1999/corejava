package HackerRank;

public class SolutionForRegex {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String s ="He is a very very good boy, isn't he?";
        // Write your code here.
        String[] tokens = s.split("[^a-zA-Z]");
       int tokenLength=0;

       for(int i=0;i< tokens.length;i++){
           if(tokens[i].length()>0){
               tokenLength++;
           }
       }
        System.out.println(tokenLength);
       for (int i=0;i<tokens.length;i++){
           if(tokens[i].length()>0){
               System.out.println(tokens[i]);
           }
       }

    }
}
