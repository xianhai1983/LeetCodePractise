class Solution {
    public int dayOfYear(String date) {
        int[] days = new int[] {31, 28, 31, 30,31, 30, 31,31,30,31,30,31};
		int year = Integer.valueOf(date.substring(0,4));
		boolean isLeapYear = year %400 == 0 || (year %4 == 0 && year % 100 !=0);
		int month = Integer.valueOf(date.substring(5,7));
		int count = 0;
		for(int i =0; i < days.length -1 && i < month -1; i++) {
			if (i ==1) {
				if (isLeapYear) {
					count += 29;
				} else {
					count += 28;
				}
			} else {
				count += days[i];
			}
			
		}
		int day = Integer.valueOf(date.substring(8));
		return count + day;
    }
}
