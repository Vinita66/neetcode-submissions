
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            int max = 0;
            int value = 0;
            for(int x : map.keySet()){
                if(map.get(x) > max){
                    max = map.get(x);
                    value = x;
                }
            }
            
            ans[i] = value;
            map.remove(value);
        }return ans;
    }
}
