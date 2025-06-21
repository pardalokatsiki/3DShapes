/*

This is the code for the GUI of the program. It is designed like that so the user can choose
a 3D shape of their choice and then put attributes to calculate the mass, volume and area.

This was made with the help of NetBeans IDE 8.2

*/

package shapes;

import javax.swing.JOptionPane;

public class ShapesForm extends javax.swing.JFrame {

    public ShapesForm() {
        initComponents();
        setLayout(null);
        setSize(800, 533);
        setVisible(true);
        setTitle("3D SHAPES");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        // Hide all images before anything
        SphereImage.setVisible(false);
        CubeImage.setVisible(false);
        CylinderImage.setVisible(false);
        PrismImage.setVisible(false);
        
        // Hide all fields
        
        RadiusField.setVisible(false);
        SideField.setVisible(false);
        HeightField.setVisible(false);
        LengthField.setVisible(false);
        WeightField.setVisible(false);
        DensityField.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        SphereIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ChoiceBox = new javax.swing.JComboBox<>();
        Title = new javax.swing.JLabel();
        CalcButton = new javax.swing.JButton();
        SideField = new javax.swing.JTextField();
        PleaseInsert = new javax.swing.JLabel();
        LengthField = new javax.swing.JTextField();
        DensityField = new javax.swing.JTextField();
        RadiusField = new javax.swing.JTextField();
        WeightField = new javax.swing.JTextField();
        HeightField = new javax.swing.JTextField();
        SphereImage = new javax.swing.JLabel();
        CubeImage = new javax.swing.JLabel();
        CylinderImage = new javax.swing.JLabel();
        PrismImage = new javax.swing.JLabel();
        Results = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("jLabel3");

        SphereIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(136, 88, 168));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        ChoiceBox.setBackground(java.awt.SystemColor.activeCaptionBorder);
        ChoiceBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChoiceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sphere", "Cube", "Cylinder", "Rectangular Prism" }));
        ChoiceBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChoiceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiceBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ChoiceBox);
        ChoiceBox.setBounds(280, 60, 222, 38);

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("3D SHAPES!");
        Title.setAlignmentX(10.0F);
        Title.setMaximumSize(new java.awt.Dimension(1000, 1000));
        Title.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(Title);
        Title.setBounds(280, 0, 220, 60);

        CalcButton.setBackground(new java.awt.Color(255, 153, 153));
        CalcButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CalcButton.setText("Calculate");
        CalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CalcButton);
        CalcButton.setBounds(420, 320, 140, 40);

        SideField.setBackground(new java.awt.Color(255, 153, 153));
        SideField.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        SideField.setForeground(new java.awt.Color(102, 0, 102));
        SideField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SideField.setText("Side");
        SideField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SideFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SideField);
        SideField.setBounds(200, 140, 110, 60);

        PleaseInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PleaseInsert.setText("Please insert your attributes. Value should be > 0");
        getContentPane().add(PleaseInsert);
        PleaseInsert.setBounds(210, 110, 360, 20);

        LengthField.setBackground(new java.awt.Color(255, 153, 153));
        LengthField.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        LengthField.setForeground(new java.awt.Color(102, 0, 102));
        LengthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LengthField.setText("Length");
        LengthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LengthFieldActionPerformed(evt);
            }
        });
        getContentPane().add(LengthField);
        LengthField.setBounds(200, 230, 100, 60);

        DensityField.setBackground(new java.awt.Color(255, 153, 153));
        DensityField.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        DensityField.setForeground(new java.awt.Color(102, 0, 102));
        DensityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DensityField.setText("Density");
        getContentPane().add(DensityField);
        DensityField.setBounds(330, 140, 110, 60);

        RadiusField.setBackground(new java.awt.Color(255, 153, 153));
        RadiusField.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        RadiusField.setForeground(new java.awt.Color(102, 0, 102));
        RadiusField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RadiusField.setText("Radius");
        getContentPane().add(RadiusField);
        RadiusField.setBounds(460, 140, 110, 60);

        WeightField.setBackground(new java.awt.Color(255, 153, 153));
        WeightField.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        WeightField.setForeground(new java.awt.Color(102, 0, 102));
        WeightField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WeightField.setText("Weight");
        getContentPane().add(WeightField);
        WeightField.setBounds(460, 230, 100, 60);

        HeightField.setBackground(new java.awt.Color(255, 153, 153));
        HeightField.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        HeightField.setForeground(new java.awt.Color(102, 0, 102));
        HeightField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HeightField.setText("Height");
        HeightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightFieldActionPerformed(evt);
            }
        });
        getContentPane().add(HeightField);
        HeightField.setBounds(330, 230, 100, 60);

        SphereImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shapes/sphere.png"))); // NOI18N
        getContentPane().add(SphereImage);
        SphereImage.setBounds(180, 330, 150, 100);

        CubeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shapes/cube.png"))); // NOI18N
        getContentPane().add(CubeImage);
        CubeImage.setBounds(160, 300, 180, 180);

        CylinderImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shapes/cylinder.png"))); // NOI18N
        CylinderImage.setText("jLabel8");
        getContentPane().add(CylinderImage);
        CylinderImage.setBounds(160, 290, 190, 180);

        PrismImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shapes/prism.png"))); // NOI18N
        getContentPane().add(PrismImage);
        PrismImage.setBounds(160, 320, 220, 120);

        Results.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Results.setText("Results");
        getContentPane().add(Results);
        Results.setBounds(480, 370, 230, 140);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shapes/peach.jpg"))); // NOI18N
        BG.setMaximumSize(new java.awt.Dimension(500, 1040));
        getContentPane().add(BG);
        BG.setBounds(0, -20, 800, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChoiceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiceBoxActionPerformed
       Results.setText(" ");
        // Hide all images before anything
        SphereImage.setVisible(false);
        CubeImage.setVisible(false);
        CylinderImage.setVisible(false);
        PrismImage.setVisible(false);
        
        // Hide all fields
        
        RadiusField.setVisible(false);
        SideField.setVisible(false);
        HeightField.setVisible(false);
        LengthField.setVisible(false);
        WeightField.setVisible(false);
        DensityField.setVisible(true);
        
        String choice = (String) ChoiceBox.getSelectedItem();
        
        switch(choice){
            case "Sphere":
                SphereImage.setVisible(true);
                CubeImage.setVisible(false);
                CylinderImage.setVisible(false);
                PrismImage.setVisible(false);
                RadiusField.setVisible(true);
                SideField.setVisible(false);
                HeightField.setVisible(false);
                LengthField.setVisible(false);
                WeightField.setVisible(false);
                break;
            case "Cube":
                SphereImage.setVisible(false);
                CubeImage.setVisible(true);
                CylinderImage.setVisible(false);
                PrismImage.setVisible(false);
                RadiusField.setVisible(false);
                SideField.setVisible(true);
                HeightField.setVisible(false);
                LengthField.setVisible(false);
                WeightField.setVisible(false);
                break;
            case "Cylinder":
                SphereImage.setVisible(false);
                CubeImage.setVisible(false);
                CylinderImage.setVisible(true);
                PrismImage.setVisible(false);
                RadiusField.setVisible(true);
                SideField.setVisible(false);
                HeightField.setVisible(true);
                LengthField.setVisible(false);
                WeightField.setVisible(false);
                break;
            case "Rectangular Prism":
                SphereImage.setVisible(false);
                CubeImage.setVisible(false);
                CylinderImage.setVisible(false);
                PrismImage.setVisible(true);
                RadiusField.setVisible(false);
                SideField.setVisible(false);
                HeightField.setVisible(true);
                LengthField.setVisible(true);
                WeightField.setVisible(true);
        }
    }//GEN-LAST:event_ChoiceBoxActionPerformed

    private void CalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcButtonActionPerformed
        try{
        String choice = (String) ChoiceBox.getSelectedItem();
        double density = Double.parseDouble(DensityField.getText());
        ThreeDShape shape = null; // Null pointer to shape
        double radius = 0.0;
        double height = 0.0;
        
        switch(choice){
            case "Sphere":
                radius = Double.parseDouble(RadiusField.getText());
                shape = new Sphere(radius, density);
                break;
            case "Cube":
                double side = Double.parseDouble(SideField.getText());
                shape = new Cube(side, density);
                break;
            case "Cylinder":
                radius = Double.parseDouble(RadiusField.getText());
                height = Double.parseDouble(HeightField.getText());
                shape = new Cylinder(height, radius, density);
                break;
            case "Rectangular Prism":
                double length = Double.parseDouble(LengthField.getText());
                double weight = Double.parseDouble(WeightField.getText());
                height = Double.parseDouble(HeightField.getText());
                shape = new RectangularPrism(height, length, weight, density);
        
       }
        if(shape!=null){
            Results.setText(String.format("<html>Volume: %.2f<br>Surface: %.2f<br>Mass: %.2f</html>",
            shape.getVolume(), shape.getSurfaceArea(), shape.getMass()));
        }
       }
       catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
     } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_CalcButtonActionPerformed

    private void SideFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SideFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SideFieldActionPerformed

    private void HeightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeightFieldActionPerformed

    private void LengthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LengthFieldActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton CalcButton;
    private javax.swing.JComboBox<String> ChoiceBox;
    private javax.swing.JLabel CubeImage;
    private javax.swing.JLabel CylinderImage;
    private javax.swing.JTextField DensityField;
    private javax.swing.JTextField HeightField;
    private javax.swing.JTextField LengthField;
    private javax.swing.JLabel PleaseInsert;
    private javax.swing.JLabel PrismImage;
    private javax.swing.JTextField RadiusField;
    private javax.swing.JLabel Results;
    private javax.swing.JTextField SideField;
    private javax.swing.JLabel SphereIcon;
    private javax.swing.JLabel SphereImage;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField WeightField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
