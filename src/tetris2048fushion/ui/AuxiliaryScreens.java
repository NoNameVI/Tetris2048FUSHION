package tetris2048fushion.ui;

import java.util.Scanner;

public class AuxiliaryScreens implements IGameScreen {

    private Scanner sc = new Scanner(System.in);

    // Main Menu
    public void showMainMenu() {

        System.out.println("+------------------------------------------------+");
        System.out.println("|                                                |");
        System.out.println("|             TETRIS 2048 FUSION                 |");
        System.out.println("|                                                |");
        System.out.println("+------------------------------------------------+");
        System.out.println("|                                                |");
        System.out.println("|              [ 1. Play ]                       |");
        System.out.println("|           [ 2. How To Play ]                   |");
        System.out.println("|             [ 3. About Us ]                    |");
        System.out.println("|               [ 4. Quit ]                      |");
        System.out.println("|                                                |");
        System.out.println("+------------------------------------------------+");

        System.out.print("Enter choice (1-4): ");
        handleInput(sc.nextLine());
    }

    // How To Play
    public void showHowToPlay() {
        System.out.println("\n========== HOW TO PLAY ==========");
        System.out.println("1. Observe the falling block.");
        System.out.println("2. Move Left / Right.");
        System.out.println("3. Merge equal numbers.");
        System.out.println("4. Reach 2048 or clear rows.");
        System.out.println("=================================\n");

        System.out.print("Press Enter to return...");
        sc.nextLine();
        showMainMenu();
    }

    // About Us
    public void showAboutUs() {
        System.out.println("\n========== ABOUT US ==========");
        System.out.println("University : FPT University Can Tho");
        System.out.println("Project    : Tetris 2048 Fusion");
        System.out.println("Members:");
        System.out.println("- Minh Thuc");
        System.out.println("- Hoang");
        System.out.println("- Thanh");
        System.out.println("- Han");
        System.out.println("- Vy");
        System.out.println("Mentor: ...");
        System.out.println("==============================\n");

        System.out.print("Press Enter to return...");
        sc.nextLine();
        showMainMenu();
    }

    // Quit
    public void showQuit() {
        System.out.println("\nGoodbye and see you again...");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        }

        System.exit(0);
    }

    @Override
    public void updateState() {
        // Không cần xử lý
    }

    @Override
    public void renderGraphics() {
        showMainMenu();
    }

    @Override
    public void handleInput(String inputCommand) {

        switch (inputCommand) {
            case "1":
                System.out.println("\nStart Game (được nhóm kết nối sau)\n");
                showMainMenu();
                break;

            case "2":
                showHowToPlay();
                break;

            case "3":
                showAboutUs();
                break;

            case "4":
                showQuit();
                break;

            default:
                System.out.println("Invalid choice!");
                showMainMenu();
        }
    }

    public static void main(String[] args) {
        AuxiliaryScreens ui = new AuxiliaryScreens();
        ui.renderGraphics();
        ui.showMainMenu();
    }
}
