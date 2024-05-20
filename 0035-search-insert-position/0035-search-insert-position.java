class Solution {
    public int searchInsert(int[] nums, int target) {
    	Stack<Integer> stack = new Stack<>();
    	int result = 0;
        for(int i =0; i<nums.length; i++) {
        	if(nums[i] < target) {
        		stack.push(nums[i]);
        	} else if(nums[i] > target || nums[i] == target) {
        		break;
        	}
        }
        result = stack.size();
        return result;
    }
}