import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

 public static void main(String args[])
        {


            if(args.length == 0){
                System.out.println("No Input. Please enter an integer you wish to convert.");
                return;
            }
            else{
                calculateHex(args[0]);
            }

        }





  public static String calculateHex(String Arg1)
            {

                char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                int rem, num;
                num = Integer.parseInt(Arg1);

                String hexadecimal="";
                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                while(num != 0)
                {
                    rem=num%16;
                    hexadecimal= ch[rem] + hexadecimal;
                    num= num/16;
                }

                System.out.println("Hexadecimal representation is: " + hexadecimal);
                return hexadecimal;
            }
}
