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
            int lastswap=arr.length-1;
            for(int x=0;x<lastswap;x++)
            {
                if(arr[pos]>arr[pos+1])
                {
                    swap(arr,pos,pos+1);
                    swapcount++;
                    lastswap=pos+1;
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


    public static boolean checkSum(int[] before,int[] after)
    {
        int sumBefore=0;
        int sumAfter=0;
        if(before.length!=after.length)
        {
            return false;
        }
        for(int x=0; x<before.length;x++)
        {
            sumBefore= sumBefore+before[x];
            sumAfter= sumAfter+after[x];
        }
        if (sumAfter==sumBefore)
        {
            return true;
        }
        return false;
    }

    public static boolean checkOrder(int[] arr)
    {
        boolean correct = true;
        for (int pos = 0; pos<arr.length-1;pos++)
        {
            if(!(arr[pos]<=arr[pos+1]))
            {
                correct=false;
            }
        }
        return correct;
    }
}
