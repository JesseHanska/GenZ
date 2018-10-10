import java.util.Date;

public class GenZ
{

    public static void main(String[] args)
    {
        System.out.println("One day, I will learn Git!!!");
        Comparable<Date> d = new Date();
        System.out.println(d.compareTo(new Date("2018,1,1")));
        
    }

}
