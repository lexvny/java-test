package LeeCode;
class Solution {
    public boolean isPalindrome(int x) {
        int num=x,ret=0,i=0;
        if(x==0)
        return true;
        else if(x%10==0||x<0)
            return false;
        else{
        for(;;i++){
            if(num<=0)
            break;
            num/=10;}
        num=x;   
        double s1,s2;
        int j,n1,n2=0,p1=i/2;
        s1=Math.pow(10,p1);
        s2=Math.pow(10,p1+1);
        if(i%2==0)
            n1=num/(int)s1;
        else n1=num/(int)s2;
            for(int k=0;k<p1;k++){
                n2*=10;
                j=num%10;
                num/=10;
                n2+=j;
            }
            if(n1==n2)
                ret=1;
}if(ret==1) return true;
return false;
}
}
