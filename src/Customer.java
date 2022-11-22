import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    String name;

    Long mobileNo;
    int tea_count;
    int coffee_count;
    int snacks_count;
    int idli_count;
    int dosa_count;
    int bill_amt;

    static int teaPrice=10;
    static int coffeePrice=15;
    static int snackPrice=10;
    static int idliPrice=8;
    static int dosaPrice=6;


    /*public Customer()
    {
        System.out.println("customer obj created");
    }*/

    public Customer(String name,Long mobileNo,int tea_count, int coffee_count, int snacks_count, int idli_count, int dosa_count) {

        this.name=name;
        this.mobileNo=mobileNo;
        this.tea_count = tea_count;
        this.coffee_count = coffee_count;
        this.snacks_count = snacks_count;
        this.idli_count = idli_count;
        this.dosa_count = dosa_count;

    }

    public static void main(String[] args) {

        ArrayList<Customer> cust=new ArrayList<Customer>();

        int exit=0;
        while (exit!=1)
        {


            System.out.println("1:Take order\n2:Generate bill\n3:view all transactions\n4:Exit\n");

            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.println("place order");

                    //Customer c1=new Customer();
                    System.out.println("Enter customer name:");
                    Scanner sc1=new Scanner(System.in);

                    String name=new String();
                    name=sc1.nextLine();

                    System.out.println("Enter mobile no:");
                    Scanner sc2=new Scanner(System.in);

                    Long MobileNo=sc2.nextLong();

                    System.out.println("Enter tea count:");
                    Scanner sc3=new Scanner(System.in);

                    int tea_count= sc3.nextInt();

                    System.out.println("Enter  coffee count:");
                    Scanner sc4=new Scanner(System.in);


                    int coffee_count= sc4.nextInt();

                    System.out.println("Enter snack count:");
                    Scanner sc5=new Scanner(System.in);

                    int snacks_count=sc5.nextInt();

                    System.out.println("Enter idli count:");
                    Scanner sc6=new Scanner(System.in);

                    int idli_count= sc6.nextInt();

                    System.out.println("Enter dosa count:");
                    Scanner sc7=new Scanner(System.in);

                    int dosa_count=sc7.nextInt();

                    Customer c1=new Customer(name,MobileNo,tea_count,coffee_count,snacks_count,idli_count,dosa_count);

                    cust.add(c1);

                    System.out.println("all transactions");

                    for(Customer c3:cust)
                    {
                        System.out.println(c3.name);
                        System.out.println(c3.mobileNo);
                        System.out.println(c3.tea_count);
                        System.out.println(c3.coffee_count);
                        System.out.println(c3.snacks_count);
                        System.out.println(c3.idli_count);
                        System.out.println(c3.dosa_count);
                        System.out.println("\n");

                        //System.out.println(c3.bill_amt);
                    }


                    break;

                case 2:
                    System.out.println("Generate bill");

                    System.out.println("Enter Name of customer:");
                    Scanner sc8=new Scanner(System.in);

                    String nameofcust=new String();
                    nameofcust=sc8.nextLine();

                    //Customer c2=new Customer();

                    int flag=0;
                    for (Customer c2:cust)
                    {


                        if(nameofcust.equals(c2.name))
                        {
                            int bill_amount1=c2.tea_count*teaPrice+c2.coffee_count*coffeePrice+c2.snacks_count*snackPrice+c2.idli_count*idliPrice+c2.dosa_count*dosaPrice;
                            c2.bill_amt=bill_amount1;

                            System.out.println("Bill amount for customer is "+ c2.bill_amt);
                            flag=1;

                            break;

                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("Customer have not placed order");
                    }

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