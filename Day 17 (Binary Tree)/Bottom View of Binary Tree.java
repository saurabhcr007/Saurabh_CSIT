class Pair{

Node node;

int h_dis;

Pair(int data, Node node){

      this.h_dis = data;

      this.node = node;

}

class Solution
{

public ArrayList <Integer> bottomView(Node root)
   {

// queue for level order traversal

        Queue<Pair> q = new ArrayDeque<>();

        // map for storing the horizontal distance from root node

        Map<Integer, Integer> map = new TreeMap<>();


 

        q.add(new Pair(0, root));

        while(!q.isEmpty()){

            Pair curr = q.poll();

            // if map already contains some data at that position then jut replace that

            map.put(curr.h_dis, curr.node.data);

            if(curr.node.left!=null)

                q.add(new Pair(curr.h_dis-1, curr.node.left));

            if(curr.node.right!=null)

                q.add(new Pair(curr.h_dis+1, curr.node.right));

        }

        ArrayList<Integer> ar = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            // System.out.print(entry.getValue()+" ");

            ar.add(entry.getValue());

        }

        return ar;

     }

}