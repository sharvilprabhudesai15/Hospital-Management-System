
import net.proteanit.sql.DbUtils;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class  ViewPatient  extends JFrame {




    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Label Label1;
    private Label Label2;
    private JFrame j1;
   private JTable jTable1;

    private JTextField tt;
    
    public   ViewPatient () {
        initComponents();
    }

    private void initComponents() {

        Label1 = new Label();
        Label2 = new Label();
        jTable1 = new JTable();
        Button1 = new Button();
        Button2 = new Button();
        Button3 = new Button();
        tt=new JTextField(15);
        j1=new JFrame();
     
      
        Label1.setText("VIEW DETAILS");
        Label2.setText("SEARCH PATIENT UNIQUE ID");
        Button1.setLabel("VIEW RECORDS");
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

        Button3.setLabel("LOGOUT");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });


         setSize(1200,1200);         setLocation(400,5);
        setVisible(true);
        setLayout(null);
     
        
        
        
        Label1.setBounds(300,300,1100,100);
        Label1.setFont(new Font("Arial Black",Font.BOLD,90));
        add(Label1);
        
        

        Button1.setBounds(450,400,300,80);
        Button1.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Button1);


        jTable1.setRowHeight(30);
        jTable1.setFont(new Font("Arial Black",Font.BOLD,20));
        jTable1.setBounds(100,450,500, 500);

        Button2.setBounds(200,90,100,50);
        Button2.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button2);

        Button3.setBounds(1000,90,100,50);
        Button3.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button3);


//        j1. setSize(1200,1200);         setLocation(400,5);
//        j1.add(Label1);
//        Table1.setLocation(0,400);
//        j1.add(j1.getContentPane().add(Table1));
//        j1.setVisible(true);
//        j1.setLayout(null);        j1.setLocation(400,5);



    }

    private void Button2ActionPerformed(ActionEvent evt) {

        Patient obj = new Patient();
        obj.setVisible(true);
        dispose();
    }

    private void Button3ActionPerformed(ActionEvent evt) {

        LoginPage obj =new LoginPage();
        obj.setVisible(true);
        dispose();
    }

    private void Button1ActionPerformed(ActionEvent evt) {
        JScrollPane pg = new JScrollPane(jTable1);
        j1.add(tt);
        j1.setSize(1200, 1200);
        j1.add(pg);
        Label2.setBounds(200,150,300,30);
        Label2.setFont(new Font("Arial Black",Font.BOLD,15));
        j1.add(Label2);
      
        tt.setBounds(450, 150, 550,30);
        pg.setBounds(200, 200, 800, 500);
        
        
        
        j1.setLayout(null);        j1.setLocation(400,5);
        j1.setVisible(true);
        
        Font myFont=new Font("Tahoma", 1, 22);
        pg.setFont(myFont);
        tt.addCaretListener(new CaretListener()
        {   public void caretUpdate(CaretEvent e)
        {   String currentVal = tt.getText();
            if(!currentVal.equals(""))
            {   try
            {
                    //try block
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn1= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
                String s3="select * from add_patient where uniqueID like +'"+currentVal+"%'";
                Statement stmt1 = conn1.createStatement();
                ResultSet rs1=stmt1.executeQuery(s3);
                jTable1.setModel(DbUtils.resultSetToTableModel(rs1));

                }
                catch (Exception ex) {
                }
                }
                else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
                        Statement st= conn.createStatement();
                        String sql="select * from add_patient";
                        PreparedStatement pstmt=conn.prepareStatement(sql);
                        ResultSet rs= pstmt.executeQuery();
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        conn.close();
                    }catch(Exception ee){
                        JOptionPane.showMessageDialog(null,ee);
                    }

                }

            }});























    }
    public static void main(String args[]) {
        ViewPatient obj=new  ViewPatient ();

    }

}