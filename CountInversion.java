class Solution {
    static long inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }
    static long mergeSort(int arr[], int l, int h) {
        long c= 0;
        if (l < h) {
            int m = l + (h - l) / 2;
            c += mergeSort(arr, l, m);
            c += mergeSort(arr, m + 1, h);
            c+= merge(arr, l, m, h);
        }
        return c;
    }
    static long merge(int arr[], int l, int m, int h) {
        int temp[] = new int[h - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;
        long c= 0;

        while (i <= m && j <= h) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                c += (m - i + 1);
            }
        }
        while (i <= m)
            temp[k++] = arr[i++];
        while (j <= h)
            temp[k++] = arr[j++];
        for (i = low,k = 0; i <= h; i++, k++)
            arr[i] = temp[k];
        return c;
    }
}
