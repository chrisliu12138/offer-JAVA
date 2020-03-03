//排序数组的查找问题首先考虑使用二分法解决
class Solution {
    public int minArray(int[] numbers) {
        if(numbers[0]<numbers[numbers.length-1])
            return numbers[0];
        int a = 0;
        int b = numbers.length-1;
        int m;
        while(a<b){
            m = (a+b)/2;
            if(numbers[m]>numbers[b]) a=m+1;
            else if(numbers[m]<numbers[b]) b=m;
            else b--;
        }
        return numbers[a];
    }
}

//非二分算法时间复杂度O(n) 不考虑×
class Solution {
    public int minArray(int[] numbers) {
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1])
            return numbers[i+1];
        }
        return numbers[0];
    }
}
