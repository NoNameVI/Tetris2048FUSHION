/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.modes;

import tetris2048fushion.core.IGridBoard;

/**
 * Interface chung cho các chế độ chơi và hệ thống tính điểm.
 *
 * @author Hoàng
 */
public interface IGameMode {

    void processClearMechanic(IGridBoard board);

    int calculateMergeScore(int newValue); // 

    int calculateClearScore(int baseScore, int comboMultiplier); // 

    boolean isWinConditionMet(IGridBoard board);
}
