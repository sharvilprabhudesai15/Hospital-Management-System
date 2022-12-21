import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class welcome extends Frame {
    public Button Button2;
    public Button Button3;
    public Button Button4;
    public Button Button5;
    public Button Button6;
    public Label Label1;


    welcome() {
         setSize(1200,1200);         setLocation(400,5);
        setVisible(true);
        initComponents();
    }

    private void initComponents() {

        Label Label1 = new Label();
        Button Button2 = new Button();
        Button Button3 = new Button();
        Button Button4 = new Button();
        Button Button5 = new Button();
        Button Button6 = new Button();


        //Label1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        Label1.setText("Welcome to Hospital");

        Button2.setLabel("RECORD");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setLabel("MEDICINE");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        
        Button4.setLabel("DOCTOR");
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setLabel("PATIENT");
        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setLabel("LOGOUT");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });



        setLayout(null);
        Label1.setBounds(100,200,1000,200);

        Label1.setFont(new Font("Arial Black",Font.BOLD,100));
        add(Label1);
        Button2.setBounds(150,400,400,200);
        Button2.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button2);
        Button3.setBounds(700,400,400,200);
        Button3.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button3);
        Button4.setBounds(150,700,400,200);
        Button4.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button4);
        Button5.setBounds(700,700,400,200);
        Button5.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button5);
        Button6.setBounds(1000,90,100,50);
        Button6.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button6);


    }


    private void Button4ActionPerformed(ActionEvent evt) {

         DOCTORS obj = new DOCTORS();
         obj.setVisible(true);
         dispose();

    }

    private void Button5ActionPerformed(ActionEvent evt) {


        Patient obj = new Patient();
        obj.setVisible(true);
        dispose();

    }

    private void Button6ActionPerformed(ActionEvent evt) {

        LoginPage obj = new LoginPage();
        obj.setVisible(true);
        dispose();
    }
    
    private void Button2ActionPerformed(ActionEvent evt) {

         Record obj = new Record();
         obj.setVisible(true);
         dispose();

    }
    
    private void Button3ActionPerformed(ActionEvent evt) {

         Medicine obj = new Medicine();
         obj.setVisible(true);
         dispose();

    }


    public static void main(String[] args) {
        welcome obj=new welcome();

    }
}

