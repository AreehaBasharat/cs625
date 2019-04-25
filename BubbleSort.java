public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size=5;
        int t;
        int num[]={3,5,6,7,1};
        for(int a=1; a<size;a++){
            
            
        
        
        
       for(int b=size-1; b>=a;b--)
       {
           if(num[b-1]>num[b])
           {
               t=num[b-1];
               num[b-1]=num[b];
               num[b]=t;
               
           }
           }
       }
        for(int i=0;i<5;i++)
        {
            System.out.println("   " +num[i]);
        }
       
        // TODO code application logic here
    }
    
}
