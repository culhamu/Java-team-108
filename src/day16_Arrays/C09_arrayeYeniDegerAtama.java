package day16_Arrays;

import java.util.Arrays;

public class C09_arrayeYeniDegerAtama {
    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] temp=new int[5];
        for (int i = 0; i < arr1.length; i++) {
            temp[i]=arr1[i];
            
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));

        arr1=temp;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));
    }
}
