import java.awt.*;
import java.awt.event.*;

public class Record extends Frame {

    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button5;
    private Button Button6;
    private Label Label1;








    public Record() {
        initComponents();
    }

    private void initComponents() {

        Label Label1 = new Label();
        Button Button1 = new Button();
        Button Button2 = new Button();
        Button Button3 = new Button();
        Button Button5 = new Button();
        Button Button6 = new Button();


        Label1.setFont(new Font("Times New Roman", 1, 24));
        Label1.setText("RECORDS");

        Button1.setLabel("PATIENT_DOCTOR RECORD");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setLabel("NOT ADMITTED PATIENT");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setLabel("MEDICINE VIEW");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
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
        Label1.setBounds(350,200,1100,200);
        Label1.setFont(new Font("Arial Black",Font.BOLD,100));
        add(Label1);

        Button1.setBounds(370,400,430,150);
        Button1.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button1);

        Button2.setBounds(370,580,430,150);
        Button2.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button2);

        Button3.setBounds(370,760,430,150);
        Button3.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button3);

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

         RecordJoin obj =new RecordJoin();
         obj.setVisible(true);
         dispose();
    }

    private void Button2ActionPerformed(ActionEvent evt){

          RecordSubquery obj = new RecordSubquery();
          obj.setVisible(true);
          dispose();
    }   

    private void Button3ActionPerformed(ActionEvent evt) {

        RecordView obj=new RecordView();
        obj.setVisible(true);
        dispose();

    }

    public static void main(String[] args) {

        Record obj=new Record();

    }


}