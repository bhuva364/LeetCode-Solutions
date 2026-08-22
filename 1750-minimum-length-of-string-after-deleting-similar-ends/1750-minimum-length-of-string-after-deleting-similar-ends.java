class Solution {
    public int minimumLength(String s) {
        int count = s.length();
        int l = 0;
        int h = s.length() - 1;
        
        while (l < h) {
            if (s.charAt(l) == s.charAt(h)) {
                if (l + 1 < h && s.charAt(l) == s.charAt(l + 1)) {
                    l++;
                    count--;
                    continue;
                }
                if (h - 1 > l && s.charAt(h) == s.charAt(h - 1)) {
                    h--;
                    count--;
                    continue;
                }
                count -= 2;
                l++;
                h--;
            } else {
                break; 
            }
        }
        
        return count;
    }
}
