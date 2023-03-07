package Test_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, menu, choise = -1;
        do {
            System.out.println("Nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 100) {
                System.out.println("mảng không được quá 100 phần tử");
                System.out.print("Vui lòng nhập lại ");
            }
        } while (size > 100);

        while (choise != 0) {
            System.out.println("Menu");
            System.out.println("1. Tính tổng và in ra các phần tử lẻ trong mảng.");
            System.out.println("2. In ra giá trị nhỏ nhất , lớn nhất trong mảng.");
            System.out.println("3. Thống kê số phần tử chia hết cho 2 và 3 trong mảng.");
            System.out.println("4. In ra mảng đảo ngược");
            System.out.println("5. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng ");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Thoát.");
            System.out.println("Vui lòng lựa chọn: ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    OddTotal(size);
                    break;
                case 2:
                    MaxMinArr(size);
                    break;
                case 3:
                    DivisibleByTwoAndThree(size);
                    break;
                case 4:
                    ReverseArray(size);
                    break;
                case 5:
                    CheckPrime(size);
                    break;
                case 6:
                    AscendingArray(size);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Số bạn chọn không đúng vui lòng chọn lại!");
            }
        }
    }

    public static void OddTotal(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Tạo mảng ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là : " + Arrays.toString(arr));
        int sum = 0;
        System.out.print("Các số lẻ có trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nTổng các số lẻ trong mảng là: " + sum);
    }

    public static void MaxMinArr(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Tạo mảng ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là : " + Arrays.toString(arr));
        int max = 0, min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }

    public static void DivisibleByTwoAndThree(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Tạo mảng ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là : " + Arrays.toString(arr));
        int totalByTwoAndTrhee = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i]%3 == 0) {
               totalByTwoAndTrhee++;
            }
        }
        System.out.println("Số phần tử chia hết cho 2 và 3 là: " + totalByTwoAndTrhee + "phần tử.");

    }

    public static void ReverseArray(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Tạo mảng ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là : " + Arrays.toString(arr));
        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
        }

        System.out.println("mảng đảo ngược là: " + Arrays.toString(arr));
    }


    public static void CheckPrime(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Tạo mảng ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là : " + Arrays.toString(arr));
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            if (arr[i] == 2) {
                check = true;
            } else if (arr[i]>1){
                for (int j = 2; j <arr[i] ; j++) {
                    if (arr[i]%j==0){
                        check = false;
                    }
                }
            } else {
                check = false;
            }
            if (check) {
                total+=arr[i];
                System.out.println("Giá trị: " + arr[i] + ", " + " ở vị trí: " + i + "\n");
            }
        }
                System.out.println("Có tổng là: " + total);
    }
    public static void AscendingArray(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Tạo mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là : " + Arrays.toString(arr));
        int x;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    x = arr[j];
                    arr[j] = arr[i];
                    arr[i] = x;
                }
            }
        }
        System.out.println("Sắp xếp theo thứ tự tăng dần là: " + Arrays.toString(arr));
    }
}
