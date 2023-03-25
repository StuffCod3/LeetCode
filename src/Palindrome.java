public class Palindrome {
    public boolean isPalindrome(int x) {
        int palindrom = 0;
        int x1 = x;
        boolean res;
        while(x1 != 0){
            palindrom = palindrom * 10;
            palindrom = palindrom + x1 % 10;
            x1 = x1 / 10;
        }
        return palindrom == x;
    }
}
