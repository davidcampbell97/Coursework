public class Dec2Hex {


        public static void main(String args[]) {


            if (args.length == 0) {
                System.out.println("No Input. Please enter an integer you wish to convert.");
                return;
            }
            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer");
                return;
            }
            calculateHex(args[0]);

        }


        public static String calculateHex(String args) {

            boolean negative = false;


            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num;
            int Arg1 = Integer.parseInt(args);
            num = Arg1;

            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");


            if (args == null) {
                return hexadecimal;
            }

            if (num == 0) {
                System.out.println("Hexadecimal representation is 0: ");
                return Integer.toString(0);
            }

            if (num < 0) {
                num = Math.abs(num);
                negative = true;

            }

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }


            if (negative) {
                String negHex;
                negHex = "-" + hexadecimal;

                System.out.println("Hexadecimal representation is:" + negHex);
                return negHex;
            }


            System.out.println("Hexadecimal representation is: " + hexadecimal);
            return hexadecimal;
        }	System.out.println("Hi Mark!");

    }
