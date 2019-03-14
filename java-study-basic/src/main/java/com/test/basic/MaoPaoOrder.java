package com.test.basic;

/**
 * @author czg
 *
 * 冒泡排序
 * @date 2019/3/14
 */
public class MaoPaoOrder {
    public static void main(String args[]){

        int a[] = {10,30,6,1,-1,2,-2,4,5};
        int length = a.length;
        //int i=0,j=0;
        for(int i=0;i<length-1;i++){

            for(int x = 0;x<length-1-i;x++){
                if(a[x] >a[x+1]){

                    int temp = 0;
                    temp = a[x];
                    a[x]=a[x+1];
                    a[x+1] =temp;
                }
            }
        }
        for(int b = 0;b<length;b++){

            System.out.println(a[b]);
        }
    }
}
