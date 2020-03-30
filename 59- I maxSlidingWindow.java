class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];          //new int[0]就是一个没有长度的数组[]
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0,j = 0; i < nums.length; i++){
            if(!queue.isEmpty() && i - queue.peek() >= k){
                queue.poll();
            }
            while(!queue.isEmpty() && nums[i] > nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offer(i);     //offer=add 但栈满offer返回false
            // 看看窗口有没有形成，只有形成了大小为 k 的窗口，才能收集窗口内的最大值
            if(i >= k - 1){
                res[j++] = nums[queue.peek()];
            }
        }
        return res;
    }
}
