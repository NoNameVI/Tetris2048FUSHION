/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.controller;

import tetris2048fushion.core.AbstractPolyomino;
import tetris2048fushion.core.IGridBoard;

/**
 * Cầu nối xử lý tương tác kép.
 *
 * @author Thanh
 */
public interface IGameController {

    // TODO (Thanh): Xử lý luồng bắt sự kiện, đồng bộ khối rơi sang trái và ma trận đáy dồn trái 
    void handleInputLeft(AbstractPolyomino fallingBlock, IGridBoard board);

    // TODO (Thanh): Xử lý luồng bắt sự kiện, đồng bộ khối rơi sang phải và ma trận đáy dồn phải 
    void handleInputRight(AbstractPolyomino fallingBlock, IGridBoard board);

    // TODO (Thanh): Tăng tốc độ rơi 1 bước, không ảnh hưởng trạng thái khối dưới đáy 
    void handleInputDown(AbstractPolyomino fallingBlock);
}
