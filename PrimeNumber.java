public class PrimeNumber {

    int num;
    public boolean check(){
        for(int i=2;i<=(int) num/2; i++){
            if(num%i==0){
              return false;
            }
        }
        return true;
    }
}
