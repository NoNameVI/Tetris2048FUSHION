/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.modes;

/**
 * Chế độ Classic Line-Clear.
 *
 * @author Hoàng
 */
public abstract class ClassicLineClearMode implements IGameMode {
    
    // Tính hệ số đồng nhất: cộng dồn nếu các ô kề nhau có giá trị giống nhau
    protected int calculateHomogeneity(int[] row) {
        int homogeneityMultiplier = 1;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]) {
                homogeneityMultiplier++;
            }
        }
        return homogeneityMultiplier;
    }
}
