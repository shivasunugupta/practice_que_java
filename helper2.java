class Sports
{
    public void play()
    {
        System.out.println("Playing a sport");
    }
}
class Football extends Sports
{
    @Override
    public void play()
    {
        System.out.println("Playing football");
    }
}
class Basketball extends Sports
{
    @Override
    public void play()
    {
        System.out.println("Playing basketball");
    }
}

class Rugby extends Sports
{
    @Override
    public void play()
    {
        System.out.println("Playing rugby");
    }
}

public class helper2
{
    public static void main(String[] args)
    {
        
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();
    }
}






