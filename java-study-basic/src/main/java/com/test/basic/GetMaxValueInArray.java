package com.test.basic;

/**
 * @author czg
 * 数组反转
 * @date 2019/3/13
 */
public class GetMaxValueInArray {
    public static void main(String args[]){

        int a[] = {1,3,5,6,7,8,9};
        int i = 0;
        int j = a.length -1;
        System.out.println("数组的长度："+j);
        while(i<j){
            int temp= 0;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        for(int x=0;x<a.length;x++){

            System.out.println(a[x]);
        }
    }
}
