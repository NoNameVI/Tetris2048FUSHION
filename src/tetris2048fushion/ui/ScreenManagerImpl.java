package tetris2048fushion.ui;

public class ScreenManagerImpl implements IScreenManager {
    private IGameScreen currentScreen;

    @Override
    public void changeScreen(IGameScreen newScreen) {
        this.currentScreen = newScreen;
        clearConsole();
        this.currentScreen.renderGraphics();
    }

    @Override
    public void exitApplication() {
        clearConsole();
        System.out.println("\nGoodbye and see you again...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        }
        System.exit(0);
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
