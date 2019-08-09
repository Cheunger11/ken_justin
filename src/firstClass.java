public class firstClass {

    public static void main (String [] args){
        countDown(5);
        countUp(1);
    }

    private static void countDown(int max)
    {
        if(max>0)
        {
            System.out.println(String.valueOf(max));
            countDown(max-1);
        }
    }
    private static void countUp (int min)
    {
        if(min<=10)
        {
            System.out.println(String.valueOf(min));
            countDown(min++);
        }
    }
}

