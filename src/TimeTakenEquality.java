import java.util.Scanner;

public class TimeTakenEquality {
    public static int timeEqual(int[] array)
    {
        int max=Integer.MIN_VALUE;
        for(int i:array)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int time=0;
        for(int i:array)
        {
            time+=(max-i);
        }
        return time;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println(timeEqual(array));
    }
}
