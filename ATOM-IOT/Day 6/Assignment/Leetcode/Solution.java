package Day6.HomeTask;

public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        var i = 0;
        while (i < nums.length) {
            int j = nums[i];
            int digits = 0;
            int num = j;


            while (num > 0) {
                num = num / 10;
                int i1 = digits++;
            }


            if (digits % 2 == 0) {
                count++;
            }
            i++;
        }

        return count;
    }
}
