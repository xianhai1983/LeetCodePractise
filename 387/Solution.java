class Solution {
    public int firstUniqChar(String s) {
        if (s == null) return -1;
        
        int[] array = new int[26];
        char[] stringArray = s.toCharArray();
        for(int i = 0; i < stringArray.length; i++) {
            array[stringArray[i] - 'a'] = i;
        }
        
        for(int i = 0; i < stringArray.length; i++) {
            if (array[stringArray[i] - 'a'] == i) {
                return i;
            } else {
                array[stringArray[i] - 'a'] = -2;
            }
        }
        return -1;
    }
}
