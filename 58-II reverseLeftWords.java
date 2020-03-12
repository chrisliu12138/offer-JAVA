//substring()方法返回字符串的子字符串
class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length()) + s.substring(0,n);
    }
}

//String转化为数组再用System.arraycopy(源数组，源数组起始位置，目标数组，目标数组起始位置，复制的长度)
class Solution {
    public String reverseLeftWords(String s, int n) {
        char [] res = new char[s.length()];
        char [] temp = s.toCharArray();
        System.arraycopy(temp,0,res,s.length() - n,n);
        System.arraycopy(temp,n,res,0,s.length() - n);
        return String.copyValueOf(res);
    }
}
