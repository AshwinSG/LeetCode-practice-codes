import java.util.Scanner;

public class code6{
    public static void main(String[] args) {
        Scanner myval = new Scanner(System.in);
        int count = myval.nextInt()+1;
        int[] new_array = new int[count*2];

        int counter = 0;

        for(int i = 0 ; i < count*2 - 6 ; i++){
            new_array[i] = myval.nextInt(); 
        }
        for(int k=0 ; k < count*2 ;k = k+2){
            if(new_array[k]+1 == new_array[k+3] && new_array[k+1]+1 == new_array[k+4] && new_array[k+2] == new_array[k] && new_array[k+1]==new_array[k]+1){
                counter = counter + 1;

            }
            else if(new_array[k]-1 == new_array[k+3] && new_array[k+1]-1 == new_array[k+4]){
                counter = counter + 1;
            }
        }
    }
}