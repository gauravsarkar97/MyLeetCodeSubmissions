class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums2.length; i++){
            myHash.put(nums2[i], i);
        }
        
        int pos;
        
        for(int i = 0; i < nums1.length; i++){
            pos = myHash.get(nums1[i]);   //getting index of element in nums2
            
            //if last element ==> no next greater element
            if(pos == nums2.length-1)  
                ans[i] = -1;
            
            Boolean flag = false;
            //otherwise check from next index
            for(int j = pos+1; j < nums2.length; j++){
                    if(nums2[j] > nums1[i]){
                        ans[i] = nums2[j];
                        flag = true;
                        break;
                    }
                }
            
                //if there is no next greater element
                if(flag == false)
                    ans[i] = -1;
        }
        
        return ans;
    }
}