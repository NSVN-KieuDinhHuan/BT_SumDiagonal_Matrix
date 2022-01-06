package com.company;

public class Main {

    public static void main(String[] args) {
	int [][] newarray=createArrayRandom(4,4);
    print2Array(newarray);
    int sum=SumDiagonal(newarray);
        System.out.println("Tổng của đường chéo chính là "+sum);
    }

    public static int[][] createArrayRandom(int RowLength,int ColumLength){
        int[][] Arr=new int[RowLength][ColumLength];
        for (int row=0;row<RowLength;row++){
            for (int colum=0;colum<ColumLength;colum++){
                Arr[row][colum]=(int)(Math.random()*1000);
            }
        }
        return Arr;
    }

    public static void print2Array(int[][] arr){
        for (int row=0;row<arr.length;row++){
            for(int colum=0;colum<arr[row].length;colum++){
                System.out.print(arr[row][colum]+" ");
            }
            System.out.print("\n");
        }
    }
    public static int SumDiagonal(int[][] arr){
        int sum=0;
        for (int row=0;row<arr.length;row++){
            for (int colum=0;colum<arr[row].length;colum++){
                if(row==colum){
                    sum+=arr[row][colum];
                }
            }
        }
        return sum;
    }

}
