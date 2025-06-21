package shapes;

public class Shapes {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ShapesForm().setVisible(true);  // This line is crucial
        });
    }
}