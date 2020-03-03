//简单dp
//10-1 起始值为0,1的Fibonacci
class Solution {
    public int fib(int n) {
        int a = 0,b = 1,sum = 0;
        for(int i = 0;i < n;i++){
            sum = (a + b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
//10-2 起始值为1,1的Fibonacci
class Solution {
    public int numWays(int n) {
        int a = 1,b = 1,num = 1;    //n=0时返回1
        for(int i = 0;i < n;i++){
            num = (a + b)%1000000007;
            a = b;
            b = num;
        }
        return a;
    }
}
