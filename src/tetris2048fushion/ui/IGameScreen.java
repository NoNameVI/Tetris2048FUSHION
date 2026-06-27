/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris2048fushion.ui;

/**
 * Tiêu chuẩn hóa các khung giao diện.
 */
public interface IGameScreen {

    void updateState();

    void renderGraphics();

    void handleInput(String inputCommand);
}
