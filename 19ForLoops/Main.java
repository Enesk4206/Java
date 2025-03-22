

public class Main{

    public static void main(String [] args) throws InterruptedException{

        ///*1 den 10 kadar
        // for(int i=1; i <=10; i++){

        //     System.out.println(i);
        // }

        //* 10dan 1e kadar
        // for(int i=10; i> 0; i--){
        //     System.out.println(i);
        // }

        ///* çift ve tek sayılar
        // for(int y =0; y <=10; y+=2){
        //     System.err.println(y);
        // }
        // for(int y =1; y <=10; y+=2){
        //     System.err.println(y);
        // }

        ///* 10 dan geriye 2şer 2şer
        // for(int x=10; x>=0; x-=2){
        //     System.out.println(x);
        // }


        ///* Enter how many times you want loop?
        ///
        
        // Scanner scanner = new Scanner(System.in);
        // int loop;
        // System.out.println("Enter how many times you want loop?");
        // loop = scanner.nextInt();

        // for(int y = 1; y<=loop; y++){
        //     System.out.println(y);
        // }



        ///* Happ new year message
        ///
        
        int start = 10;
        for(int i = start; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.err.println("Happy new year!!");

    }
}