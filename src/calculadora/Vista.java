/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Jhon Deyner
 */
public class Vista extends javax.swing.JFrame {
    
    String memoria1;
    String signo;
    String memoria2;
    Double memoria4;
    Double memoria5;
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnb9 = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnmen = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnig = new javax.swing.JButton();
        btnx = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnpunt = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        btndivx = new javax.swing.JButton();
        btnmm = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btnce = new javax.swing.JButton();
        btnra = new javax.swing.JButton();
        btnp1 = new javax.swing.JButton();
        btnp2 = new javax.swing.JButton();
        btnoff = new javax.swing.JButton();
        btnprc = new javax.swing.JButton();
        txtpant = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setBackground(java.awt.Color.black);
        jcMousePanel1.setForeground(new java.awt.Color(255, 255, 255));
        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/5501edf1c651bea1a08623a8d2999087.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnb9.setBackground(new java.awt.Color(255, 255, 255));
        btnb9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnb9.setText("9");
        btnb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnb9ActionPerformed(evt);
            }
        });

        btndiv.setBackground(java.awt.Color.black);
        btndiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnmen.setBackground(java.awt.Color.black);
        btnmen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmen.setText("-");
        btnmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnig.setBackground(java.awt.Color.black);
        btnig.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnig.setText("=");
        btnig.setMaximumSize(new java.awt.Dimension(43, 31));
        btnig.setMinimumSize(new java.awt.Dimension(43, 31));
        btnig.setPreferredSize(new java.awt.Dimension(43, 31));
        btnig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigActionPerformed(evt);
            }
        });

        btnx.setBackground(java.awt.Color.black);
        btnx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnx.setText("x");
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btnpunt.setBackground(java.awt.Color.black);
        btnpunt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnpunt.setText(".");
        btnpunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnmas.setBackground(java.awt.Color.black);
        btnmas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnmas.setText("+");
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });

        btndivx.setBackground(java.awt.Color.black);
        btndivx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btndivx.setText("1/x");
        btndivx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivxActionPerformed(evt);
            }
        });

        btnmm.setBackground(java.awt.Color.black);
        btnmm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnmm.setText("+/-");
        btnmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmmActionPerformed(evt);
            }
        });

        btnc.setBackground(java.awt.Color.black);
        btnc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnc.setText("C");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnce.setBackground(java.awt.Color.black);
        btnce.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnce.setText("CE");
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });

        btnra.setBackground(java.awt.Color.black);
        btnra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnra.setText("√");
        btnra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraActionPerformed(evt);
            }
        });

        btnp1.setBackground(java.awt.Color.black);
        btnp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnp1.setText(")");
        btnp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp1ActionPerformed(evt);
            }
        });

        btnp2.setBackground(java.awt.Color.black);
        btnp2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnp2.setText("(");
        btnp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp2ActionPerformed(evt);
            }
        });

        btnoff.setBackground(new java.awt.Color(255, 0, 0));
        btnoff.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        btnoff.setText("OFF");
        btnoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoffActionPerformed(evt);
            }
        });

        btnprc.setBackground(java.awt.Color.black);
        btnprc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnprc.setText("%");
        btnprc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtpant)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpunt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(btnce, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndivx, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnig, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnb9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnx, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                        .addComponent(btnmen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnp2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnprc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnoff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtpant, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnprc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btnp2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnig, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnmas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnp1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnce, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btndivx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnoff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnb9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpunt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoffActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnoffActionPerformed

    private void btnp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp2ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+")");
    }//GEN-LAST:event_btnp2ActionPerformed

    private void btnmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmmActionPerformed
        // TODO add your handling code here:
        Double num;
        String cadena;
        cadena=txtpant.getText();
        if (cadena.length()>0) {
            num=(-1)*Double.parseDouble(cadena);
            txtpant.setText(num.toString());
        }
    }//GEN-LAST:event_btnmmActionPerformed

    private void btnmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenActionPerformed
        // TODO add your handling code here:
        if (!txtpant.getText().equals("")) {
            memoria1=txtpant.getText();
            signo="-";
            txtpant.setText("");
        }
    }//GEN-LAST:event_btnmenActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnb9ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"9");
    }//GEN-LAST:event_btnb9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntActionPerformed
        // TODO add your handling code here:
        String cadena;
        cadena=txtpant.getText();
        
        if (cadena.length()<=0) {
            txtpant.setText("0.");
        } 
        else {
            if (!existepunto(txtpant.getText())){ 
                txtpant.setText(txtpant.getText()+".");
        } 
        }        
    }//GEN-LAST:event_btnpuntActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here:
        String cadena;
        cadena=txtpant.getText();
        if(cadena.length()>0){
            cadena=cadena.substring(0, cadena.length()-1);
            txtpant.setText(cadena);
        }
        
    }//GEN-LAST:event_btncActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
        // TODO add your handling code here:
        txtpant.setText("");
    }//GEN-LAST:event_btnceActionPerformed

    private void btndivxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivxActionPerformed
        // TODO add your handling code here:
        String cadena;
        Double num;
        cadena=txtpant.getText();
        if (cadena.length()>0) {
            num=1/(Double.parseDouble(cadena));
            txtpant.setText(num.toString());
        }
    }//GEN-LAST:event_btndivxActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
        // TODO add your handling code here:
        if (!txtpant.getText().equals("")) {
            memoria1=txtpant.getText();
            signo="+";
            txtpant.setText("");
        }
    }//GEN-LAST:event_btnmasActionPerformed

    private void btnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxActionPerformed
        // TODO add your handling code here:
        if (!txtpant.getText().equals("")) {
            memoria1=txtpant.getText();
            signo="*";
            txtpant.setText("");
        }
    }//GEN-LAST:event_btnxActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        // TODO add your handling code here:
        if (!txtpant.getText().equals("")) {
            memoria1=txtpant.getText();
            signo="/";
            txtpant.setText("");
        }
    }//GEN-LAST:event_btndivActionPerformed

    private void btnigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigActionPerformed
        // TODO add your handling code here:
        String resultado;
        memoria2=txtpant.getText();
        if (!memoria2.equals("")) {
            resultado=calculadora(memoria1,memoria2,signo);
            txtpant.setText(resultado);
        }
    }//GEN-LAST:event_btnigActionPerformed

    private void btnp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp1ActionPerformed
        // TODO add your handling code here:
        txtpant.setText(txtpant.getText()+"(");
    }//GEN-LAST:event_btnp1ActionPerformed

    private void btnraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraActionPerformed
        // TODO add your handling code here:
        Double memoria3;
        memoria3 = Double.parseDouble(txtpant.getText());
        if (memoria3 >=0) {
            txtpant.setText(Math.sqrt(memoria3)+ " ");            
        }else {
            txtpant.setText("error");
        }
    }//GEN-LAST:event_btnraActionPerformed

    private void btnprcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprcActionPerformed
        // TODO add your handling code here:
        memoria4 = Double.parseDouble(txtpant.getText());
        txtpant.setText((memoria5*memoria4)/100 +" ");
        
    }//GEN-LAST:event_btnprcActionPerformed
    public static String calculadora(String memoria1,String memoria2,String signo){
        Double resultado=0.0;
        String respuesta;
        if(signo.equals("-")){
            resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);            
        }
        if(signo.equals("+")){
            resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);            
        }
        if(signo.equals("/")){
            resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);            
        }
        if(signo.equals("*")){
            resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);            
        }
        if(signo.equals("%")){
            
        }
        respuesta=resultado.toString();
        return respuesta;
    }


    public static boolean existepunto(String cadena){
        boolean resultado;
        resultado=false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
            resultado=true;
            break;
            }
        }
        return resultado;
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnb9;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnce;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndivx;
    private javax.swing.JButton btnig;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmen;
    private javax.swing.JButton btnmm;
    private javax.swing.JButton btnoff;
    private javax.swing.JButton btnp1;
    private javax.swing.JButton btnp2;
    private javax.swing.JButton btnprc;
    private javax.swing.JButton btnpunt;
    private javax.swing.JButton btnra;
    private javax.swing.JButton btnx;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JTextField txtpant;
    // End of variables declaration//GEN-END:variables
}
