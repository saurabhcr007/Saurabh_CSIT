public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int count =0;
ArrayList finalList = new ArrayList<>();
for(int i =0 ;i <=A.size()-B ; i++){
ArrayList values = new ArrayList<>();
while (count < B ) {
values.add(A.get(count+i));
count++;
}
System.out.println(Arrays.toString(values.toArray()));
count=0;
Set uniqueGas = new HashSet(values);
values.clear();
finalList.add(uniqueGas.size());
}
return finalList;
    }
}
