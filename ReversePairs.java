class Solution {
    int cnt = 0;
    public int reversePairs(int[] nums) {
        ms(nums, 0, nums.length - 1);
        return cnt;
    }
    private void ms(int[] a, int l, int r) {
        if (l >= r) return;
        int m = l + (r - l) / 2;
        ms(a, l, m);
        ms(a, m + 1, r);
        count(a, l, m, r);
        merge(a, l, m, r);
    }
    private void count(int[] a, int l, int m, int r) {
        int j = m + 1;
        for (int i = l; i <= m; i++) {
            while (j <= r && (long)a[i] > 2L * a[j]) {
                j++;
            }
            cnt += j - (m + 1);
        }
    }
    private void merge(int[] a, int l, int m, int r) {
        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (a[i] <= a[j]) {
                t[k++] = a[i++];
            } else {
                t[k++] = a[j++];
            }
        }
        while (i <= m) {
            t[k++] = a[i++];
        }
        while (j <= r) {
            t[k++] = a[j++];
        }
        for (i = l, k = 0; i <= r; i++, k++) {
            a[i] = t[k];
        }
    }
}