/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulapostfija;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EJRH2
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    FormulaParser parser = new FormulaParser();

    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_formula = new javax.swing.JTextField();
        lb_formula = new javax.swing.JLabel();
        bt_evaluar = new javax.swing.JButton();
        bt_salir = new javax.swing.JButton();
        bt_sqrt = new javax.swing.JButton();
        bt_facto = new javax.swing.JButton();
        bt_plus = new javax.swing.JButton();
        bt_clean = new javax.swing.JButton();
        bt_minus = new javax.swing.JButton();
        bt_multiply = new javax.swing.JButton();
        bt_divide = new javax.swing.JButton();
        bt_tan = new javax.swing.JButton();
        bt_cos = new javax.swing.JButton();
        bt_sin = new javax.swing.JButton();
        bt_pot = new javax.swing.JButton();
        bt_pLeft = new javax.swing.JButton();
        b_pRight = new javax.swing.JButton();
        bt_0 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_backspace = new javax.swing.JButton();
<<<<<<< HEAD
=======
        jPanel1 = new javax.swing.JPanel();
        bt_f = new javax.swing.JButton();
        bt_e = new javax.swing.JButton();
        bt_d = new javax.swing.JButton();
        bt_c = new javax.swing.JButton();
        bt_b = new javax.swing.JButton();
        bt_a = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textResult = new javax.swing.JTextArea();
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");

        lb_formula.setText("Inserte la formula que desea evaluar:");

        bt_evaluar.setText("Evaluar");
        bt_evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_evaluarActionPerformed(evt);
            }
        });

        bt_salir.setText("Salir");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        bt_sqrt.setText("SQRT");
        bt_sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sqrtActionPerformed(evt);
            }
        });

        bt_facto.setText("FACTO");
        bt_facto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_factoActionPerformed(evt);
            }
        });

        bt_plus.setText("+");
        bt_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_plusActionPerformed(evt);
            }
        });

        bt_clean.setText("Limpiar");
        bt_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cleanActionPerformed(evt);
            }
        });

        bt_minus.setText("-");
        bt_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_minusActionPerformed(evt);
            }
        });

        bt_multiply.setText("*");
        bt_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multiplyActionPerformed(evt);
            }
        });

        bt_divide.setText("/");
        bt_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_divideActionPerformed(evt);
            }
        });

        bt_tan.setText("TAN");
        bt_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tanActionPerformed(evt);
            }
        });

        bt_cos.setText("COS");
        bt_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cosActionPerformed(evt);
            }
        });

        bt_sin.setText("SIN");
        bt_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sinActionPerformed(evt);
            }
        });

        bt_pot.setText("^");
        bt_pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_potActionPerformed(evt);
            }
        });

        bt_pLeft.setText("(");
        bt_pLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pLeftActionPerformed(evt);
            }
        });

        b_pRight.setText(")");
        b_pRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pRightActionPerformed(evt);
            }
        });

        bt_0.setText("0");
        bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_0ActionPerformed(evt);
            }
        });

        bt_1.setText("1");
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });

        bt_2.setText("2");
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });

        bt_3.setText("3");
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });

        bt_4.setText("4");
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });

        bt_5.setText("5");
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_6.setText("6");
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_7.setText("7");
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        bt_8.setText("8");
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });

        bt_9.setText("9");
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });

        bt_backspace.setText("⇦");
        bt_backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backspaceActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        bt_f.setText("F");
        bt_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fActionPerformed(evt);
            }
        });

        bt_e.setText("E");
        bt_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eActionPerformed(evt);
            }
        });

        bt_d.setText("D");
        bt_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dActionPerformed(evt);
            }
        });

        bt_c.setText("C");
        bt_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cActionPerformed(evt);
            }
        });

        bt_b.setText("B");
        bt_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bActionPerformed(evt);
            }
        });

        bt_a.setText("A");
        bt_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_aActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_d)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_e)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_f)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_a)
                    .addComponent(bt_b)
                    .addComponent(bt_c)
                    .addComponent(bt_d)
                    .addComponent(bt_e)
                    .addComponent(bt_f))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textResult.setEditable(false);
        textResult.setBackground(new java.awt.Color(204, 204, 204));
        textResult.setColumns(20);
        textResult.setRows(5);
        jScrollPane1.setViewportView(textResult);

>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
=======
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_facto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_tan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_cos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_formula, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_clean)
                            .addComponent(bt_evaluar))
                        .addContainerGap(13, Short.MAX_VALUE))
<<<<<<< HEAD
=======
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_salir)
                        .addContainerGap())
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_formula)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_plus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_multiply)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_pot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_pLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_pRight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_backspace))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_9)))
                        .addGap(0, 0, Short.MAX_VALUE))))
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_salir)
                .addContainerGap())
=======
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_formula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_evaluar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tf_formula)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sqrt)
                    .addComponent(bt_facto)
                    .addComponent(bt_clean)
                    .addComponent(bt_tan)
                    .addComponent(bt_cos)
                    .addComponent(bt_sin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_plus)
                    .addComponent(bt_minus)
                    .addComponent(bt_divide)
                    .addComponent(bt_pot)
                    .addComponent(bt_pLeft)
                    .addComponent(b_pRight)
                    .addComponent(bt_multiply)
                    .addComponent(bt_0)
                    .addComponent(bt_backspace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_1)
                    .addComponent(bt_2)
                    .addComponent(bt_3)
                    .addComponent(bt_4)
                    .addComponent(bt_5)
                    .addComponent(bt_6)
                    .addComponent(bt_7)
                    .addComponent(bt_8)
                    .addComponent(bt_9))
