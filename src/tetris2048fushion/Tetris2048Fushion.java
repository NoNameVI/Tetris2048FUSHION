package tetris2048fushion;

// Import các interface từ các package đã định nghĩa
// import tetris2048fushion.ui.IScreenManager;
/**
 * Điểm khởi chạy của dự án Tetris 2048 Fusion. Nhiệm vụ: Tích hợp và khởi chạy
 * các module hệ thống.
 *
 * @author Minh Thức
 */
public class Tetris2048Fushion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Đảm bảo khởi chạy UI trên luồng an toàn
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // TODO (Minh Thức): Khởi tạo đối tượng quản lý màn hình (ScreenManager)
                // IScreenManager screenManager = new ScreenManagerImpl();

                // TODO (Minh Thức): Thiết lập màn hình khởi điểm là Main Menu
                // screenManager.changeScreen(new MainMenuScreen());
            }
        });
    }

}
