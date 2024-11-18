public class SecondGreatestInteger {
    int[] arr = {3,6,3,4,1,9,5,10};
    public int find(){
        int m=arr[0], n=arr[0];
        for(int a:arr){
            if(a>=m){
                n=m;
                m=a;
            }
        }
        return n;
    }
}
