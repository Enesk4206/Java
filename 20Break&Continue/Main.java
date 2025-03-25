public class Main{

    public static void main(String[] args){

        //break --> stop the loop!
        //contiune --> skip the loop!


        ///* 1 2 3 4 
        //  for(int i=0; i<10; i++){
           
        //     if(i == 5){
        //         break;  //stop
        //     }

        //      System.out.print(i+ " ");
        // }

        ///* 1 2 3 4 6 7 8 9 10
        for(int i=0; i<10; i++){
           
            if(i == 5){
                continue;   //skip
            }

             System.out.print(i+ " ");
        }

    }
}