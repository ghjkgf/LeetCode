package videocode;

import common.Utils;

public class OjByself {
    public static void main(String[] args) {
        int testTime = 1000000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for(int i= 0;i<testTime;i++){
            int[] arr1 = Utils.generateRandomArray(maxSize,maxValue);
            int[] arr2 = Utils.copyArr(arr1);
            //对其进行两种操作,比较结果
        }
    }
}
