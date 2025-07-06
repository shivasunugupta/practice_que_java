abstract class person{
    abstract public void eat();
    abstract public void exercise();
}
class athlete extends person{
    @Override
    public void eat(){
        System.out.println("Athlete: include foods full of calcium,iron,potassium,and fiber.");
    }
    @Override
    public void exercise(){
        System.out.println("Athlete: Training allows the body to gradually build up strength and endurance improve skill levels and build motivation ambition and confidence.");
    }
}
class lazyperson extends person{
    @Override
    public void eat(){
        System.out.println("couch potato: Eating while watching TV also prolongs the time period that we're eating.");
    }
    @Override
    public void exercise(){
        System.out.println("Couch potato: Rarely exercising or being physically active");
    }
}
class helper3{
    public static void main(String arg[])
    {
        athlete a=new athlete();
        lazyperson lz=new lazyperson();
        a.eat();
        a.exercise();
        lz.eat();
        lz.exercise();
    }
}
