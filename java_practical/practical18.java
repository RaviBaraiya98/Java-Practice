// Create a class named 'Member' having the following  members: Data members 
// 1 - Name 
// 2 - Age 
// 3 - Phone number  
// 4 - Address 
// 5 – Salary 
// It also has a method named 'printSalary' which prints the  salary of the members. Two classes 'Employee' and  'Manager' 
// inherits the 'Member' class. The 'Employee' and  'Manager' classes have data members 'specialization' and  'department' respectively.
//  Now, assign name, age, phone  number, address and salary to an employee and a manager  by making an object of both of these classes 
//  and print the 
// same.

class Member
{
    public String name,address;
    public int age,salary;
    public double phonenum;

    public void printsalary()
    {
        System.out.println("salary: "+salary);
    }
}

class Employee extends Member
{
    String specialization,department;
    public Employee()
    {
 
    this.name = "Ravi";
    this.age = 18;
    this.phonenum = 98765;
    this.address = "charusat university";
    this.salary = 85000;
    specialization = "python";
    department = "depstar";
    }
    public void detail()
    {
    System.out.println("Employee detail");
    System.out.println("name: "+this.name);
    System.out.println("age: "+this.age);
    System.out.println("phone number: "+this.phonenum);
    System.out.println("address: "+this.address);
    
    this.printsalary();
    System.out.println("specialization: "+specialization);
    System.out.println("department: "+department);
    }
}

class Manager extends Member
{
    String specialization,department;

    public Manager()
    {
    this.name = "ajay";
    this.age = 21;
    this.phonenum = 78945;
    this.address = "charusat university";
    this.salary = 87000;
    specialization = "designing";
    department = "depstar";
    }

    public void detail()
    {
    System.out.println("Employee detail");
    System.out.println("name: "+this.name);
    System.out.println("age: "+this.age);
    System.out.println("phone number: "+this.phonenum);
    System.out.println("address: "+this.address);
    // System.out.println("salary: "+salary);
    this.printsalary();
    System.out.println("specialization: "+specialization);
    System.out.println("department: "+department);
    }
}

class practical18
{
    public static void main(String[] args)
    {
        Member m = new Member();
        Employee e1 = new Employee();
        e1.detail();
        Manager m1 = new Manager();
        m1.detail();

    }
}