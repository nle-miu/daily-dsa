package algorithms.two_pointers.same_end;

public class CountBinarySubstring696 {
    public static int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        int t = 0; 
        groups[0] = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                groups[++t] = 1;
            } else {
                groups[t]++;
            }
        }

        int ans = 0;
        for(int i = 1; i <= t; i++){
            ans += Math.min(groups[i-1], groups[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
        System.out.println(countBinarySubstrings("10101"));
    }
}
