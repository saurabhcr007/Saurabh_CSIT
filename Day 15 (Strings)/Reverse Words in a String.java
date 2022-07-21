class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        int j=0;
        String str="";
        for(int i=1;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)==' ' && s.charAt(i-1)!=' '){
                str=s.substring(j,i)+" "+str;
            }
            else if(s.charAt(i)!=' ' && s.charAt(i-1)==' '){
                j=i;
            }
        }
        return str.strip();
    }
}