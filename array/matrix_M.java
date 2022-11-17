package com.assignment.day4.array;

import java.util.Scanner;

public class matrix_M 
{
	public static void main(String args[]) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of rows : ");
        row = sc.nextInt();
        System.out.println("Enter total number of columns : ");
        col = sc.nextInt();
        int value[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element for array Matrix[" + (i + 1) + "," + (j + 1) + "] : ");
                value[i][j] = sc.nextInt();
                System.out.println("Value Inserted:");
                for (int i1=0;i1<row;i1++) {
                    for (int j1=0;j1<col;j1++) {
                        System.out.print(value[i1][j1] + "\t");
                       }
                    System.out.println();
                }
                System.out.println("The elements of this matrix are : ");
                for (int i1= 0;i1<row;i1++) {
                    for (int j1=0;j1<col;j1++) {
                        if (i1==0||j1==0||i1==row-1||j1==col-1)
                        {
                            System.out.print(value[i1][j1] + "\t");
                        } else {
                            System.out.print("\t");
                        }
                        }
                    System.out.println();
                    }
                }
            }
            }
	}

