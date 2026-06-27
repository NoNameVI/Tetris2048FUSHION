package tetris2048fushion.core;

/**
 * Cài đặt chi tiết cho các khối gạch cụ thể (Tetromino). Xử lý các phép toán di
 * chuyển và xoay ma trận hình học của khối.
 *
 * @author Minh Thức
 */
public class StandardPolyomino extends AbstractPolyomino {

    public StandardPolyomino(int[][] shape) {
        // Đếm số lượng ô vuông (block) cấu thành nên hình dáng để khởi tạo mảng blockValues
        super(countBlocks(shape));
        this.shapeStructure = shape;

        // Vị trí xuất hiện mặc định khi khối mới được sinh ra
        this.x = 3; // Nằm ở khoảng giữa của lưới (cột 3)
        this.y = 0; // Nằm ở trên đỉnh của lưới (hàng 0)
    }

    // Hàm phụ trợ đếm số lượng ô mang giá trị 1 trong ma trận hình dáng
    private static int countBlocks(int[][] shape) {
        int count = 0;
        for (int[] row : shape) {
            for (int cell : row) {
                if (cell != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }

    @Override
    public void accelerateDown() {
        this.y++;
    }

    @Override
    public void rotate() {
        // Thuật toán xoay ma trận 2D góc 90 độ theo chiều kim đồng hồ
        int rows = shapeStructure.length;
        int cols = shapeStructure[0].length;
        int[][] rotated = new int[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                rotated[c][rows - 1 - r] = shapeStructure[r][c];
            }
        }
        // Cập nhật lại cấu trúc khối sau khi xoay
        this.shapeStructure = rotated;
    }

    // Các hàm Getter cung cấp dữ liệu cho giao diện (UI) và bộ điều khiển (Controller)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getShapeStructure() {
        return shapeStructure;
    }

    public int[] getBlockValues() {
        return blockValues;
    }
}
