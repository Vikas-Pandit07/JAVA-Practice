package OopsConcepts.Encapsulation.InnerClasses;

public class Customer {
    String name;
    int age;

    Address addr;
    //Member Inner class
    class Address {
        String street;
        int no;
        int pincode;
        String landmark;

        public Address(String street, int no, int pincode, String landmark) {
            super();
            this.street = street;
            this.no = no;
            this.pincode = pincode;
            this.landmark = landmark;
        }

    }

    DateOfBirth dob;
    //Static Inner Class
    static class DateOfBirth {
        int day;
        int month;
        int year;

        public DateOfBirth(int day, int month, int year) {
            super();
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    void order() {
        System.out.println(name + " is ordering product..");

        //Local inner class - inside a method
        class Product {
            String name;
            int price;

            public Product(String name, int price) {
                super();
                this.name = name;
                this.price = price;
            }
        }
        Product p = new Product("Red Tape Shoe", 4000);
        System.out.println(p.name + " with price " + p.price);
    }
}
