import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner; 


public class Two_Sum{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); 
        try {
            
            int target,i,n;
        
            System.out.println("Enter the array elemrnt count:");
            n = read.nextInt();

            int[] array = new int[n];

            System.out.println("Enter the array elements:");
            for(i=0;i<n;i++){
                array[i]=read.nextInt();
            }

            System.out.println("Enter the target:");
            target = read.nextInt();

            Solution s = new Solution();
            int[] result = s.twoSum(array, target);
            if (result != null) {
                System.out.println("Indices of the two numbers: " + Arrays.toString(result));
            } 
            else {
            System.out.println("No two numbers found that sum up to the target.");
            }
        }
        finally {
            read.close();
        }
    }
}
class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int current_value = nums[i];
            int find_value = target - current_value;

            if(seen.containsKey(find_value)){
                return new int[]{seen.get(find_value), i};
            }
            else{
                seen.put(nums[i],i);
            }
        }
        return null;
    }
}
