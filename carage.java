  import java.util.Scanner;

class Cars {

    int currentcarage(int manufactureYear) {
        int currentYear = 2026;
        int age=currentYear - manufactureYear;
        return age;
    }
}

public class carage {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cars car = new Cars();

        System.out.println("enter BMW manufacturing year: ");
        int bmwyear = sc.nextInt();
        if(bmwyear>2026){
            System.out.println("enter valid year");
        }
        else{
        System.out.print("BMW car age: ");
        System.out.println(car.currentcarage(bmwyear) + " years");
        }
        System.out.println("enter tata manufacturing year: ");
        int tatayear = sc.nextInt();
        if(tatayear>2026){
            System.out.println("enter valid year");
        }
        else{
        System.out.print("tata car age: " );
        System.out.println(car.currentcarage(tatayear) + " years");
        }


        System.out.println("enter Toyota manufacturing year: ");
        int toyotayear = sc.nextInt();
        if(toyotayear>2026){
            System.out.println("enter valid year");
        }
        else{
        System.out.print("toyota car age: ");
        System.out.println(car.currentcarage(toyotayear) + " years");

        }
        sc.close();
    }
}

    

