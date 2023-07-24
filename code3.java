public class code3{
    public static void main(String[] args) {
        String[] strs = {"aaa","aa","aaa"};
        for(int p=0;p<strs.length;p++) {
            if (strs[p] == ""){
                
            };
        }
        String base = strs[0];
        String base1 = "";
        String base2 = "";
        for(int i = 1; i < strs.length ; i++){
            if(i==1){
            int k = base.length();
            if(base.length()>strs[i].length()){
                k = strs[i].length();
            }
            else{
                k = base.length();
            }
            for(int j = 0 ; j <= k ; j++){
                String charged = base.substring(0, j);
                String charged2 = strs[i].substring(0, j);
                if(charged.equals(charged2) == true){
                    base1 = strs[i].substring(0,j);
                    System.out.println("First word : " + base1);
                }
                else{
                    base1 = strs[i].substring(0,j-1);
                    System.out.println("First word : " + base1);
                    break;
                }
            }
            }
            else{
                int k = base.length();
                if(base.length() > strs[i].length()){
                    k = strs[i].length();
                }
                else{
                    k = base.length();
                }
                System.out.println("Second Loop");
                for(int j = 0 ; j <= k ; j++){
                     String charged = base.substring(0, j);
                     String charged2 = strs[i].substring(0, j);
                     if(charged.equals(charged2) == true){
                        base2 = strs[i].substring(0,j);
                        System.out.println("Second Word : " + base2);
                    }
                    else{
                        base2 = strs[i].substring(0,j-1);
                        System.out.println("Secondary words : " + base2);
                        break;
                     }
                     
                 }
            }
            
            }
        System.out.println("Final Value : " + base1);
        }
    }