import java.util.Scanner;
public class test {
    Scanner scanner = new Scanner(System.in);
     private int num;
     private int length;
     private String number;
     private int digit1;
     private int digit2;
     private int digit3;
     private int digit4;
     private double calc = 0;


    public int getNumber(){    //This is used to get the number from the user
        System.out.println("Enter a number, up to 4 digits long: ");
        num = scanner.nextInt();
        return num;
    }

    public int theLength(){   //This is used to get the length of the number typed in
        getNumber();
        length = (int)(Math.log10(num)+1);
        return length;
    }

    public void digitsAndCalc() {
        theLength();

        //This is to get the digits of the numbers
        number = String.valueOf(num);
        for (int i = 0; i < 1 && i < number.length(); i++) {
            digit1 = Character.digit(number.charAt(i), 10);
        }
        for (int i = 1; i < 2 && i < number.length(); i++) {
            digit2 = Character.digit(number.charAt(i), 10);
        }
        for (int i = 2; i < 3 && i < number.length(); i++) {
            digit3 = Character.digit(number.charAt(i), 10);
        }
        for (int i = 3; i < 4 && i < number.length(); i++) {
            digit4 = Character.digit(number.charAt(i), 10);
        }

        //This is to do the calc
        if(length == 1){
            calc = Math.pow(digit1,length);
        }
        else if(length == 2){
            calc = Math.pow(digit1,length) + Math.pow(digit2,length);
        }
        else if(length == 3){
            calc = Math.pow(digit1,length) + Math.pow(digit2,length) + Math.pow(digit3,length);
        }
        else if(length == 4){
            calc = Math.pow(digit1,length) + Math.pow(digit2,length) + Math.pow(digit3,length) + Math.pow(digit4,length);
        }
        else{
            System.out.println("Error, your number is greater than 4 digits");
        }
        //This is to determine whether the number is Armstrong or not
        if(calc == num){
            System.out.println(num + " is an Armstrong number: ");
        }
        else{
            System.out.println(num + " is not an Armstrong number: ");
        }
    }

    public static void main(String[] args) {
        test obj = new test();
        obj.digitsAndCalc();
    }
}

