import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.*;
public class addDoctor extends Frame {

    public TextField di;
    public TextField dn;
    public TextField ds;
    public Button Button1;
    public Button Button2;
    public Button Button3;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public addDoctor() {
        initComponents();
    }

    private void initComponents() {

         Label1 = new Label();
         Label2 = new Label();
         Label4 = new Label();

        di = new TextField(10);
         dn = new TextField(10);
         ds = new TextField(10);
         Button1 = new Button();
         Button2 = new Button();
         Button3 = new Button();
         Label3 = new Label();


        Label1.setFont(new Font("Times New Roman", 1, 24));
        Label1.setText("ADD DOCTOR DETAILS");

        Label2.setText("Doctor Name:");

        Label4.setText("Doctor Specilization:");

        Button1.setLabel("ADD");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setLabel("BACK");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setLabel("Logout");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Label3.setText("Doctor ID:");


         setSize(1200,1200);         setLocation(400,5);
        setVisible(true);
        setLayout(null);

        Label1.setBounds(100,200,1100,100);
        Label1.setFont(new Font("Arial Black",Font.BOLD,90));
        add(Label1);


        Label3.setBounds(250, 550, 120, 30);
        Label3.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label3);


        di.setBounds(500, 550, 372, 30);
        di.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(di);


        Label2.setBounds(250, 600, 140, 30);
        Label2.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label2);


        dn.setBounds(500, 600, 372, 30);
        dn.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(dn);

        Label4.setBounds(250, 650, 240, 30);
        Label4.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label4);


        ds.setBounds(500, 650, 372, 30);
        ds.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(ds);


        Button1.setBounds(250,850,622,80);
        Button1.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Button1);



        Button2.setBounds(200,90,100,50);
        Button2.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button2);

        Button3.setBounds(1000,90,100,50);
        Button3.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button3);

    }

    private void Button2ActionPerformed(ActionEvent evt) {
        DOCTORS obj = new DOCTORS();
        obj.setVisible(true);
        dispose();

    }

    private void Button3ActionPerformed(ActionEvent evt) {
        LoginPage obj = new LoginPage();
        obj.setVisible(true);
        dispose();


    }

    private void Button1ActionPerformed(ActionEvent evt) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
            System.out.println("database connected ");

            String sql = "INSERT INTO doctor_record values (?,?,?)";
            PreparedStatement ptst = conn.prepareStatement(sql);
            ptst.setString(1,di.getText());
            ptst.setString(2,dn.getText());
            ptst.setString(3,ds.getText());
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "data inserted successfully");
            conn.close();
            di.setText("");
            dn.setText("");
            ds.setText("");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public static void main(String[] args) {

        addDoctor object = new addDoctor();
    }


}