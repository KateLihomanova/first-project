package practice_2;

public class Main {
    public static void main (String[] args) {
        Car newCar = new Car("Opel", 2009);
        newCar.setYear(2010);
        newCar.print();
        Rectangle newRectangle = new Rectangle(6, 8);
        newRectangle.setWidth(4);
        newRectangle.calculateArea();
        Book newBook = new Book("Car", "Person");
        newBook.setAuthor("Cat");
        newBook.printInfo();
        BankAccount newPerson = new BankAccount("Alex", 900);
        newPerson.deposit(56);
        newPerson.withdraw(7);
        newPerson.printBalance();
        Circle newCircle = new Circle(6);
        newCircle.setRadius(7.4);
        newCircle.calculateArea();
        newCircle.calculateCircumference();
        Product newProduct = new Product("LT", 7900);
        newProduct.setPrice(9780);
        newProduct.applyDiscount(500);
        newProduct.printInfo();






















        Point newPoint = new Point(3, 4);
        newPoint.setX(9);
        newPoint.print();
        StudentGroup newGroup = new StudentGroup("Математики", 33);
        newGroup.setStudentCount(98);
        newGroup.printInfo();
        Teacher newTeacher = new Teacher("Ольга Борисовна", "Биология");
        newTeacher.setSubject("Химия");
        newTeacher.printInfo();
        Laptop newLaptop = new Laptop("Mac", 890.7);
        newLaptop.setPrice(987.56);
        newLaptop.printInfo();

    }
}
