import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.*;
public class AddPatient extends Frame {

    public TextField PatientUniqueNo;  
    public TextField name;      
    public TextField phone ;    
    public TextField gender;
    public TextField email;
    public TextField Disease;
    public TextField Apointment;
    public TextField doctor;
    public Button Button1;
    public Button Button2;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public Label Label7;
    public Label Label8;
    public Label Label9;
    public Button Button3;
    public AddPatient() {
        initComponents();
    }

    private void initComponents() {

         Label1 = new Label();
         Label2 = new Label();
         Label3 = new Label();
         Label4 = new Label();
         Label5 = new Label();
         Label6 = new Label();
         Label7 = new Label();
         Label8 = new Label();
         Label9 = new Label();
         PatientUniqueNo = new TextField(10);
         name = new TextField(10);
         phone = new TextField(10);
         gender = new TextField(10);
         email = new TextField(10);
         Disease = new TextField(10);
         Apointment = new TextField(10);
         doctor = new TextField(10);
         Button1 = new Button();
         Button2 = new Button();
         Button3 = new Button();
         


        Label1.setFont(new Font("Arial Black",Font.BOLD, 24));
        Label1.setText("ADD PATIENT DETAILS");

        Label2.setText("Patient Unique Number:");

        Label4.setText("Name:");

        Button1.setLabel("ADD");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        
        Button3.setLabel("SEARCH");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button2.setLabel("BACK");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        

        Label3.setText("Phone No:");
        Label5.setText("Gender:");
        Label6.setText("Email:");
        Label7.setText("Disease:");
        Label8.setText("Appointment:");
        Label9.setText("Doctor ID");
      


         setSize(1200,1200);         setLocation(400,5);
        setVisible(true);
        setLayout(null);

        Label1.setBounds(150,200,1100,100);
        Label1.setFont(new Font("Arial Black",Font.BOLD,90));
        add(Label1);


        Label3.setBounds(250, 450, 120, 30);
        Label3.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label3);


        PatientUniqueNo.setBounds(500, 350, 372, 30);
        PatientUniqueNo.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(PatientUniqueNo);


        Label2.setBounds(250, 350, 140, 30);
        Label2.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label2);


        name.setBounds(500, 400, 372, 30);
        name.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(name);

        Label4.setBounds(250, 400, 240, 30);
        Label4.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label4);


        phone.setBounds(500, 450, 372, 30);
        phone.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(phone);
        
        Label5.setBounds(250, 500, 120, 30);
        Label5.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label5);


        gender.setBounds(500, 500, 372, 30);
        gender.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(gender);

        Label6.setBounds(250, 550, 120, 30);
        Label6.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label6);


        email.setBounds(500, 550, 372, 30);
        email.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(email);
        
        Label7.setBounds(250, 600, 120, 30);
        Label7.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label7);


        Disease.setBounds(500, 600, 372, 30);
        Disease.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(Disease);
        
        Label8.setBounds(250, 650, 120, 30);
        Label8.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label8);


        Apointment.setBounds(500, 650, 372, 30);
        Apointment.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(Apointment);
        
        Label9.setBounds(250, 700, 250, 30);
        Label9.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Label9);


        doctor.setBounds(500, 700, 372, 30);
        doctor.setFont(new Font("Arial Black",Font.PLAIN,20));
        add(doctor);
        
        Button1.setBounds(250,850,622,80);
        Button1.setFont(new Font("Arial Black",Font.BOLD,20));
        add(Button1);



        Button2.setBounds(200,90,100,50);
        Button2.setFont(new Font("Arial Black",Font.BOLD,15));
        add(Button2);
        
        Button3.setBounds(500,750,100,50);
        Button3.setFont(new Font("Arial Black",Font.BOLD,10));
        add(Button3);

        

    }

    private void Button2ActionPerformed(ActionEvent evt) {
        Patient obj = new Patient();
        obj.setVisible(true);
        dispose();

    }

    private void Button3ActionPerformed(ActionEvent evt) {
        Dsearch obj = new Dsearch();
        obj.setVisible(true);
        

    }

    private void Button1ActionPerformed(ActionEvent evt) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
            System.out.println("database connected ");

            String sql = "INSERT INTO add_patient values (?,?,?,?,?,?,?,?)";
            PreparedStatement ptst = conn.prepareStatement(sql);
            ptst.setString(1,PatientUniqueNo.getText());
            ptst.setString(2,name.getText());
            ptst.setString(3,phone.getText());
            ptst.setString(4,gender.getText());
            ptst.setString(5,email.getText());
            ptst.setString(6,Disease.getText());
            ptst.setString(7,Apointment.getText());
            ptst.setString(8,doctor.getText());
            
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "data inserted successfully");
            conn.close();
            PatientUniqueNo.setText("");
            name.setText("");
            phone.setText("");
            gender.setText("");
            email.setText("");
            Disease.setText("");
            Apointment.setText("");
            doctor.setText("");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public static void main(String args[]) {

        AddPatient object = new AddPatient();
    }


}