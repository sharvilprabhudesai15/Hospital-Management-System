
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;

public class editDoctor extends Frame {


    public TextField di;
    public TextField dn;
    public TextField ds;
    public Button Button1;
    public Button Button2;
    public Button Button3;
    public Button Button4;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;

    public editDoctor() {
        initComponents();
    }

    private void initComponents() {

        Label1 = new Label();
        Label2 = new Label();
        Label3 = new Label();
        Label4 = new Label();
        Button1 = new Button();
        Button2 = new Button();
        Button3 = new Button();
        di = new TextField();
        dn = new TextField();
        ds = new TextField();
        Button4 = new Button();


        Label1.setText("Edit Doctors Records");

        Label2.setText("Doctor Id");

        Label3.setText("Doctor Name:");

        Label4.setText("Doctor Specialization");

        Button1.setLabel("update");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setLabel("Back");
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

        Button4.setLabel("clear");
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });



         setSize(1200,1200);         setLocation(400,5);
        setVisible(true);
        setLayout(null);



        Label1.setBounds(100,200,1100,100);
        Label1.setFont(new Font("Arial Black",Font.BOLD,90));
        add(Label1);



        Label2.setBounds(250, 550, 130, 30);
        Label2.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label2);




        di.setBounds(500, 550, 372, 30);
        di.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(di);

        Label3.setBounds(250, 600, 140, 30);
        Label3.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label3);



        dn.setBounds(500, 600, 372, 30);
        dn.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(dn);

        Label4.setBounds(250, 650, 240, 30);
        Label4.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label4);


        ds.setBounds(500, 650, 372, 30);
        ds.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(ds);


        Button1.setBounds(250,850,200,80);
        Button1.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Button1);

        Button4.setBounds(550,850,200,80);
        Button4.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Button4);



        Button2.setBounds(200,90,100,50);
        Button2.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button2);

        Button3.setBounds(1000,90,100,50);
        Button3.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button3);

        Button2.setBounds(200,90,100,50);
        Button2.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button2);

        Button3.setBounds(1000,90,100,50);
        Button3.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button3);


    }

    private void Button2ActionPerformed(ActionEvent evt) {

        DOCTORS obj =new DOCTORS();
        obj.setVisible(true);
        dispose();
    }

    private void Button3ActionPerformed(ActionEvent evt) {
        LoginPage obj =new LoginPage();
        obj.setVisible(true);
        dispose();
    }

    private void Button1ActionPerformed(ActionEvent evt) {


        String did = di.getText();
        String dname= dn.getText();
        String dspec= ds.getText();
        int count=0;
        if(did.equals(""))
        {
            JOptionPane.showMessageDialog(null, "please enter Doctor ID");

        }
        else if(dname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "please enter Doctor Name");


        } else if(dspec.equals(""))
        {
            JOptionPane.showMessageDialog(null, "please enter Doctor Specialization");


        }

        else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "");

                try {
                    Statement st = conn.createStatement();
                    String sql2 = "select * from doctor_record";

                    ResultSet rs2 = st.executeQuery(sql2);
                    while (rs2.next()) {
                        String id = rs2.getString("doctor_id");

                        
                        if (did.equals(id)) {
                            count = 1;
                            try {
                                String sql = "update doctor_record SET `doctor_name`='" + dname + "',`doctor_specialization`='" + dspec + "' WHERE doctor_id='" + Integer.parseInt(id) + "'";
                                PreparedStatement ptstmt = conn.prepareStatement(sql);
                                ptstmt.execute();


                                JOptionPane.showMessageDialog(null, "Record updated successfully");
                                di.setText("");
                                dn.setText("");
                                ds.setText("");
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }
                } catch (Exception e) {

                }
            } catch (Exception evv) {

            }

            if (count == 0) {
                JOptionPane.showMessageDialog(null, "enter valid details");
                di.setText("");
                dn.setText("");
                ds.setText("");
            }
        }
    }

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {

        String did = di.getText();
        String dname= dn.getText();
        String dspec= ds.getText();
        di.setText("");
        dn.setText("");
        ds.setText("");
    }

    public static void main(String[] args) {
        editDoctor obj=new editDoctor();

    }



}