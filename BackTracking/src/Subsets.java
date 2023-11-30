public class Subsets {
    public static void printSubsets(String e,String ans,int i){
        if(i==e.length()) {
            if(ans.isEmpty())
                System.out.println("null");
            System.out.println(ans);
            return;
        }
        printSubsets(e,ans+e.charAt(i),i+1);
        printSubsets(e,ans,i+1);
    }

    public static void main(String[] args) {
        String a = "abc";
        printSubsets(a,"",0);
    }
}
