public class code4{
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        if(needle.length() > haystack.length()){
            System.out.println(-1);
        }
        for(int i=0 ; i < haystack.length() ;i++){
            int k = i;
            for(int j=0 ; j < needle.length(); j++){
                System.out.println(j);
                System.out.println(k);
                if(k > haystack.length()-1 ){
                    break;
                }
                if(needle.charAt(j) == haystack.charAt(k) && j == needle.length()-1){
                    System.out.println("Equal");
                    System.out.println(i);
                    break;
                }
                else if(needle.charAt(j)==haystack.charAt(k)){
                    System.out.println("Equal");
                    k = k+1;
                }
                else{
                    break;
                }
            }
        }
    }
}