class Employee {
    //class declaration
    private String name;
    private String address;
    private double salary;
    private String job_title;

    //constructor declaration
    Employee(String name, String address, double salary, String job_title)
    {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

    //methods
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getJobTitle()
    {
        return job_title;
    }
    public double calBonus()
    {
        return 0.0;
    }
    public String getPerformanceRepo()
    {
        return "No Performance report available";
    }
}

//inhetitance
class Manager extends Employee
{
    private int no_of_subordinate;
    Manager(String name, String address, double salary, String job_title, int no_of_subordinate)
    {
        super(name, address, salary, job_title);
        this.no_of_subordinate = no_of_subordinate;
    }
    public int getNumberOfSub()
    {
        return no_of_subordinate;
    }
    @Override
    public double calBonus()
    {
        return getSalary()*0.15;
    }

//            @Override methods
    public String genPerformanceRepo()
    {
        return "Performance report for managers " + getName() + " Excellent";
    }
     public void manageProject()
     {
         System.out.println("Manager " + getName() + "is managing a project");
     }
}

class Developer extends Employee
{     private String ProgrammingLang;
    Developer(String name, String address, double salary, String job_title, String ProgrammingLang)
    {
        super(name, address, salary, job_title);
        this.ProgrammingLang = ProgrammingLang;
    }
    public String getProgrammingLang()
    {
        return ProgrammingLang;
    }
    @Override
    public double calBonus()
    {
        return getSalary() * 0.10;
    }
//            @Override
    public String genPerformanceRepo()
    {
        return "Performance report for developer " + getName() + " Good";
    }
    public void writeCode()
    {
        System.out.println("Developer " + getName() + " is writing code in " + ProgrammingLang);
    }

}
 class Programmer extends Developer
 {
     public Programmer(String name, String address, double salary, String job_title, String ProgrammingLang)
     {
         super(name, address, salary, job_title, ProgrammingLang);
     }
     @Override
     public double calBonus()
     {
         return getSalary() * 0.12;
     }
     public void debugcode()
     {
         System.out.println(" The Performance is written is " + getProgrammingLang() + " language");
     }
 }
public class helper1
{
    public static void main(String[] args)

    {
        //creating object of classes
        Manager m = new Manager("m", "jaipur",
                122000.0, "software engineer", 5);
        Developer dd = new Developer("dd", "Pune",
                123000.0, "devops", "Java");
        Programmer pp = new Programmer("pp", "banglore",
                230000, "swe", "java");

        System.out.println("Manager Bonus: " + m.calBonus());
        System.out.println("Programmer Bonus: " + pp.calBonus());
        System.out.println("Developer Bonus: " + dd.calBonus());

        System.out.println("Manager Performance Report: " + m.genPerformanceRepo());
        System.out.println("Programmer Performance Report: " + pp.genPerformanceRepo());
        System.out.println("Developer Performance Report: " + dd.genPerformanceRepo());

        m.manageProject();
        pp.debugcode();
        dd.writeCode();

    }
}

