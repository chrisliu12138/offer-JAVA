//HashSet本身不允许出现重复元素
//时间复杂度：O(n)，空间复杂度：O(n)
class Solution {
    public int findRepeatNumber(int[] nums) {
       HashSet numsSet = new HashSet<>();
        for(int num: nums){
            if(!numsSet.add(num)){
                return num;
            }
        }
        return -1;
    }
}

//时间复杂度：O(n)，空间复杂度：O(1)
class Solution {
    public int findRepeatNumber(int[] nums) {
       for(int i=0;i<nums.length;i++){
            // 如果当前的数 nums[i] 没有在下标为 i 的位置上，就把它交换到下标 i 上
            // 交换过来的数还得做相同的操作，因此这里使用 while
            // 可以在此处将数组输出打印，观察程序运行流程
            // System.out.println(Arrays.toString(nums));
           while(nums[i]!=i){
               if(nums[i]==nums[nums[i]]){
               // 如果下标为 nums[i] 的数值 nums[nums[i]] 它们二者相等
               // 正好找到了重复的元素，将它返回
                   return nums[i];
               }
               int temp = nums[i];
               nums[i] = nums[temp];
               nums[temp] = temp;
           }
       }
        return -1;
    }
}
