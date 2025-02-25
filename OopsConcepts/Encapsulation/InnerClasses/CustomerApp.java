package OopsConcepts.Encapsulation.InnerClasses;

public class CustomerApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "Vikas";
        customer.age = 22;
        System.out.println(customer.name+ " " + customer.age);

        //Object for Member inner class
        Customer.Address ad = customer.new Address("Btr", 11, 410501, "pune");
        customer.addr = ad;
        //we can directly also can assign it by
//           customer.addr = customer.new Address("Btr", 11, 410501, "pune");
        System.out.println(customer.addr.street + " " +customer.addr.no+ " " +customer.addr.pincode+ " " +customer.addr.landmark);

        //Object for Local inner class
        Customer.DateOfBirth d = new Customer.DateOfBirth(15, 1, 2003);
        customer.dob = d;
        //        customer.dob = new Customer.DateOfBirth(15, 1, 2003);
        System.out.println(customer.dob.day + "/" +customer.dob.month+ "/" +customer.dob.year);

// calling order method with local inner class
        customer.order();
    }

    }

