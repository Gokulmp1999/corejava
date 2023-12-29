package leetcode;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
      int[] a={2,5,6};
      int[] b={1,4,9};
      int c=a.length+b.length;

      int[] d=new int[c];
      System.arraycopy(a,0,d,0,a.length);
        System.arraycopy(b,0,d,a.length,b.length);
        System.out.println(Arrays.toString(d));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = (m + n) - 1;
        int s = m - 1;
        int t = n - 1;

        while (s >= 0 && t >= 0) {
            if (nums1[s] > nums2[t]) {
                nums1[l--] = nums1[s--];
            } else {
                nums1[l--] = nums2[t--];
            }
        }

        while (t >= 0) {
            nums1[l--] = nums2[t--];
        }
    }
}
