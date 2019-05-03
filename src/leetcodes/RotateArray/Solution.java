class Solution {
    public void rotate(int[] nums, int k) {
        for(int zed = 0; zed < k; zed ++){
                int aux = nums[nums.length-1];
        
        for(int i = nums.length-1; i > 0 ; i--){
            
           nums[i] = nums[i-1];
            
        }
        nums[0] = aux;
    
            
        }
        
    }
}
