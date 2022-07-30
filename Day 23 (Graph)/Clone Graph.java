class Solution {
    public Node cloneGraph(Node node) {
        
        if(node == null) {
            return null;
        }
        
        Node root = new Node(node.val);
        
        Set<String> visited = new HashSet();
        Map<Integer, Node> valNodeMap = new HashMap();
        valNodeMap.put(node.val, root);
        
        // bfs(node, root, visited, valNodeMap);
        
        dfs(node, root, visited, valNodeMap);
        
        // printGraph(root);
        
        return root;
    }
    
    private void dfs(Node o, Node c, Set<String> visited, Map<Integer, Node>  map) {
        
        if(o == null || c == null || visited.contains(o.val+"->"+c.val)) {
            return;
        }
        
        visited.add(o.val+"->"+c.val);
        
        for(Node nei : o.neighbors) {
            
            Node tmp;
            
            if(map.containsKey(nei.val)) {
                tmp = map.get(nei.val);
            } else {
                tmp = new Node(nei.val);
                map.put(nei.val, tmp);
            }
            
            c.neighbors.add(tmp);
            
            dfs(nei, tmp, visited, map);
        }
    }
    
    private void bfs(Node o, Node c, Set<String> visited, Map<Integer, Node>  map) {
        // arr {original, copy}
        Queue<Node[]> q = new LinkedList();
        q.add(new Node[]{o,c});
        
        while(!q.isEmpty()) {
            
            Node[] nodes = q.remove();
            Node original = nodes[0];
            Node copy = nodes[1];
            
            for(Node n : original.neighbors) {
                
                if(!visited.contains(original.val+"->"+n.val)) {
                    visited.add(original.val+"->"+n.val);
                    
                    Node tmp;
                    
                    if(map.containsKey(n.val)) {
                        tmp = map.get(n.val);
                    } else {
                        tmp = new Node(n.val);
                        map.put(n.val, tmp);
                    }
                    
                    copy.neighbors.add(tmp);
                    
                    q.add(new Node[]{n, tmp});
                }
            }
        }
    }

    private void printGraph(Node root) {
        Queue<Node> q = new LinkedList();
        q.add(root);
        
        Set<String> visited = new HashSet();
        
        while(!q.isEmpty()) {
            Node node = q.remove();
            
            System.out.println("Root = "+node.val);
            System.out.println("Neighbours = ");
            
            for(Node n : node.neighbors) {
                
                if(!visited.contains(node.val+"->"+n.val)) {
                    visited.add(node.val+"->"+n.val);
                    
                    System.out.print(n.val+", ");
                    q.add(n);
                }
                  
            }
            
            System.out.println();
        }
    }

}