public class runner {



    public static void main(String[] args)
    {
        int[] ten = util.randIntArr(10);

        for(int num:ten)
            System.out.print(num+" ");
        System.out.println();

        util.bubbleSort(ten);

        for(int num:ten)
            System.out.print(num+" ");
        System.out.println();
    }
}
