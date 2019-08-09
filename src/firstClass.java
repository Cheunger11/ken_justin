public class firstClass {

    public static void main (String [] args){
        countDown(20);
    }

    private static void countDown(int max)
    {
        if(max>0)
        {
            System.out.println(String.valueOf(max));
            countDown(max-1);
        }
    }
}

