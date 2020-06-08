class Solution {
    public String reverseVowels(String s) {
        StringBuilder ret = new StringBuilder();
        Stack<Character> vowels = new Stack<>(); 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                vowels.push(ch);
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                ret.append(vowels.pop());
            } else {
                ret.append(ch);
            }
        }
        return ret.toString();
    }
    
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
