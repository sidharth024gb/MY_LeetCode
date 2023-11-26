import java.util.Scanner;  
import java.util.HashMap; 


public class Two_Sum{
    public static void main(String[] args){
        int target,i=0,n;
        int[] final_out = new int[2];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elemrnt count:");
        n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Enter the target:");
        target = sc.nextInt();

        Solution s = new Solution();
        final_out [0]= s.twoSum(array,target);
        System.out.println(final_out[0]);
    }
}
class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<Integer,Integer>();
        //int[] array = new int[2];
        for(int i=0;i<nums.length;i++){
            int current_value = nums[i];
            int find_value = target - current_value;

            if(seen.containsKey(find_value)){
                return new int[] {seen.get(find_value),i};
                //array[0]=seen.get(find_value);
                //array[1]=i;
                //System.out.println(array);
            }
            else{
                seen.put(nums[i],i);
            }
        }
        return null;
    }
}
