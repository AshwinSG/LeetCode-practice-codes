public class code5{
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int ans = 0;
        for(int i = 0; i < nums.length ; i++){
            if(target > nums[i]){
                ans = i+1;
            }
            else if(target <= nums[i] || (i == nums.length - 1)){
                ans = i;
                break;
            }
            else{

            }
        }
       System.out.println(ans);
    }
}