class Solution {
    //Sunday Match
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || "".equals(needle)) return 0;
        if (haystack.length() < needle.length()) return -1;
        
        int haystackIndex = 0;
        int needleIndex = 0;
        
        while(needleIndex < needle.length()) {
            if (haystackIndex > haystack.length() -1) return -1;
            
            if (haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                haystackIndex ++;
                needleIndex ++;
            } else {
                int nextIndex = haystackIndex - needleIndex + needle.length();
                if (nextIndex < haystack.length()) {
                    int step = needle.lastIndexOf(haystack.charAt(nextIndex));
                    if (step == -1) {
                        haystackIndex = nextIndex + 1;
                    } else {
                        haystackIndex = nextIndex - step;
                    }
                    needleIndex = 0;
                } else {
                    return -1;
                }
                
            }
        }
        return haystackIndex - needleIndex;   
    }
}
