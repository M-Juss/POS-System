import static java.awt.Color.*;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public interface GuiFunctions {
    
    static void onButtonClick(String itemName, int price, JSpinner spinner, JTable Cart, JLabel labelTotalPrice) {
  
        String productName = itemName;
        int productPrice = price;
        int quantity = (int) spinner.getValue();
        
        double total = quantity * productPrice;
        

        Cart.setForeground(BLACK);
        Cart.setBackground(WHITE);
            
        DefaultTableModel cart = (DefaultTableModel) Cart.getModel();
        
        cart.addRow(new Object[]{quantity, productName, productPrice, total});
        
        spinner.setValue(1);
        
        double Total = 0;
        for (int row = 0; row < Cart.getRowCount(); row++) {
            double value = (double) Cart.getValueAt(row, 3);
            Total = Total + value;
        }
        
        labelTotalPrice.setText(String.valueOf(Total));       
        
    }
}
