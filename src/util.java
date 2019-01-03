public class util {



    public static void swap(int[] arr,int i, int j)
    {
        int temp;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



    public static void bubbleSort(int[] arr)
    {
        int pos;
        int swapcount;
        boolean done = false;
        while(!done)
        {
            swapcount=0;
            pos=0;
            for(int x=0;x<arr.length;x++)
            {
                if(arr[pos]>arr[pos+1])
                {
                    swap(arr,arr[pos],arr[pos+1]);
                    swapcount++;
                }
                pos++;
            }
            if (swapcount==0)
            {
                done=true;
            }
        }
    }


    public static int[] randIntArr(int count)
    {
        int[] arr= new int[count];
        for(int x=0;x<count;x++)
        {
            arr[x]=(int)(Math.random()*10001);
        }
        return arr;
    }
}
