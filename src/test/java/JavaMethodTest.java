import org.testng.annotations.Test;

public class JavaMethodTest {

    @Test
    public void testJavaMethods(){

        boolean access = true;
        int age = 6;
        boolean registered = true;
        boolean gardian = true;

        String accessGranted = "Congrats, you are granted a full access";
        String partialAccessGranted = "Congrats, you are granted a partial access";
        String accessIsNotGranted = "I'm sorry, you are not granted an access";


        if (age >= 21 && registered == true){
            System.out.println(accessGranted);

        }
        else if ((age >= 18 && age <21 )|| gardian == true){
            System.out.println(partialAccessGranted);

        }
        else {
            System.out.println(accessIsNotGranted);
        }

        System.out.println(access);

    }
    @Test
    public void testSwitch(){

        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }

    @Test
    public void forLoop(){

        //for (int i = 15; i >  10; i--){
        //    i--;
        //    System.out.println(i);

        for (int age = 77; age < 100; age++) {
            System.out.println("You will receive your pension at " + age + " age");

        }
    }
}
