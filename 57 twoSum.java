// 解法1： 使用hash表，一次遍历，时间O(N)，空间O(N)，此方法和leetcode两数之和一样，但那道题数组无序，本题数组有序，所以肯定有更优解

// 解法2： 使用二分，遍历数组，比如target=40,nums[0] = 10，那么用二分查找30。时间O(NLogN)，空间O(1)

// 解法3： 使用双指针，时间O(N) 空间O(1)，应该是最优解了\

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 前后指针
        int l = 0,r = nums.length-1;
		// 指针相遇结束查找
        while(l<r){
			int sum = nums[l] + nums[r];
			if(sum == target)
				return new int[]{nums[l], nums[r]};
            // 因为数组已排序，小于则左指针+1，大于则右指针-1
			else if(sum > target)
				r--;
			else if(sum < target)
				l++;
		}
		return new int[]{};
	}
}
