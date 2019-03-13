

public class Fixedwatersong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int waterNum=9;
    String word="bottles";
    while(waterNum>0)
    {
  if(waterNum==1)
        {
            word="bottle";
      
        }
        System.out.println(waterNum+" "+word+"of water on the wall");
        System.out.println(waterNum+" "+word+"of water");
        System.out.println("Take on dawn.");
        System.out.println("pass it anround");
        waterNum=waterNum-1;
        
        if(waterNum>0)
        {
            
            
            System.out.println(waterNum+" "+word+"of water on the wall");
            }
         else
            System.out.println("no more bottle on the wall");
        
            
        
        
    }
        // TODO code application logic here
    }
    
}

        