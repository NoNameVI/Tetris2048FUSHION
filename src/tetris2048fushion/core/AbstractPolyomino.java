/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.core;

import java.util.Random;
/**
 * Đại diện cho các khối gạch rơi tự do (Polyominoes).
 *
 * @author Minh Thức
 */
public abstract class AbstractPolyomino {

    protected int x, y;
    protected int[][] shapeStructure;
    protected int[] blockValues; // TODO (Minh Thức): Khởi tạo ngẫu nhiên giá trị 2, 4, 8 
// Khởi tạo ngẫu nhiên giá trị 2, 4, 8 cho khối
    public AbstractPolyomino(int size) {
        blockValues = new int[size];
        Random random = new Random();
        int[] allowedValues = {2, 4, 8};

        for (int i = 0; i < size; i++) {
            blockValues[i] = allowedValues[random.nextInt(allowedValues.length)];
        }
    }

    public abstract void moveLeft();

    public abstract void moveRight();

    public abstract void accelerateDown();

    public abstract void rotate();
}
