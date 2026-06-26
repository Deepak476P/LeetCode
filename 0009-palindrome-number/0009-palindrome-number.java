class Solution {
    public int Reverse(int x){
        int sum = 0;

        while(x > 0){
            int rem = x % 10;
            sum = sum*10 + rem;
            x /= 10;
        }
        return sum;
    }

    public boolean isPalindrome(int x) {
        return (Reverse(x) == x);
    }
}