
import org.testng.annotations.Test;

public class HWJavaBasic5e {
    @Test
    public void arithmetic(){


        System.out.println(51 / 17 * 3);
        System.out.println(3 + 17 + 22 + 51);
        System.out.println(5 - 22 / 2);
        System.out.println(21 - 3 * 17 + 33 * 8 - 11);
       

    }

    @Test
    public void Text(){

        String firstName = " Ana";
        String storeName = " Toysland";
        String location = "11 Main str Avon";
        int age = 20;
        double price = 5.99;


        System.out.println("Dear " + firstName +"! On the day of "+ storeName + " " + age +"th anniversary, " +
                "we give you a $" + price + " discount on the entire range. We are waiting for you at " + location + ".");


    }
}