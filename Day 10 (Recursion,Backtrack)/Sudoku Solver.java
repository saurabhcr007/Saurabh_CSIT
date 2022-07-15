class Solution {

    public void solveSudoku(char[][] board) {
        Map<Character,HashSet<String>> map = new HashMap<Character,HashSet<String>>();
		//Map existing numbers and their positions to hashmap
        for(int i=0; i<9; i++)	
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    String row = "R"+i;
                    String col = "C"+j;
                    String box = i/3+"B"+j/3;
                    HashSet<String> set = map.getOrDefault(board[i][j],new HashSet<String>());
                    set.add(row);
                    set.add(col);
                    set.add(box);
                    map.put(board[i][j],set);
                }
            }
        explore(board,map,0,0);
        return;
    }
    
    public boolean explore(char[][] board, Map<Character,HashSet<String>> map, int i, int j){
        
        if(j==9){
            i++;
            j=0;
        }
            
        if(i==9){
            return true;
        }
            
        if(board[i][j]!='.')	//if not '.' move to next
            return explore(board,map,i,j+1);
        else {
            for(char num='1'; num<='9'; num++){
                String row = "R" + i;
                String col = "C" + j;
                String box = i/3 + "B" + j/3;
                HashSet<String> set = map.getOrDefault(num, new HashSet<String>());
                if(!set.contains(row) && !set.contains(col) && !set.contains(box)){
                    set.add(row);
                    set.add(col);
                    set.add(box);
                    map.put(num, set);
                    board[i][j]=num;
					
                    if(explore(board, map, i, j+1))		//if solving possible return
                        return true;
														
                    board[i][j]='.';					//Backtrack changes if false
                    set.remove(row);
                    set.remove(col);
                    set.remove(box);
                    map.put(num, set);
                }    
            }
        }
        return false;
    }
    
}