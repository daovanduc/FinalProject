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

        model.addElement(new Product("Phở" , new BigDecimal("50"), "Hà Nội and Sài Gòn "));
        model.addElement(new Product("Bún Riêu Cua" , new BigDecimal("50"), "Sài Gòn"));
        model.addElement(new Product("Bánh Mỳ",new BigDecimal("10"), "Hà Nội and Sài Gòn"));
        model.addElement(new Product("Bún Bò Huế",new BigDecimal("50"), "Huế"));
        model.addElement(new Product("Tiết Canh" , new BigDecimal("20"), "All Country"));
        model.addElement(new Product("Ốc Xào Măng" , new BigDecimal("70"), "Hà Nội "));
        model.addElement(new Product("Khoai Lang Chiên" , new BigDecimal("40"), "Hà Nội "));
        model.addElement(new Product("Bánh Tráng Trộn" , new BigDecimal("20"), "Hà Nội and Sài Gòn "));
        model.addElement(new Product("Nem" , new BigDecimal("10"), "Thanh Hóa "));
        model.addElement(new Product("Bún Nem" , new BigDecimal("50"), "Hà Nội "));
        model.addElement(new Product("Nem Chua Rán" , new BigDecimal("20"), "Hà Nội "));
        model.addElement(new Product("Chân Gà Nướng" , new BigDecimal("10"), "Hà Nội "));
        model.addElement(new Product("Lẩu Hải Sản" , new BigDecimal("150"), "Hà Nội "));
        model.addElement(new Product("SEA FOODS" , new BigDecimal("500"), "Hà Nội and Đà Nẵng "));
        model.addElement(new Product("Soup Cua",new BigDecimal("300"), "Sài Gòn"));
        model.addElement(new Product("Trứng Vịt Lộn",new BigDecimal("10"), "All Country"));
        model.addElement(new Product("Gỏi Cá",new BigDecimal("100"), "All Country"));
        model.addElement(new Product("Bánh Chưng",new BigDecimal("50"), "All Country"));
        model.addElement(new Product("Chè",new BigDecimal("20"), "All Country"));
        model.addElement(new Product("Bún Chả",new BigDecimal("40"), "All Country"));
        model.addElement(new Product("Lẩu",new BigDecimal("120"), "All Country"));

        list.getSelectionModel().addListSelectionListener(e -> {
            Product p = list.getSelectedValue();
            label.setText("FoodName: " + p.getName() + "                  Price :"+ p.getPrice().toPlainString()+ "                   From:"+ p.getDesc());



        });

        splitPane.setLeftComponent(new JScrollPane(list));
        panel.add(label);
        splitPane.setRightComponent(panel);


        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(splitPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(600, 300);


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
