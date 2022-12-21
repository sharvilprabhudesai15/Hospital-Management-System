import java.awt.*;
import java.awt.event.*;

public class AdmitPatient extends Frame {

    private Button Button1;
    
    
    private Button Button4;
    private Button Button5;
    private Button Button6;
    private Label Label1;








    public AdmitPatient() {
        initComponents();
    }

    private void initComponents() {

        Label Label1 = new Label();
        Button Button1 = new Button();
        
      
        Button Button4 = new Button();
        Button Button5 = new Button();
        Button Button6 = new Button();


        Label1.setFont(new Font("Times New Roman", 1, 20));
        Label1.setText("Admit Patient RECORDS");
        
        Button1.setLabel("INSERT ADMIT RECORD");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

            

        Button4.setLabel("DISPLAY ADMIT LOG");
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
        Label1.setBounds(100,200,1200,200);
        Label1.setFont(new Font("Arial Black",Font.BOLD,90));
        add(Label1);

        Button1.setBounds(400,400,500,150);
        Button1.setFont(new Font("Arial Black",Font.BOLD,30));
        add(Button1);

                

        Button4.setBounds(400,580,500,150);
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

        Patient obj =new Patient();
        obj.setVisible(true);
        dispose();
    }

    private void Button6ActionPerformed(ActionEvent evt) {

        LoginPage obj =new LoginPage();
        obj.setVisible(true);
        dispose();
    }

    private void Button1ActionPerformed(ActionEvent evt) {

         AddAdmittedPatient obj =new AddAdmittedPatient();  
         obj.setVisible(true);
         dispose();
    }

   

    private void Button4ActionPerformed(ActionEvent evt) {

        ViewAdmittedPatient obj =new ViewAdmittedPatient(); //for displaying the records of admiited people
        obj.setVisible(true);
        dispose();
    }

    public static void main(String[] args) {

        AdmitPatient obj=new AdmitPatient();

    }


}