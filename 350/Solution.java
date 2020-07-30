class Solution {
    public int[] intersect2(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ret = new ArrayList<>();

        for(int k : nums1) {
            if(map.containsKey(k)) {
                map.put(k, map.get(k)+1);
            } else {
                map.put(k, 1);
            }
        }
        
        for(int k: nums2) {
            if(map.containsKey(k)) {
                ret.add(k);
                int val = map.get(k);
                if(val ==1) {
                    map.remove(k);
                } else {
                    map.put(k, val -1);
                }
            }    
        }
        
        int[] res = new int[ret.size()];
        for(int k = 0; k < res.length; k++){
            res[k] = ret.get(k);
        }
        return res;
    }
    
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            List<Integer> ret = new ArrayList<>();
            int i = 0, j = 0;
            for (;i < nums1.length && j < nums2.length;) {
                if (nums1[i]  == nums2[j]) {
                    ret.add(nums1[i]);
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            
                    int[] res = new int[ret.size()];
        for(int k = 0; k < res.length; k++){
            res[k] = ret.get(k);
        }
        return res;
        }
}
