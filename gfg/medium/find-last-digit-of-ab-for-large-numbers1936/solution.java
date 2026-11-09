
class Solution {
    int getLastDigit(String a, String b) {

        
        if (b.equals("0")) {
            return 1;
        }

        if (a.equals("0")) {
            return 0;
        }

        int lastDigit = a.charAt(a.length() - 1) - '0';

        
        int rem = 0;

        for (int i = 0; i < b.length(); i++) {
            rem = (rem * 10 + (b.charAt(i) - '0')) % 4;
        }

        
        if (rem == 0) {
            rem = 4;
        }

        
        int ans = 1;

        for (int i = 1; i <= rem; i++) {
            ans = (ans * lastDigit) % 10;
        }

        return ans;
    }
}
