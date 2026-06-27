package tetris2048fushion.core;

import java.util.Random;

/**
 * Lớp chịu trách nhiệm sinh ngẫu nhiên các khối gạch (Factory Pattern). Đảm bảo
 * hệ thống cung cấp khối mới liên tục khi khối cũ đã rơi chạm đáy.
 *
 * @author Minh Thức
 */
public class PolyominoFactory {

    // Định nghĩa cấu trúc không gian của 7 khối Tetromino chuẩn (1 là có gạch, 0 là khoảng trống)
    private static final int[][][] SHAPES = {
        // 1. Khối I (Thanh dài)
        {{1, 1, 1, 1}},
        // 2. Khối O (Hình vuông)
        {{1, 1},
        {1, 1}},
        // 3. Khối T
        {{0, 1, 0},
        {1, 1, 1}},
        // 4. Khối L
        {{1, 0},
        {1, 0},
        {1, 1}},
        // 5. Khối J
        {{0, 1},
        {0, 1},
        {1, 1}},
        // 6. Khối S
        {{0, 1, 1},
        {1, 1, 0}},
        // 7. Khối Z
        {{1, 1, 0},
        {0, 1, 1}}
    };

    private static final Random RANDOM = new Random();

    /**
     * Phương thức dùng để sinh ra một khối gạch mới.
     *
     * @return Một đối tượng StandardPolyomino đã được gán hình dáng và số ngẫu
     * nhiên (2,4,8).
     */
    public static StandardPolyomino generateRandomPolyomino() {
        int shapeIndex = RANDOM.nextInt(SHAPES.length);
        int[][] selectedShape = SHAPES[shapeIndex];

        return new StandardPolyomino(selectedShape);
    }
}
