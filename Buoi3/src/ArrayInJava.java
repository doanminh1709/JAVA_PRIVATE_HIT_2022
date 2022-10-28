import java.util.Scanner;

public class ArrayInJava {
  public static void main(String[] args) {
    //Khai bao 1 hằng số
    final float PI = 3.14f;

    Scanner scanner = new Scanner(System.in);
    System.out.println(" Nhap vao so phan tu cua mang ");
    int n = scanner.nextInt();
    int[] arr = new int[n];

    input(arr, n);
//    sort(arr , n);
//    arr = insert(arr , 3 , 3);
     arr =  remove(arr , 3);
    output(arr, n);
  }

  public static void input(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      arr[i] = new Scanner(System.in).nextInt();
    }
  }

  public static void output(int[] arr, int n) {
    for (int item :
        arr) {
      System.out.print(item + " ");
    }
  }

  public static void sort(int a[] , int n){
    for (int i = 0 ; i < n - 1 ; i++){
      for (int j = i+1 ; j < n ; j++){
        if(a[i] > a[j]){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static int[] insert(int []arr , int pos , int value){
      int []arr2 = new int[arr.length+1];

      //1 2 3 5 6 arr
    //arr 2 1 2 3 4
      for (int i = 0 ; i < pos - 1 ; i++){
        arr2[i] = arr[i];
      }
      arr2[pos - 1] = value;
      for (int i = pos ; i <= arr.length ; i++){
        arr2[i] = arr[i-1];
      }
      return arr2;
  }

  public static int []remove(int []arr , int pos){
    int []arr2 = new int[arr.length-1];
    // 1 2 3 4 5
    //1 2 4 5
    for (int i = 0 ; i < pos - 1 ; i++){
      arr2[i] = arr[i];
    }
    for (int i = pos; i < arr.length ; i++){
      arr2[i-1] = arr[i];
    }
    return arr2;
  }

}
