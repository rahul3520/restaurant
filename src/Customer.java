import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    int tea_count;
    int coffee_count;
    int snacks_count;
    int idli_count;
    int dosa_count;
    int bill_amt;

    public Customer()
    {
        System.out.println("New customer created");
    }

    public Customer(int tea_count, int coffee_count, int snacks_count, int idli_count, int dosa_count) {
        this.tea_count = tea_count;
        this.coffee_count = coffee_count;
        this.snacks_count = snacks_count;
        this.idli_count = idli_count;
        this.dosa_count = dosa_count;

    }

    public static void main(String[] args) {

        int coffeePrice=15;
        int teaPrice=10;
        int snacksPrice=10;
        int idliPrice=8;
        int dosaPrice=6;


        int exit=0;
        while (exit!=1)
        {

            ArrayList <Customer> cust=new ArrayList<Customer>();
            System.out.println("1:Take order\n2:Generate bill\n3:view all transactions\n4:Exit\n");

            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.println("place order");

                    //Customer c1=new Customer();

                    System.out.println("Enter tea count:");
                    int tea_count= sc.nextInt();

                    System.out.println("Enter  coffee count:");
                    int coffee_count= sc.nextInt();

                    System.out.println("Enter snack count:");
                    int snacks_count=sc.nextInt();

                    System.out.println("Enter idli count:");
                    int idli_count= sc.nextInt();

                    System.out.println("Enter dosa count:");
                    int dosa_count=sc.nextInt();

                    Customer c1=new Customer(tea_count,coffee_count,snacks_count,idli_count,dosa_count);
                    cust.add(c1);

                    break;

                case 2:
                    System.out.println("Generate bill");

                    break;

                case 3:
                    System.out.println("view all transactions");

                    break;

                case 4:

                    System.out.println("Exit");

                    break;

                default:
                    System.out.println("Wrong choice");



            }

            System.out.println("Enter 1 to exit\n0 to continue");

            exit=sc.nextInt();


        }



    }
}