import java.awt.*;
import java.awt.event.*;

public class Patient extends Frame {

    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button4;
    private Button Button5;
    private Button Button6;
    private Label Label1;








    public Patient() {
        initComponents();
    }

    private void initComponents() {

        Label Label1 = new Label();
        Button Button1 = new Button();
        Button Button2 = new Button();
        Button Button3 = new Button();
        Button Button4 = new Button();
        Button Button5 = new Button();
        Button Button6 = new Button();


        Label1.setFont(new Font("Times New Roman", 1, 24));
        Label1.setText("PATIENT RECORDS");

        Button1.setLabel("ADD PATIENT DETAILS");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setLabel("ADMIT PATIENT");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setLabel("DISCHARGE PATIENT");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setLabel("VIEW PATIENT DETAIL");
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setLabel("BACK");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setLabel("LOGOUT");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });





        setLayout(null);
        setVisible(true);
         setSize(1200,1200);         setLocation(400,5);
        Label1.setBounds(100,200,1100,200);
        Label1.setFont(new Font("Arial Black",Font.BOLD,100));
        add(Label1);

        Button1.setBounds(400,400,400,150);
        Button1.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button1);

        Button2.setBounds(400,580,400,150);
        Button2.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button2);

        Button3.setBounds(400,760,400,150);
        Button3.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button3);

        Button4.setBounds(400,940,400,150);
        Button4.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button4);

        Button5.setBounds(200,90,100,50);
        Button5.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button5);

        Button6.setBounds(1000,90,100,50);
        Button6.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button6);









    }

    private void Button5ActionPerformed(ActionEvent evt) {

        welcome obj =new welcome();
        obj.setVisible(true);
        dispose();
    }

    private void Button6ActionPerformed(ActionEvent evt) {

        LoginPage obj =new LoginPage();
        obj.setVisible(true);
        dispose();
    }

    private void Button1ActionPerformed(ActionEvent evt) {

         AddPatient obj =new AddPatient();
         obj.setVisible(true);
         dispose();
    }

    private void Button2ActionPerformed(ActionEvent evt){

          AdmitPatient obj = new AdmitPatient();
          obj.setVisible(true);
          dispose();
    }   

    private void Button3ActionPerformed(ActionEvent evt) {

        DischargePatient obj=new DischargePatient();
        obj.setVisible(true);
        dispose();

    }

    private void Button4ActionPerformed(ActionEvent evt) {

        ViewPatient obj =new ViewPatient();
        obj.setVisible(true);
        dispose();
    }

    public static void main(String[] args) {

        Patient obj=new Patient();

    }


}