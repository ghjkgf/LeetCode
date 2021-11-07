package videocode;

public class Xor {
    //当数组中只存在一个数的个数为奇数
    public static int OnlyOneOdd(int[] arr){
        int z=0;
        for(int x:arr){
            z^=x;
        }
        return z;
    }
    //	当数组中存在两个数的个数为奇数,分别记为a,b
   public static int[] ExistTwoOdd(int[] arr){
        int resM = 0;
        for (int x:arr){
            resM^=x;     //resM即为a^b
        }
        //a,b不同,因此必有某一位上a,b是不一样的
        //找最右侧的那位
        int right = resM & (~resM+1);
        int a=0;
        for(int x:arr){
            if((x&right)==1){           //对于a和b会被分到不同的阵营里(其他数不用考虑)
                a^=x;
            }
        }
        return new int[]{a,resM^a};
    }
}
