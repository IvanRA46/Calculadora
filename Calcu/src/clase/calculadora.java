/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author ivanc
 */
public class calculadora extends javax.swing.JFrame{

    public  float primernumero;
    public  float segundonumero;
    public String operador;
    String caracter;
   
    
    /**
     * Creates new form calculadora
     */
    public calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        eventosdelteclado();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_resultado = new javax.swing.JLabel();
        btn_menos = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_uno = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        lbl_resultado.setBackground(new java.awt.Color(0, 153, 51));
        lbl_resultado.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_resultado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_resultado.setText("0");
        lbl_resultado.setName("lbl_resultado"); // NOI18N
        lbl_resultado.setOpaque(true);

        btn_menos.setBackground(new java.awt.Color(255, 204, 51));
        btn_menos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_menos.setForeground(new java.awt.Color(255, 255, 255));
        btn_menos.setText("-");
        btn_menos.setName("btn_menos"); // NOI18N
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 204, 51));
        btn_limpiar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("C");
        btn_limpiar.setName("btn_limpiar"); // NOI18N
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_dividir.setBackground(new java.awt.Color(255, 204, 51));
        btn_dividir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_dividir.setForeground(new java.awt.Color(255, 255, 255));
        btn_dividir.setText("/");
        btn_dividir.setName("btn_dividir"); // NOI18N
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });

        btn_multiplicar.setBackground(new java.awt.Color(255, 204, 51));
        btn_multiplicar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiplicar.setText("X");
        btn_multiplicar.setName("btn_multi"); // NOI18N
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });

        btn_nueve.setBackground(new java.awt.Color(255, 255, 153));
        btn_nueve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_nueve.setText("9");
        btn_nueve.setName("btn_nueve"); // NOI18N
        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_ocho.setBackground(new java.awt.Color(255, 255, 153));
        btn_ocho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ocho.setText("8");
        btn_ocho.setName("btn_ocho"); // NOI18N
        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_siete.setBackground(new java.awt.Color(255, 255, 153));
        btn_siete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_siete.setText("7");
        btn_siete.setName("btn_siete"); // NOI18N
        btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sieteActionPerformed(evt);
            }
        });

        btn_cuatro.setBackground(new java.awt.Color(255, 255, 153));
        btn_cuatro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cuatro.setText("4");
        btn_cuatro.setName("btn_cuatro"); // NOI18N
        btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuatroActionPerformed(evt);
            }
        });

        btn_cinco.setBackground(new java.awt.Color(255, 255, 153));
        btn_cinco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cinco.setText("5");
        btn_cinco.setName("btn_cinco"); // NOI18N
        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_seis.setBackground(new java.awt.Color(255, 255, 153));
        btn_seis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_seis.setText("6");
        btn_seis.setName("btn_seis"); // NOI18N
        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_suma.setBackground(new java.awt.Color(255, 153, 0));
        btn_suma.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setText("+");
        btn_suma.setName("btn_mas"); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_uno.setBackground(new java.awt.Color(255, 255, 153));
        btn_uno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_uno.setText("1");
        btn_uno.setName("btn_uno"); // NOI18N
        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_dos.setBackground(new java.awt.Color(255, 255, 153));
        btn_dos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_dos.setText("2");
        btn_dos.setName("btn_dos"); // NOI18N
        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_tres.setBackground(new java.awt.Color(255, 255, 153));
        btn_tres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_tres.setText("3");
        btn_tres.setName("btn_tres"); // NOI18N
        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_cero.setBackground(new java.awt.Color(255, 255, 153));
        btn_cero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cero.setText("0");
        btn_cero.setName("btn_cero"); // NOI18N
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });

        btn_punto.setBackground(new java.awt.Color(204, 204, 0));
        btn_punto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_punto.setText(".");
        btn_punto.setName("btn_punto"); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_igual.setBackground(new java.awt.Color(255, 153, 0));
        btn_igual.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setText("=");
        btn_igual.setName("btn_igual"); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_cero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cero, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(btn_punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"1");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"1");
        }
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
       this.lbl_resultado.setText(this.lbl_resultado.getText()+"0");
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
           if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"2");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"2");
        }
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
               if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"3");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"3");
        }
    }//GEN-LAST:event_btn_tresActionPerformed

    private void btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuatroActionPerformed
        if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"4");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"4");
        }
    }//GEN-LAST:event_btn_cuatroActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"5");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"5");
        }
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"6");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"6");
        }
    }//GEN-LAST:event_btn_seisActionPerformed

    private void btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sieteActionPerformed
        if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"7");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"7");
        }
    }//GEN-LAST:event_btn_sieteActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"8");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"8");
        }
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        if(!(this.lbl_resultado.getText()=="0")){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"9");
        }else{
            this.lbl_resultado.setText("");
            this.lbl_resultado.setText(this.lbl_resultado.getText()+"9");
        }
    }//GEN-LAST:event_btn_nueveActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        this.lbl_resultado.setText("0");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        this.primernumero=Float.parseFloat(this.lbl_resultado.getText());
        this.operador="+";
        this.lbl_resultado.setText("0");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        this.segundonumero=Float.parseFloat(this.lbl_resultado.getText());
        switch(this.operador){
            case "+":this.lbl_resultado.setText(corto(this.primernumero+this.segundonumero));break;
            case "-":this.lbl_resultado.setText(corto(this.primernumero-this.segundonumero));break;
            case "*":this.lbl_resultado.setText(corto(this.primernumero*this.segundonumero));break;
            case "/":this.lbl_resultado.setText(corto(this.primernumero/this.segundonumero));break;
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        this.primernumero=Float.parseFloat(this.lbl_resultado.getText());
        this.operador="-";
        this.lbl_resultado.setText("0");
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        this.primernumero=Float.parseFloat(this.lbl_resultado.getText());
        this.operador="*";
        this.lbl_resultado.setText("0");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        this.primernumero=Float.parseFloat(this.lbl_resultado.getText());
        this.operador="/";
        this.lbl_resultado.setText("0");
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        if(!(this.lbl_resultado.getText().contains("."))){
            this.lbl_resultado.setText(this.lbl_resultado.getText()+".");
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    
    public String corto(float resultado){
        String retorno="";
        retorno=Float.toString(resultado);
        if(resultado%1==0){
            retorno=retorno.substring(0, retorno.length()-2);
        }
        return retorno;
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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    private javax.swing.JLabel lbl_resultado;
    // End of variables declaration//GEN-END:variables

    private void eventosdelteclado(){
        KeyListener eventoteclado = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                 caracter = KeyEvent.getKeyText(e.getKeyCode());
        lbl_resultado.setText("s");
            }

            @Override
            public void keyPressed(KeyEvent e) {
             caracter = KeyEvent.getKeyText(e.getKeyCode());
        lbl_resultado.setText("s");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        lbl_resultado.addKeyListener(eventoteclado);
    }
   
}
