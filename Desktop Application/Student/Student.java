import java.net.*;
import java.util.Calendar;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.table.*;
class Student implements ActionListener
        {            
                      Container cnt  = null;
                     JFrame   f; 
                     JLabel l1, l2, l3,l4,l5,l6;
                     JTextField t1, t2, t3,t4,t5,t6;
                     JButton b1, b2;
                      DefaultTableModel  grid; 
                      JTable tab ;   
                      JScrollPane ptab;
 
                               
 void display()
             {
                                f = new JFrame("STUDENT DETAILS");
                                cnt = f.getContentPane();
                                String cols[ ] = {"STUDENT ID", "NAME","BRANCH","MARKS IN DB","MARKS IN JAVA","MARKS IN C++","TOTAL MARKS"};
                                 grid = new  DefaultTableModel(cols,0); 
                                 tab = new JTable(grid);
                                 ptab = new JScrollPane(tab);      
                                 l1 = new JLabel("STUDENT ID :");
                                 l2 = new JLabel(" NAME :");
                                 l3 = new JLabel("BRANCH :");
                                 l4 = new JLabel("MARKS IN DB");
	               l5 = new JLabel("MARKS IN JAVA");
                                 l6 = new JLabel("MARKS IN C++");                                 
                                 t1 = new JTextField("");
                                 t2 = new JTextField("");
                                 t3 = new JTextField("");
                                 t4 = new JTextField("");
                                 t5 = new JTextField("");
                                 t6 = new JTextField("");
                                 b1 = new JButton("ADD");
                                 b2 = new JButton("REMOVE");
                                 cnt.setLayout(null);
                                 l1.setBounds(20,20,150,25);
                                 t1.setBounds(170,20,250,25);
                                 l2.setBounds(20,70,150,25);
                                 t2.setBounds(170,70,250,25);
                                 l3.setBounds(20,120,250,25);
                                 t3.setBounds(170,120,250,25);
                                  l4.setBounds(20,170,250,25);
                                 t4.setBounds(170,170,250,25);
                                  l5.setBounds(20,220,250,25);
                                 t5.setBounds(170,220,250,25);
                                  l6.setBounds(20,280,250,25);
                                 t6.setBounds(170,280,250,25);
                                 b1.setBounds(170,700,100,25);
                                 b2.setBounds(500,700,100,25);
                                 ptab.setBounds(170,350,800,300);
                                 cnt.add(ptab);
                                 cnt.add(l1);
                                 cnt.add(l2);
                                 cnt.add(l3);
                                  cnt.add(t3);
                                 cnt.add(t1);
                                 cnt.add(t2);
                                 cnt.add(b1);
                                 cnt.add(b2);
                                 cnt.add(l4);
                                  cnt.add(t4);
                                 cnt.add(t5);
                                 cnt.add(l5);
                                 cnt.add(l6);
                                 cnt.add(t6);
                                 cnt.setBackground(Color.pink);
                                 f.setSize(1376,768);
                                 f.setVisible(true);
                                 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                b1.addActionListener(this); 
                                b2.addActionListener(this); 
                            }
public void actionPerformed(ActionEvent e)
{
            if (e.getSource() == b1)
                              {  
                                String str1 = t1.getText();              
                                String str2 = t2.getText();             
                                String str3 = t3.getText();             
                                String str4 = t4.getText();              
                                String str5 = t5.getText();             
                                String str6 = t6.getText();
                               int marks1,marks2,marks3,total_marks;  
                               marks1 = Integer.parseInt(str4);
                               marks2 = Integer.parseInt(str5);
                               marks3 = Integer.parseInt(str6);
                               total_marks = marks1+marks2+marks3;
                               String arr[ ] = {str1,str2,str3,""+marks1,""+marks2,""+marks3,""+total_marks};  
                               grid.addRow(arr);
                               t1.setText("");
                               t2.setText("");
                               t3.setText("");
                                 t4.setText("");
                               t5.setText("");
                               t6.setText("");
                               }
            
                      else  if(e.getSource() == b2)
                         {
                                  for(int i =0; i < grid.getRowCount(); i++)
                                        {            
                                              String st =t1.getText();
                                             if (st == (String)grid.getValueAt(i,0))
                                                { 
                                                   //tab.setRowSelectionInterval(i, 0);
                                                   //int sr = tab.getSelectedRow();
                                                  // grid.removeRowAt(i);
                                                } 
                                                      t1.setText("");
                                                      tab.setRowSelectionAllowed(false);
                                                      tab.setColumnSelectionAllowed(false);
                                        }
                         }
}
public static void main (String args[ ] )
       {          
             try
             {
                  Student e = new Student();
                  e.display();
            }
catch(Exception ee)
           {
                  System.out.println("Error is :" +ee);
           }
     }
}