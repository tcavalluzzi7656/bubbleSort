public class runner {



    public static void main(String[] args)
    {
        int[] ten = util.randIntArr(10);
        int[] before = ten;

        for(int num:ten)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        util.bubbleSort(ten);
        util.checkOrder(ten);
        util.checkSum(before,ten);
        time=System.nanoTime()-time;

        for(int num:ten)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Time Taken: "+time);
    }
}
