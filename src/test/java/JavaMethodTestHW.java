import org.testng.annotations.Test;

public class JavaMethodTestHW {

    @Test
    public void testJavaMethodsHW() {

        int income = 89076;


        if (income >= 0 && income <= 10275) {
            System.out.println("if user makes from 0 to 10275");
            System.out.println("your tax will be 10%");
        }

        else if (income >= 10276 && income <= 41775) {
            System.out.println("if user makes from 10276 to 41775");
            System.out.println("your tax will be 12%");
        }

        else if (income >= 41776 && income <= 89075) {
            System.out.println("if user makes 41776 to 89075");
            System.out.println("your tax will be 22%");

        } else {
            System.out.println("please call your CPA");
        }

    }

    @Test
    public void testSwitch(){

        String department = "Sales";
        switch (department){
            case "Sales":
                System.out.println("Sales department works from 8am to 12pm");
                break;

            case "Accounting":
                System.out.println("Accounting department works from 8am to 4.30pm");
                break;

            case "Marketing":
                System.out.println("Marketing department works from 8am to 5pm");
                break;

            case "Human Resources":
                System.out.println("Human Resources department works from 8am to 4.30pm");
                break;

            case "Logistics":
                System.out.println("Logistics department works from 8am to 7pm");
                break;

            case "Merchandise":
                System.out.println("Merchandise department works from 8am to 5pm");
                break;

        }

    }

    @Test
    public void testForLoop(){

        int i = (0);
        for (i = 0; i < 26; i++) {
            System.out.println(i);
            i++;
        }
    }

}




