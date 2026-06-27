/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.core;

/**
 * Quản lý hệ thống ma trận và thuật toán dồn/hợp nhất số.
 *
 * @author Minh Thức
 */
public interface IGridBoard {

    int getRows(); // Mặc định 20

    int getCols(); // Mặc định 10 

    // TODO (Minh Thức): Lập trình cơ chế dồn ma trận đáy sang trái và hợp nhất [cite: 8, 10]
    void shiftAndMergeBottomLeft();

    // TODO (Minh Thức): Lập trình cơ chế dồn ma trận đáy sang phải và hợp nhất [cite: 9, 10]
    void shiftAndMergeBottomRight();

    // TODO (Minh Thức): Thuật toán dồn dọc tự động và lấp đầy khoảng trống [cite: 11]
    void executeVerticalMerge();

    boolean isGridFull();

    int[][] getMatrixState();
}
