class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
        int n1 = nums1.length , n2 = nums2.length ; 
        int i = 0 , j = 0 ; 

        ArrayList<int []> arr = new ArrayList<>() ; 
        while(i < n1 && j < n2){
            if(nums1[i][0] < nums2[j][0]){
                arr.add(nums1[i++]) ; 
            }
            else if(nums1[i][0] == nums2[j][0]){
                arr.add(new int[]{nums1[i][0] , nums1[i++][1]+nums2[j++][1]}) ; 
            }
            else {
                arr.add(nums2[j++]) ; 
            }
        }
        while(i < n1){
            arr.add(nums1[i++]) ; 
        }
        while(j < n2){
            arr.add(nums2[j++]) ;
        }

        int [][] ans = arr.toArray(new int[0][]) ; 
        return ans ; 
    }
}
