public class Main {
    public static void main(String[] args) {
        int[] greed = {1,2,3};
        int[] size = {1,1};
        int count = 0;
        for(int i =0; i<greed.length; i++){
            for(int j=0; j<size.length; j++){
                if(size[j]>=greed[i]){
                   count++;
                   break;
                }
            }
           if(count>=size.length){
               break;
           }
        }
        System.out.println(count);
    }
}
