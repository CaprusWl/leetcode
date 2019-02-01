class MedianOfTwoSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0, index2 = 0, newIndex = 0;
        int n = nums1.length;
        int m = nums2.length;
        int[] newNums = new int[n + m + 1];
        
        while (index1 < n && index2 < m) {
            if (nums1[index1] <= nums2[index2]) {
                newNums[newIndex++] = nums1[index1++];
            } else {
                newNums[newIndex++] = nums2[index2++];
            }
        }
        
        while (index1 < n) {
            newNums[newIndex++] = nums1[index1++];
        }
        
        while (index2 < m) {
            newNums[newIndex++] = nums2[index2++];
        }
        
        if (newIndex % 2 == 1) {
            return newNums[newIndex / 2];
        } else {
            return (newNums[newIndex / 2] + newNums[newIndex / 2 - 1]) / 2.0;
        }
    }
}
