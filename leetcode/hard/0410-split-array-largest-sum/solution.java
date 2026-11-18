
class Solution {

    boolean is_possible(int[] nums, int k, int mid) {
        int sum = 0;
        int subarray = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > mid) {
                return false;
            }

            if (sum + nums[i] <= mid) {
                sum += nums[i];
            }
            else {
                subarray++;

                if (subarray > k) {
                    return false;
                }

                sum = nums[i];
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        int l = 0;
        int r = 0;

        for (int i = 0; i < nums.length; i++) {
            l = Math.max(l, nums[i]);
            r += nums[i];
        }

        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (is_possible(nums, k, mid)) {
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
