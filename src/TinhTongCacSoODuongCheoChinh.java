import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        int soDongCot;
        int dong = 0;
        int cot = 0;
        int soLonNhat = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng và cột của mảng: ");
        soDongCot = scanner.nextInt();

        int[][] A = new int[soDongCot][soDongCot];
        for (int i = 0; i < soDongCot; i++) {
            for (int j = 0; j < soDongCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDongCot; i++) {
            for (int j = 0; j < soDongCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < soDongCot; i++) {
            for (int j = 0; j < soDongCot; j++) {
                if (i == j) {
                    sum1 += A[i][j];
                }
            }
            for (int m = 0; m < soDongCot; m++) {
                if (i == soDongCot - m - 1) {
                    sum2 += A[i][m];
                }
            }
        }
        if (soDongCot % 2 == 0) {
            System.out.println("Tổng các số trong 2 đường chéo của ma trận vuông là: " + (sum1 + sum2));
        } else {
            System.out.println("Tổng các số trong 2 đường chéo của ma trận vuông là: " + (sum1 + sum2 - A[soDongCot / 2][soDongCot / 2]));
        }
    }
}
