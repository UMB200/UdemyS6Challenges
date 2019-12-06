package com.UmidJavaUdemy;

public class Main {

    public static void main(String[] args) {
	    //BankAccount bankAccount = new BankAccount();
	    //bankAccount.setBalance(10.0);
	    //bankAccount.deductBalance(0);
//	    BankAccount secondAccount = new BankAccount("Tim", "email",
//				"095-55-55", 5.0, 100.0);
//		System.out.println(secondAccount.getAccNumber());
//		System.out.println(secondAccount.getCustomerName());

//		VipCustomer vipCustomer =  new VipCustomer("Boss", "hhh", 5000);
//		System.out.println(vipCustomer.getName() + vipCustomer.getCreditLimit() + vipCustomer.getEmail());
//		VipCustomer vipCustomer2 =  new VipCustomer("Not Boss", "hhh");
//		System.out.println(vipCustomer2.getName() + vipCustomer2.getEmail() + vipCustomer2.getCreditLimit());
//		VipCustomer vipCustomer3 =  new VipCustomer();
//		System.out.println(vipCustomer3.getName() + vipCustomer3.getEmail() + vipCustomer3.getCreditLimit());

//		Wall wall = new Wall(5,4);
//		System.out.println("area= " + wall.getArea());
//
//		wall.setHeight(-1.5);
//		System.out.println("width= " + wall.getWidth());
//		System.out.println("height= " + wall.getHeight());
//		System.out.println("area= " + wall.getArea());
//		Point first = new Point(6, 5);
//		Point second = new Point(3, 1);
//		System.out.println("distance(0,0)= " + first.distance());
//		System.out.println("distance(second)= " + first.distance(second));
//		System.out.println("distance(2,2)= " + first.distance(2, 2));
//		Point point = new Point();
//		System.out.println("distance()= " + point.distance());

//		ComplexNumber one = new ComplexNumber(1.0, 1.0);
//		ComplexNumber number = new ComplexNumber(2.5, -1.5);
//		one.add(1,1);
//		System.out.println("one.real= " + one.getReal());
//		System.out.println("one.imaginary= " + one.getImaginary());
//		one.subtract(number);
//		System.out.println("one.real= " + one.getReal());
//		System.out.println("one.imaginary= " + one.getImaginary());
//		number.subtract(one);
//		System.out.println("number.real= " + number.getReal());
//		System.out.println("number.imaginary= " + number.getImaginary());
//		Fish fish = new Fish("Clown", 2, 20, 2, 4, 1);
//		//fish.move(5);
//		fish.swim();
//		Jeep j = new Jeep(0, 0, 36);
//		j.steer(45);
//		j.accelerate(30);
//		j.accelerate(20);
//		j.accelerate(-42);

//		Circle circle = new Circle(3.75);
//		System.out.println("circle.radius= " + circle.getRadius());
//		System.out.println("circle.area= " + circle.getArea());
//		Cylinder cylinder = new Cylinder(5.55, 7.25);
//		System.out.println("cylinder.radius= " + cylinder.getRadius());
//		System.out.println("cylinder.height= " + cylinder.getHeight());
//		System.out.println("cylinder.area= " + cylinder.getArea());
//		System.out.println("cylinder.volume= " + cylinder.getVolume());

		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());

	}
}
