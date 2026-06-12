class Solution {
    public String frequencySort(String s) {
    HashMap <Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()){
        if(map.containsKey(c)){
            map.put(c, map.get(c) + 1);
        }
        else{
            map.put(c, 1);
        }
    }
    PriorityQueue <Character> pq = new PriorityQueue<> ((a,b) -> map.get(b) - map.get(a));
    pq.addAll(map.keySet());
    StringBuilder ans = new StringBuilder();
    while(!pq.isEmpty()){
        char ch = pq.poll();
        int freq = map.get(ch);
        while(freq-- > 0){
            ans.append(ch);
        
        }
    }
    return ans.toString();
    }
    
}