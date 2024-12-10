import java.util.Map;
import java.util.HashMap;
public class TwoSum{
    public static int[] find(int[] nums,int target){
        int[] ans=new int[2];

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={2,7,5,1};
        int target=9;
        int[] ans=find(nums,target);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}
/* Time complexity: O(n) 
 * Space complexity: O(n)
*/