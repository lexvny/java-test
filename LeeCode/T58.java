package LeeCode;
class Solution {
    public int lengthOfLastWord(String s) {
    int y=0,l=0,i=1;
    s=s.trim();
    l=s.length();
    if(l==1)
        return 1;
    char t=s.charAt(l-1); 
    while(t!=' '){  
        y+=1;
        i++;
        if(l-i>=0)
        t=s.charAt(l-i);
        else break;
    }return y;
    }
}
