/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceUtilisateur;

/**
 *
 * @author Aur�lien
 */
public class ActeUI extends javax.swing.JPanel {

    /**
     * @return the Code
     */
    public javax.swing.JLabel getCode() {
        return Code;
    }

    /**
     * @return the Coef
     */
    public javax.swing.JLabel getCoef() {
        return Coef;
    }

    /**
     * @return the Nom
     */
    public javax.swing.JLabel getNom() {
        return Nom;
    }

    /**
     * @return the type
     */
    public javax.swing.JLabel getType() {
        return type;
    }

    /** Creates new form Acte */
    public ActeUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nom = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        Code = new javax.swing.JLabel();
        Coef = new javax.swing.JLabel();

        Nom.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        Nom.setText("Consultation au cabinet :");

        type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        type.setText("Type : Diagnostique");

        Code.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Code.setText("Code : CS");

        Coef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Coef.setText("Coefficient : 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Nom))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type)
                            .addComponent(Code)
                            .addComponent(Coef))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nom)
                .addGap(18, 18, 18)
                .addComponent(type)
                .addGap(18, 18, 18)
                .addComponent(Code)
                .addGap(18, 18, 18)
                .addComponent(Coef)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Code;
    private javax.swing.JLabel Coef;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

}
