public class code7 {
    public static void main(String[] args) {
        
        int[] nums = {5,4,-1,7,8};
        
        int len_arr = nums.length;
        
        int max = 0;
         
        for(int k = 0 ; k < len_arr ; k++) {
            for(int j = 0; j < len_arr - k ; j++){
                int sum = 0;
                for(int l = 0; l <= k ; l++ ){
                    sum = sum + nums[j + l]; 
                    System.out.println(nums[j + l]);
                    }
                if(sum>max){
                    max = sum;
                }
                System.out.println("Sum is "+sum);
                }
                System.out.println("Value of k is now added "+k);
        }
        System.out.print(max);
    }
}
