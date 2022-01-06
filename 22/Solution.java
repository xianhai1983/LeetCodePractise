class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if (n == 0) return result;
        
        helper(n, n, "", result);
        return result;
    }
    
    private static void helper(int left, int right, String item, List<String> result) {
        if (left > right) return;
        
        if(left == 0 && right == 0) {
            result.add(item);
        }
        
        if(left > 0) {
            helper(left-1, right, item + "(", result);
        }
         
        if(right > 0) {
            helper(left, right -1, item + ")", result);
        }
    }
}
