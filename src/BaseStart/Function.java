package BaseStart;

public class Function {
    public static void main(String[] args){
        //Функции - Методы в Java2
        byte[] nums1 =new byte[] {5,6,8};
        byte[] nums2 =new byte[] {4,12,78,2,3,55,123,5};



        int sum1 = sum(nums1);
        System.out.println("Сумма 1 массива:" + sum1);
        int sum2 = sum(nums2);
        System.out.println("Сумма 2 массива:" + sum2);
    }
    public static int sum(byte[] a) { //делаем функции чтобы сократить код и упростить
        int sum=0;
        for (byte i =0; i< a.length; i++)
            sum+=a[i];
        return sum;
    }
}





//Функции - Методы в Java1

////        info("Hello");
////        String java = "Java";
////        info(java);
////        info("");
//
//        short num = 7;
//        int result1 = summ((short) 5,num);
//
//        short num2 = 4;
//        int result2 = summ((short) 8,num2);
//        info(String.valueOf(result2)); //перевод из int в String
//    }
//
//    public static int summ(short a, short b){
//      int res = a+b;
//      String result = "Результат: " + res;
//info(result);
//    return res;
//    }
// public static void info(String word){
//     System.out.print(word);
//     System.out.println("!");