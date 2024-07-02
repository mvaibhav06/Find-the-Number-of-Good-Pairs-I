class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int out = 0;

        for(int i=0; i<nums1.length; i++){
            int a = nums1[i];
            for(int j=0; j<nums2.length; j++){
                int b = nums2[j];
                b *= k;
                if(a%b==0){
                    out++;
                }
            }
        }
        return out;
    }
}
