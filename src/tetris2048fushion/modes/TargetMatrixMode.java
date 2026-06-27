/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.modes;

/**
 * Chế độ Target Matrix Challenge.
 *
 * @author Hoàng
 */
public abstract class TargetMatrixMode implements IGameMode {
    
    // Kiểm tra ma trận có tồn tại số lượng khối đạt targetValue yêu cầu hay không
    protected boolean checkTargetBlocksExistence(int[][] matrix, int rows, int cols, int targetValue, int requiredCount) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] >= targetValue) {
                    count++;
                }
            }
        }
        return count >= requiredCount;
    }
}
