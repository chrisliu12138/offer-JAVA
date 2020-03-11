class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");    //将传进来的字符串以空格拆分
            StringBuffer sb = new StringBuffer();
            for(int i = ss.length-1;i>=0;i--){
                if(!ss[i].equals(""))  {   //从末尾遍历，如果不为空插入ss
                sb.append(ss[i]);
                sb.append(" ");            //分割的字符串后面加空格
                }
            }
            return sb.toString().trim();    //.trim()去掉字符串两边的空格
            //实际上trim掉了字符串两端Unicode编码小于等于32（\u0020）的所有字符。 
    }
}
