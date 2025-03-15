public class pattern{
  public static void main(String[] args) {
    
    int k = 4;
    int n=2*k-2;
    for(int r=0; r<=n; r++){
      for(int c=0; c<=n; c++){
        int val=Math.min(Math.min(r,c),Math.min(n-r,n-c));
        System.out.print(k-val+" ");
      }
      System.out.println();
    }
  }
  
}