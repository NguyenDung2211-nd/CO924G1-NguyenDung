package ss15_exception_va_debug.bai_tap.su_dung_lop_illegaltriangle_exception;

public class Triangle {
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng của hai cạnh phải lớn hơn cạnh còn lại.");
        }
    }
}
