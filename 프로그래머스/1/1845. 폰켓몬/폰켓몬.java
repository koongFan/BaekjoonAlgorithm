import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        
        nums = Arrays.stream(nums).distinct().toArray();
        int size = nums.length;
            
        if(max<size){
            answer = max;
        }
        else{
            answer = size;
        }
        
        return answer;
    }
}