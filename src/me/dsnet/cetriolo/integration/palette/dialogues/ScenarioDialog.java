/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.palette.dialogues;

import java.awt.Color;
import java.awt.Font;
import me.dsnet.cetriolo.integration.completion.GherkinCompletionNames;

/**
 *
 * @author SessonaD
 */
public class ScenarioDialog extends javax.swing.JDialog {
    
    String description = null;
    boolean docVisible=false;
    GherkinCompletionNames keyword;
    /**
     * Creates new form StepDialog
     */
    public ScenarioDialog(java.awt.Frame parent, boolean modal,GherkinCompletionNames keyword) {
        super(parent, modal);  
        this.keyword=keyword;
        initComponents();
        if(keyword ==  GherkinCompletionNames.SCENARIO){
            scenTitle.setText("  Scenario Title:");
            scenDesc.setText("  Scenario Description:");
            scenSteps.setText("  Scenario Steps:");
        }else if (keyword ==  GherkinCompletionNames.SCENOUT){
            scenTitle.setText("  Scenario Outline Title:");
            scenDesc.setText("  Scenario Outline Description:");
            scenSteps.setText("  Scenario Outline Steps:");
        }else{
            scenTitle.setText("  Background Title:");
            scenDesc.setText("  Background Description:");
            scenSteps.setText("  Background Steps:");
        }
            
        
        setTitle("Add a block...");
        setIconImage(keyword.getIcon(16));
        jLabel1.setIcon(new javax.swing.ImageIcon(keyword.getIcon(64)));
        //jTextArea1.setText(keywordTitle.getDocumentation());
        docEditorPane.setContentType("text/html");
        docEditorPane.setText(keyword.getDocumentation());
        featureTitle.setText(keyword.getExample());
        featureTitle.setFont(new java.awt.Font("Tahoma", Font.ITALIC, 11));
        docEditorPane.setVisible(docVisible);
        docScrollPane.setVisible(docVisible);
        this.pack();
    }

    public String getDescription() {
        return description;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scenTitle = new javax.swing.JLabel();
        featureTitle = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        docScrollPane = new javax.swing.JScrollPane();
        docEditorPane = new javax.swing.JEditorPane();
        scenDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scenarioStepsArea = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        scenarioDescArea = new javax.swing.JTextArea();
        scenSteps = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        helpButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.title")); // NOI18N
        setIconImage(null);

        org.openide.awt.Mnemonics.setLocalizedText(scenTitle, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.scenTitle.text")); // NOI18N

        featureTitle.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        featureTitle.setForeground(new java.awt.Color(102, 102, 102));
        featureTitle.setText(org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.featureTitle.text")); // NOI18N
        featureTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                featureTitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                featureTitleFocusLost(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(okButton, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.okButton.text")); // NOI18N
        okButton.setBorderPainted(false);
        okButton.setFocusPainted(false);
        okButton.setMaximumSize(new java.awt.Dimension(46, 24));
        okButton.setMinimumSize(new java.awt.Dimension(46, 24));
        okButton.setPreferredSize(new java.awt.Dimension(46, 24));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.cancelButton.text")); // NOI18N
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);
        cancelButton.setMaximumSize(new java.awt.Dimension(64, 24));
        cancelButton.setMinimumSize(new java.awt.Dimension(64, 24));
        cancelButton.setPreferredSize(new java.awt.Dimension(64, 24));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/block64.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.jLabel1.text")); // NOI18N

        docScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        docScrollPane.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        docScrollPane.setHorizontalScrollBar(null);

        docEditorPane.setEditable(false);
        docEditorPane.setContentType("text/html"); // NOI18N
        docEditorPane.setText(org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.docEditorPane.text")); // NOI18N
        docScrollPane.setViewportView(docEditorPane);

        org.openide.awt.Mnemonics.setLocalizedText(scenDesc, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.scenDesc.text")); // NOI18N

        scenarioStepsArea.setColumns(20);
        scenarioStepsArea.setRows(5);
        jScrollPane1.setViewportView(scenarioStepsArea);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/step.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton3, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.jButton3.text")); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/step.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton4, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.jButton4.text")); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/step.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton5, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.jButton5.text")); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        scenarioDescArea.setColumns(20);
        scenarioDescArea.setRows(5);
        jScrollPane2.setViewportView(scenarioDescArea);

        org.openide.awt.Mnemonics.setLocalizedText(scenSteps, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.scenSteps.text")); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/step.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton6, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.jButton6.text")); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/step.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jButton7, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.jButton7.text")); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/dsnet/cetriolo/resources/icons/help.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(helpButton, org.openide.util.NbBundle.getMessage(ScenarioDialog.class, "ScenarioDialog.helpButton.text")); // NOI18N
        helpButton.setBorderPainted(false);
        helpButton.setFocusPainted(false);
        helpButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        helpButton.setRequestFocusEnabled(false);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helpButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(featureTitle)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scenSteps)
                                    .addComponent(scenDesc)
                                    .addComponent(scenTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7)))
                                .addGap(0, 95, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scenTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(featureTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scenDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scenSteps, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(docScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        description = null;
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        StringBuilder sb= new StringBuilder();
        if(keyword ==  GherkinCompletionNames.SCENARIO){
            sb.append("\n   Scenario: ");
        }else if(keyword ==  GherkinCompletionNames.SCENOUT){
            sb.append("\n   Scenario Outline: ");
        }else{
            sb.append("\n   Background: ");
        }
        sb.append(featureTitle.getText());
        sb.append("\n      ");
        String desc=scenarioDescArea.getText();
        if(desc!=null && !desc.isEmpty()){
            sb.append(desc.replaceAll("\n", "\n      "));
            sb.append("\n      ");
        }        
        sb.append(scenarioStepsArea.getText().replaceAll("\n", "\n      "));
        description = sb.toString();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addNarrative("When ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addNarrative("Given "); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addNarrative("Then ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        addNarrative("But ");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        addNarrative("And ");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        docVisible = !docVisible;
        docEditorPane.setVisible(docVisible);
        docScrollPane.setVisible(docVisible);
        this.pack();
    }//GEN-LAST:event_helpButtonActionPerformed

    private void featureTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_featureTitleFocusGained
        featureTitle.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 11));
        featureTitle.setForeground(Color.BLACK);
    }//GEN-LAST:event_featureTitleFocusGained

    private void featureTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_featureTitleFocusLost
        featureTitle.setFont(new java.awt.Font("Tahoma", Font.ITALIC, 11));
        featureTitle.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_featureTitleFocusLost
    
    private void addNarrative(String keyWord){
        if(scenarioStepsArea.getText() != null && !scenarioStepsArea.getText().isEmpty()){
            scenarioStepsArea.append("\n" + keyWord );
        }else{
            scenarioStepsArea.setText(keyWord);
        }  
        scenarioStepsArea.requestFocusInWindow();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScenarioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScenarioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScenarioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScenarioDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScenarioDialog dialog = new ScenarioDialog(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JEditorPane docEditorPane;
    private javax.swing.JScrollPane docScrollPane;
    private javax.swing.JTextField featureTitle;
    private javax.swing.JToggleButton helpButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel scenDesc;
    private javax.swing.JLabel scenSteps;
    private javax.swing.JLabel scenTitle;
    private javax.swing.JTextArea scenarioDescArea;
    private javax.swing.JTextArea scenarioStepsArea;
    // End of variables declaration//GEN-END:variables
}
