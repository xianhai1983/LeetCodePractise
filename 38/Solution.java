class Solution {
    public String countAndSay(int n) {
		int i = 1;
        String ret = "1";
		while(i<n) {
			StringBuilder sb = new StringBuilder();
			char c = ret.charAt(0);
            int count = 0;
			for (int j = 0; j<=ret.length(); j++) {
				if (j != ret.length() && ret.charAt(j) ==c) {
					count ++;
				} else {
					sb.append(count);
					sb.append(c);
					if (j != ret.length()) {
                        count = 1;
                        c = ret.charAt(j);
                    }
				}
			}
		     ret = sb.toString();
			i ++;
			
			

		}
		return ret;
    }
}
