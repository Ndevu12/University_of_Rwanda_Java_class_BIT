public class loops{

    public static void main(String args[]){

        for (int i = 1; i <= 5; i++){
            
            for (int j = 1; j <= i; j++){
              
              System.err.print(i);
                if (i == 5){
                j -= 1;
            }
            }
            System.out.println();
        }
    }
}
