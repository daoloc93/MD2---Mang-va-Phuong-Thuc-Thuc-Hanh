import java.util.Scanner;

public class TinhTongCacSoTrong1Cot {
    public static void main(String[] args) {
        int soDong, soCot;
        int dong = 0;
        int cot = 0;
        int soLonNhat = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng:");
        soCot = scanner.nextInt();

        int[][] A = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.print("Nhập vào cột mà bạn muốn tính tổng: ");
        int inputCot = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < soDong; i++) {
            sum += A[i][inputCot];
        }
        System.out.println("Tổng của các số trong cột " + inputCot + " là: " + sum);
    }
}
