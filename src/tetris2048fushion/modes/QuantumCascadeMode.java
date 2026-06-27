/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.modes;

/**
 * Chế độ Quantum Cascade.
 *
 * @author Hoàng
 */
public abstract class QuantumCascadeMode implements IGameMode {
    
    // Kích hoạt phản ứng nổ năng lượng theo bán kính chỉ định
    protected void triggerExplosion(int[][] matrix, int centerRow, int centerCol, int radius, int maxRow, int maxCol) {
        int startRow = Math.max(0, centerRow - radius);
        int endRow = Math.min(maxRow - 1, centerRow + radius);
        int startCol = Math.max(0, centerCol - radius);
        int endCol = Math.min(maxCol - 1, centerCol + radius);

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                matrix[i][j] = 0;
            }
        }
    }
}
