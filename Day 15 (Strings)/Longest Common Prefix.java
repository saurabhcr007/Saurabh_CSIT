class Solution
{
public String longestCommonPrefix(String[] strs)
{
int min=0;
String s ="";
int jj = strs.length;
String s1 = strs[0];
String s2= strs[1];
String s3 = strs[2];
if(jj == 0)
{return "";}
else
{
if(s1.length() < s2.length() && s1.length() < s3.length() )
{
min = s1.length();
}
else if(s2.length() < s1.length() && s2.length() < s3.length() )
{
min = s2.length();
}
else if(s3.length() < s2.length() && s3.length() < s1.length() )
{
min = s3.length();
}
for(int i= 1;i<=min;i++)
{
if(s1.substring(0,i).equals(s2.substring(0,i)) && s1.substring(0,i).equals(s3.substring(0,i)))
{
s = s1.substring(0,i);
}
}
return s;
}
}
}