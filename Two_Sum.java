import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner; 


public class Two_Sum{
    public static void main(String[] args){
        int target,i,n;
        
        Scanner read = new Scanner(System.in); 
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
        s.twoSum(array,target);
        
        read.close();
    }
}
class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<Integer,Integer>();
        int[] array = new int[2];
        for(int i=0;i<nums.length;i++){
            int current_value = nums[i];
            int find_value = target - current_value;

            if(seen.containsKey(find_value)){
                //return new int[] {seen.get(find_value),i};//leetcode
                array[0]=seen.get(find_value);
                array[1]=i;
                //System.out.println(array);//failed
                //System.out.println(array[0]);//success but not ok
                //System.out.println(array[1]);//success but not ok
                System.out.println(Arrays.toString(array));//Success
            }
            else{
                seen.put(nums[i],i);
            }
        }
        return null;
    }
}
