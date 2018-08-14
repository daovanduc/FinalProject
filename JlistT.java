package FinalProect.Test.TestPro;

import javax.swing.*;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.math.BigDecimal;

public class JlistT {

    JFrame frame = new JFrame("Vietnamese Dishes");
    javax.swing.JList<Product> list = new JList<>();
    DefaultListModel<Product> model = new DefaultListModel<>();

    JLabel label = new JLabel();
    JLabel lb = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();


    public JlistT(){
        list.setModel(model);

        model.addElement(new Product("PHỞ Gà" , new BigDecimal("50"), "Hà Nội and Sài Gòn "));
        model.addElement(new Product("PHỞ Bò" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("BÚN Riêu Cua" , new BigDecimal("50"), "Sài Gòn"));
        model.addElement(new Product("Bánh Mỳ, ",new BigDecimal("10"), "Hà Nội"));
        model.addElement(new Product("Tiết Canh" , new BigDecimal("30"), "Sài Gòn"));
        model.addElement(new Product("Ốc Xào Măng" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("Khoai Lang Chiên" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("Bánh Tráng Trộn" , new BigDecimal("50"), "Hà Nội and Sài Gòn "));
        model.addElement(new Product("Nem" , new BigDecimal("10"), "Thanh Hóa "));
        model.addElement(new Product("Bún Nem" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("Nem Chua Rán" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("Chân Gà Nướng" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("Lẩu Hải Sản" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("SEA FOODS" , new BigDecimal("50"), "Hà Nội "));



        list.getSelectionModel().addListSelectionListener(e -> {
            Product p = list.getSelectedValue();
            label.setText("Món Ăn : " + p.getName() + "-----Giá"+ p.getPrice().toPlainString()+ "----- ở  "+ p.getDesc());



        });

        splitPane.setLeftComponent(new JScrollPane(list));
        panel.add(label);
        splitPane.setRightComponent(panel);


        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(splitPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(500, 300);


    }

    private class Product{
        String name;
        BigDecimal price;

        public Product(String name, BigDecimal price, String desc) {
            this.name = name;
            this.price = price;
            this.desc = desc;
        }

        String desc;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}
