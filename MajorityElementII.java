class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a = 0, b = 1;
        int ca = 0, cb = 0;
        for (int x : nums) {
            if (x == a) {
                ca++;
            } else if (x == b) {
                cb++;
            } else if (ca == 0) {
                a = x;
                ca = 1;
            } else if (cb == 0) {
                b = x;
                cb = 1;
            } else {
                ca--;
                cb--;
            }
        }
        ca = 0;
        cb = 0;
        for (int x : nums) {
            if (x == a) {
                ca++;
            } else if (x == b) {
                cb++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if (ca > n / 3) ans.add(a);
        if (cb > n / 3) ans.add(b);
        return ans;
    }
}