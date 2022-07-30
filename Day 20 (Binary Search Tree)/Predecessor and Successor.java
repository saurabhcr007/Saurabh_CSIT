class GfG
{
   public static void findPreSuc(Node root, Res p, Res s, int key)
   {
       
       Node pred = root;
       Node succe = root;
      
            while(pred != null){
            
                if(key >= pred.data){
                    pred = pred.right;
                }else {
                    s.succ = pred;
                    pred  =pred.left;
                }
           }
           
           while(succe != null){
            
                if(key <= succe.data){
                    succe = succe.left;
                }else {
                   p.pre = succe;
                   succe  =succe.right;
                }
           }
   }
}