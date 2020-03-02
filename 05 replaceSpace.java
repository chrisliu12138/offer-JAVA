//方法一：调用String类的replace函数 代码少但没什么意义
class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}
//方法二：字符数组 O(n) O(n)
class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        //***直接把s通过toCharArray()转化为字符数组进行循环，而不是通过charAt()函数获取每个字符的值
        //***char[] chars = s.toCharArray();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
        //***for(char c : chars){             //已转化为字符数组
            char c = s.charAt(i);             //charAt()方法用于返回指定索引处的字符
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }
}
//方法三：初始化一个StringBuider再调用append函数（追加字符串）
class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
