import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* #1
        System.out.println("enter a number");
        int num = scan.nextInt();

        if (num > 70){
            
            System.out.println("PASSING");
        }

        else {
            System.out.println("NOT PASSING");
        }
        */

        /* #2 
        System.out.println("enter a number");
        int num = scan.nextInt();
        
        if (num <= 50){
            System.out.println("GO")
        }

        else {
            System.out.println("STOP");
        }
        */

        /* #3
        System.out.println("enter a number");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
        }

        else {
            System.out.println("ODD");
        }
        */

        /* #4
        System.out.println("enter a number");
        int num = scan.nextInt();

        if (num % 5 == 0) {
            System.out.println("MULTIPLE OF 5");
        }

        else {
            System.out.println("NOT A MULTIPLE OF 5");
        }
        */

        /* #5
        System.out.println("enter a number");
        int num = scan.nextInt();

        if (num < 10) {
            System.out.println("ONE DIGIT");   
        }

        else if (num >= 100){
            System.out.println("THREE DIGITS");
        }

        else {
            System.out.println("TWO DIGITS");
        }
        */

        /* #6
        System.out.println("Enter a jersey number");
        int jersNum = scan.nextInt();

        if(jersNum == 12 || jersNum == 71 || jersNum == 80) {
            System.out.println("That number is retired from the Seattle Seahawks!");
        }
        */

        /* #7
        System.out.println("Enter a state");
                String state = scan.nextLine();

        if (state.equals("Washington") || state.equals("Oregon") || state.equals("Idaho")) {
            System.out.println("This state is in the PNW");
        }

        else {
            System.out.println("You should move to the PNW; it's great here!");
        }
        */

        /* #8
        System.out.println("Enter one of the following: SHORT, TALL, GRANDE, VENTI");
        String size = scan.nextLine();

        if (size.equals("SHORT")) {
            System.out.println("That contains 8 ounces");
        }
        else if (size.equals("TALL")) {
            System.out.println("That contains 12 ounces");
        }
        else if (size.equals("GRANDE")) {
            System.out.println("That contains 16 ounces");
        }
        else if (size.equals("VENTI")) {
            System.out.println("That contains 20 ounces");
        }
        */

        scan.close();
    }
}