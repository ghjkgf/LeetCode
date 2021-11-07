package common;

public class Utils {
    public static int[] generateRandomArray(int maxSize,int maxValue){
        int arr[]= new int[(int)((maxSize+1)*Math.random())];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int) ((maxValue+1)*Math.random())-(int)(maxValue*Math.random());
        }
        return arr;
    }
    public static int[] copyArr(int[] arr){
        if(arr==null)
            return null;
        int[] res= new int[arr.length];
        for (int i=0;i< arr.length;i++){
            res[i]=arr[i];
        }
        return res;
    }
}
