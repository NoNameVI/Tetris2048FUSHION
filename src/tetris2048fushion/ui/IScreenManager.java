/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.ui;

/**
 * Quản lý luồng chuyển đổi giữa 5 khung màn hình.
 *
 * @author Vy
 */
public interface IScreenManager {

    void changeScreen(IGameScreen newScreen);

    void exitApplication();
}
