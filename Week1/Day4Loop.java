package Week1;

public class Day4Loop {

        public static void forLoop()
        {
            for(int i=0;i<=5;i++)
                System.out.println("using for Loop");
        }
        public static void whileLoop()
        {
            int x=1;
            while(x<=5) {
                System.out.println("using while Loop");
                x++;
            }

        }
        public static void doLoop()
        {
            int p=1;
            do {
                System.out.println("using do loop");
                p++;
            }while(p<=5);
        }

        public static void forEachLoop(){
            int[]arr={2,4,3,5,6};
            int sum=0;
            for(int a:arr){
                sum=sum+ a;
            }
            System.out.println(sum);
        }

        public static void main(String[]args)
        {
            forLoop();
            whileLoop();
            doLoop();
            forEachLoop();

        }


}