<<<<<<< HEAD
                .addGap(18, 18, 18)
                .addComponent(bt_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bt_salirActionPerformed

    private void bt_evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_evaluarActionPerformed
        // TODO add your handling code here:
        String formula = tf_formula.getText();
        if (!formula.equals("")) {
            try {
                this.textResult.setForeground(Color.black);
                this.textResult.setText( parser.parse(formula) );
            } catch (InvalidExpressionException ex) {
                this.textResult.setForeground(Color.red);
                this.textResult.setText(ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_evaluarActionPerformed

    private void bt_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cleanActionPerformed
        // TODO add your handling code here:
        tf_formula.setText("");
    }//GEN-LAST:event_bt_cleanActionPerformed

    private void bt_sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sqrtActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "SQRT");
    }//GEN-LAST:event_bt_sqrtActionPerformed

    private void bt_factoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_factoActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "FACTO");
    }//GEN-LAST:event_bt_factoActionPerformed

    private void bt_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tanActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "TAN");
    }//GEN-LAST:event_bt_tanActionPerformed

    private void bt_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cosActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "COS");
    }//GEN-LAST:event_bt_cosActionPerformed

    private void bt_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sinActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "SIN");
    }//GEN-LAST:event_bt_sinActionPerformed

    private void bt_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_plusActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "+");
    }//GEN-LAST:event_bt_plusActionPerformed

    private void bt_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_minusActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "-");
    }//GEN-LAST:event_bt_minusActionPerformed

    private void bt_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multiplyActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "*");
    }//GEN-LAST:event_bt_multiplyActionPerformed

    private void bt_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_divideActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "/");
    }//GEN-LAST:event_bt_divideActionPerformed

    private void bt_potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_potActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "^");
    }//GEN-LAST:event_bt_potActionPerformed

    private void bt_pLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pLeftActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "(");
    }//GEN-LAST:event_bt_pLeftActionPerformed

    private void b_pRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pRightActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + ")");
    }//GEN-LAST:event_b_pRightActionPerformed

    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_0ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "0");
    }//GEN-LAST:event_bt_0ActionPerformed

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "1");
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "2");
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "3");
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "4");
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "5");
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "6");
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "7");
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "8");
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        // TODO add your handling code here:
        tf_formula.setText(tf_formula.getText() + "9");
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backspaceActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
      tf_formula.setText (tf_formula.getText ().substring (0, tf_formula.getText ().length () - 1));
    }//GEN-LAST:event_bt_backspaceActionPerformed

=======
        if(tf_formula.getText().length() > 0) {
            tf_formula.setText (tf_formula.getText ().substring (0, tf_formula.getText ().length () - 1));
        }
    }//GEN-LAST:event_bt_backspaceActionPerformed

    private void bt_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_aActionPerformed
        tf_formula.setText(tf_formula.getText() + "A");
    }//GEN-LAST:event_bt_aActionPerformed

    private void bt_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bActionPerformed
        tf_formula.setText(tf_formula.getText() + "B");
    }//GEN-LAST:event_bt_bActionPerformed

    private void bt_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cActionPerformed
        tf_formula.setText(tf_formula.getText() + "C");
    }//GEN-LAST:event_bt_cActionPerformed

    private void bt_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dActionPerformed
        tf_formula.setText(tf_formula.getText() + "D");
    }//GEN-LAST:event_bt_dActionPerformed

    private void bt_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eActionPerformed
        tf_formula.setText(tf_formula.getText() + "E");
    }//GEN-LAST:event_bt_eActionPerformed

    private void bt_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fActionPerformed
        tf_formula.setText(tf_formula.getText() + "F");
    }//GEN-LAST:event_bt_fActionPerformed

>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    public void showErrorDialog(Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_pRight;
    private javax.swing.JButton bt_0;
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
<<<<<<< HEAD
    private javax.swing.JButton bt_backspace;
    private javax.swing.JButton bt_clean;
    private javax.swing.JButton bt_cos;
    private javax.swing.JButton bt_divide;
=======
    private javax.swing.JButton bt_a;
    private javax.swing.JButton bt_b;
    private javax.swing.JButton bt_backspace;
    private javax.swing.JButton bt_c;
    private javax.swing.JButton bt_clean;
    private javax.swing.JButton bt_cos;
    private javax.swing.JButton bt_d;
    private javax.swing.JButton bt_divide;
    private javax.swing.JButton bt_e;
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
    private javax.swing.JButton bt_evaluar;
    private javax.swing.JButton bt_f;
    private javax.swing.JButton bt_facto;
    private javax.swing.JButton bt_minus;
    private javax.swing.JButton bt_multiply;
    private javax.swing.JButton bt_pLeft;
    private javax.swing.JButton bt_plus;
    private javax.swing.JButton bt_pot;
    private javax.swing.JButton bt_salir;
    private javax.swing.JButton bt_sin;
    private javax.swing.JButton bt_sqrt;
    private javax.swing.JButton bt_tan;
<<<<<<< HEAD
=======
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
>>>>>>> fba6f0a1af576c4e6d8d1c1aadacba61db4a7b3a
    private javax.swing.JLabel lb_formula;
    private javax.swing.JTextArea textResult;
    private javax.swing.JTextField tf_formula;
    // End of variables declaration//GEN-END:variables
}