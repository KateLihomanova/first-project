package practice_2;

public class Main {
    public static void main (String[] args) {
        Car newCar = new Car("Opel", 2016);
        newCar.setYear(2018);
        newCar.print();
        Rectangle newRectangle = new Rectangle(3, 4);
        newRectangle.setWidth(2);
        System.out.println(newRectangle.calculateArea());
        Book newBook = new Book("Вий", "Гоголь Н.В.");
        newBook.setAuthor("Пушкин А.С.");
        newBook.printInfo();
        BankAccount newBalance = new BankAccount("Катя", 2345.45);
        newBalance.deposit(798);
        newBalance.withdraw(45.98);
        newBalance.printBalance();
        Point newPoint = new Point(3, 4);
        newPoint.setX(9);
        newPoint.print();
        StudentGroup newGroup = new StudentGroup("Математики", 33);
        newGroup.setStudentCount(98);
        newGroup.printInfo();
        Circle newCircle = new Circle(5.6);
        newCircle.setRadius(8.7);
        System.out.println(newCircle.calculateArea());
        System.out.println(newCircle.calculateCircumference());
        Teacher newTeacher = new Teacher("Ольга Борисовна", "Биология");
        newTeacher.setSubject("Химия");
        newTeacher.printInfo();
        Product newProduct = new Product("Хлеб", 76.5);
        newProduct.setPrice(99.9);
        newProduct.applyDiscount(7);
        newProduct.printInfo();
        Laptop newLaptop = new Laptop("Mac", 890.7);
        newLaptop.setPrice(987.56);
        newLaptop.printInfo();

    }
}
