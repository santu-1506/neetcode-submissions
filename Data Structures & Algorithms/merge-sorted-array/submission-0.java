class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        for(int i=0;i<m;i++){
            res[i] = nums1[i];
        }
        int j = m;
        for(int i=0;i<nums2.length;i++){
            res[j++] = nums2[i];
        }
        Arrays.sort(res);
        for(int i=0;i<nums1.length;i++){
            nums1[i] = res[i];
        }
    }
}