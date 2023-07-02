package conversor.views;

import conversor.controllers.CurrencyController;
import conversor.models.Currency;
import javax.swing.JOptionPane;

/**
 * Clase Vista ModifyCurrencyView.
 * 
 * Esta clase es la vista para la modificación de las monedas.
 * 
 * @author Luigi Salcedo
 */
public class ModifyCurrencyView extends javax.swing.JFrame {

    private ConversorApp parent;
    
    public ModifyCurrencyView(ConversorApp parent) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoLabel = new javax.swing.JLabel();
        codigoInput = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        nombreInput = new javax.swing.JTextField();
        costoLabel = new javax.swing.JLabel();
        costoInput = new javax.swing.JTextField();
        buscarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        codigoLabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        codigoLabel.setText("Código (Ej: USD):");

        codigoInput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        codigoInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nombreLabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        nombreLabel.setText("Nombre (Ej: Peso):");

        nombreInput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        nombreInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombreInput.setEnabled(false);

        costoLabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        costoLabel.setText("Costo de un USD:");

        costoInput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        costoInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        costoInput.setEnabled(false);

        buscarButton.setBackground(new java.awt.Color(204, 255, 204));
        buscarButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        modificarButton.setBackground(new java.awt.Color(153, 255, 204));
        modificarButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        modificarButton.setText("Modificar");
        modificarButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modificarButton.setEnabled(false);
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoInput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreInput, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(costoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costoInput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoLabel)
                    .addComponent(costoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        Currency currency = CurrencyController.searchCurrency(codigoInput.getText().toUpperCase());
        if(currency.getCode().equals("USD")){
            JOptionPane.showMessageDialog(null, "Esta moneda no se puede modificar.");
            return;
        }
        if(currency == null){
            JOptionPane.showMessageDialog(null,
                    "No se ha encontrado la moneda con código: " + codigoInput.getText(),
                    "Moneda no encontrada",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        updateState(currency);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        Currency currency = CurrencyController.searchCurrency(codigoInput.getText().toUpperCase());
        if(CurrencyController.modifyCurrency(costoInput.getText(), 
                                                   nombreInput.getText(),
                                                   codigoInput.getText()))
        {
            updateState(null);
            parent.remakeOptions();
        }
    }//GEN-LAST:event_modificarButtonActionPerformed

    /**
     * Función actualiza los estados de los componentes de la vista.
     * @param currency  
     */
    private void updateState(Currency currency)
    {
       boolean updating = currency != null;
       codigoInput.setEnabled(!updating);
       codigoInput.setText(updating ? currency.getCode() : "");
       
       nombreInput.setEnabled(updating);
       nombreInput.setText(updating ? currency.getName() : "");
       
       costoInput.setEnabled(updating);
       costoInput.setText(updating ? currency.getValue() : "");
       
       modificarButton.setEnabled(updating);
       
       buscarButton.setEnabled(!updating);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JTextField codigoInput;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField costoInput;
    private javax.swing.JLabel costoLabel;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JLabel nombreLabel;
    // End of variables declaration//GEN-END:variables
}
