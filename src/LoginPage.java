import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends Frame{
    Button button1;
    Button button2;
    Button button3;
    Label label1;
    Label label2;
    TextField textField3;
    TextField textField2;

    Label label3;
    public LoginPage() {
        addWindowListener(new WindowAdapter() 
        {   public void windowClosing(WindowEvent we) 
            {   System.exit(0); }
        });
         setSize(1200,1200);         setLocation(400,5);
       setTitle("User Login");
       textField2 = new TextField();
        textField3 = new TextField();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        label2 = new Label();
        label1 = new Label();
        label3=new Label();
        


        setLayout(null);


        label3.setText("HOSPITAL MANAGEMENT SYSTEM");
        label3.setBounds(100, 50, 1100, 200);
        label3.setFont(new Font("Arial Black",Font.BOLD,60));
        add(label3);


        textField2.setText("");
        add(textField2);
        textField2.setBounds(500, 293, 400, 30);
        textField2.setFont(new Font("Arial Black",Font.PLAIN,20));

        textField3.setText("");
        add(textField3);
        textField3.setEchoChar('*');
        textField3.setBounds(500, 390, 400, 30);
        textField3.setFont(new Font("Arial Black",Font.PLAIN,20));

        //button1.setLabel("SIGN IN");
        add(button1);
        button1.setBounds(500, 474, 195, 30);
        button1.setFont(new Font("Arial Black",Font.PLAIN,24));
        button1.setLabel("SIGN IN");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        add(button3);
        button3.setBounds(705, 474, 195, 30);
        button3.setFont(new Font("Arial Black",Font.PLAIN,24));
        button3.setLabel("SIGN UP");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });




        add(button2);
        button2.setBounds(500, 514, 400, 30);
        button2.setFont(new Font("Arial Black",Font.PLAIN,24));
        button2.setLabel("Reset");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        label2.setText("Username");
        add(label2);
        label2.setBounds(350, 293, 140, 30);
        label2.setFont(new Font("Arial Black",Font.BOLD,20));

        label1.setText("Password");
        add(label1);
        label1.setBounds(350, 390, 140, 30);
        label1.setFont(new Font("Arial Black",Font.BOLD,20));


        setVisible(true);
    }                   
    
    

    public void Button1ActionPerformed(ActionEvent e )
    {
        String un= textField2.getText();
       String p= textField3.getText();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
                System.out.println("database connected ");
                Statement st=conn.createStatement();
                String sql="select * from user_login";
                int count=0;
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    String username=rs.getString("username");
                    String password=rs.getString("password");

                    if(un.equals(username) && p.equals(password)){
                        new welcome().setVisible(true);
                        JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFULLY");
                        System.out.println("correct username ");
                        System.out.println("correct password");
                        setVisible(false);
                        count=1;
                        break;
                       

                    }
                    else{
                        
                        textField3.setText("");
                        textField2.setText("");
                    }
                }
                if(count==0)
                {
                    JOptionPane.showMessageDialog(null, "INVALID PASSWORD");
                }
                
            }
            catch(Exception ev)
            {
                System.out.println(e);
            }
        }

    
        public void Button3ActionPerformed(ActionEvent e )
        {
            Registration obj = new Registration();
            obj.setVisible(true);
            dispose();
        }
    public void Button2ActionPerformed(ActionEvent e )
    {
        String un= textField2.getText();
        String p= textField3.getText();
        textField3.setText("");
        textField2.setText("");
    }
   
    public static void main(String[] args) {
        
        LoginPage l=new LoginPage();
            
    }
}
