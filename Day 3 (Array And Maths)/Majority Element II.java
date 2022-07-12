class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n= arr.length;
        List<Integer> list= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>(n/3) && !list.contains(arr[i])) list.add(arr[i]);
        }
        return list;
    }
}