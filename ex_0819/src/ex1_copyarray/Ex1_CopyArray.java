package ex1_copyarray;

public class Ex1_CopyArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 100;

        // "얕은 복사"  
        //     S    |     H
        //__________|____________
        //  arr1    |  {1, 2, 3}
        //  arr2    | ↗  arr2의 0이 100이되면 arr1의 0도 100이 된다
        
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    
        // "깊은 복사" 원본과 다르게 복사된다
        int[] arr3 = {1, 2, 3};
        int[] arr4 = new int [arr3.length];
        
        for (int i = 0; i < arr3.length; i++){
            arr4[i] = arr3[i];
        }
        //     S    |     H
        //__________|____________
        //  arr3    |  {1, 2, 3}
        //  arr4    |  { ,  ,  }

        arr3[0] = 100;
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
    
    }//main
}
