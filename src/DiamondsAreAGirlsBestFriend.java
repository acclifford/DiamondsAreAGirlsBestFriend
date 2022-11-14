import java.util.*;
public class DiamondsAreAGirlsBestFriend {
    //------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);

    //-------------------------------------------------------------------------
    public static void main(String[] args) {

        Girl myGirl;
        String name;
        int carat;
        int value;

        //--initial prompt for girl object name input
        System.out.print("Enter the name of the girl : ");
        name = keyboard.nextLine();
        myGirl = new Girl(name);
        System.out.println(myGirl);


        //--first collection of value and carat data
        System.out.print("Enter carats and value : ");
        carat = keyboard.nextInt();
        value = keyboard.nextInt();
        myGirl.setCarat(carat);
        myGirl.setValue(value);
        System.out.println(myGirl);

        //--collects data while carat does not equal 0
        while (carat != 0) {
            System.out.print("Enter carats and value : ");
            carat = keyboard.nextInt();
            value = keyboard.nextInt();
            if(carat != 0) {
                myGirl.setCarat(carat);
                myGirl.setValue(value);
                System.out.println(myGirl);
            }
            else {
                System.out.println(myGirl);
            }
        }

        }
    }


