import java.util.Scanner;

public class Main {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int H=s.nextInt();
            int M=s.nextInt();
            if(M>=45) System.out.format("%d %d",H,M-45);
            else if(M<45 && H>=1)
              System.out.format("%d %d",H-1,M+15);
            else
               System.out.format("%d %d",23,M+15);
          }
}
