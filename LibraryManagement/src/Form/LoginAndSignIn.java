package Form;


public class LoginAndSignIn {
    public static void main(String[] args) {
        JFLogin LoginFrame = new JFLogin(); // tạo đối tượng LoginFrame từ lớp JFLogin
        LoginFrame.setVisible(true); // hiển thị cửa sổ LoginFrame
        LoginFrame.pack(); // điều chỉnh cửa sổ sao cho vừa với thành phần bên trong (chưa được)
        LoginFrame.setLocationRelativeTo(null); // đặt cửa sổ ở giữa màn hình
    }
}
