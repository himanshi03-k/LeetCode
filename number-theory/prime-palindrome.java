class Solution {
    public int primePalindrome(int n) {
        return solve(n);
    }
    public boolean isPalindrome(int x) {
            if(x<0||(x%10==0&&x!=0))
            return false; 
            int rev=0; 
            while(x>rev){
                rev=rev*10+x%10;
                x=x/10;
            }
            return (x==rev||x==rev/10);


}
public boolean prime(int n){
    if(n<2)
    return false; 
for(int i=2; i*i<=n; i++){
    if(n%i==0)
    return false; 
}
return true;
}
public int solve(int n){
    while (true){
     if (n>7 && n<11)
            return 11;
             if (n >= 10000000 && n <= 99999999)
                n = 100000000;
    if (isPalindrome(n) && prime(n)) {
        return n;
    }
    n++;
}
}
}
