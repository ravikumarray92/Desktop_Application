import java.net.*;
import java.util.Calendar;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.table.*;
class Employee implements ActionListener
        {            
                      Container cnt  = null;
                     JFrame   f; 
                     JLabel l1, l2, l3;
                     JTextField t1, t2, t3;
                     JButton b1, b2;
                      DefaultTableModel  grid; 
                      JTable tab ;   
                      JScrollPane ptab;
 
                               
 void display()
             {
                                f = new JFrame("EMPLOYEE DETAILS");
                                cnt = f.getContentPane();
                                String cols[ ] = {"EMPLOYEE ID", "EMPLOYEE NAME","SALARY","PF","HRA","TOTAL SALARY"};
                                 grid = new  DefaultTableModel(cols,0); 
                                 tab = new JTable(grid);
                                 ptab = new JScrollPane(tab);      
                                 l1 = new JLabel("Employee ID :");
                                 l2 = new JLabel("Employee Name :");
                                 l3 = new JLabel("Salary :");
                                  t1 = new JTextField("");
                                  t2 = new JTextField("");
                                  t3 = new JTextField("");
                                 b1 = new JButton("ADD");
                                 b2 = new JButton("REMOVE");
                                 cnt.setLayout(null);
                                 l1.setBounds(20,20,150,25);
                                 t1.setBounds(170,20,250,25);
                                  l2.setBounds(20,70,150,25);
                                 t2.setBounds(170,70,250,25);
                                 l3.setBounds(20,120,250,25);
                                 t3.setBounds(170,120,250,25);
                                 b1.setBounds(170,600,100,25);
                                 b2.setBounds(500,600,100,25);
                                 ptab.setBounds(20,150,700,400);
                                 cnt.add(ptab);
                                 cnt.add(l1);
                                 cnt.add(l2);
                                 cnt.add(l3);
                                  cnt.add(t3);
                                 cnt.add(t1);
                                 cnt.add(t2);
                                 cnt.add(b1);
                                 cnt.add(b2);
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
                                String str1 = t1.getText();              // Employee ID
                                String str2 = t2.getText();             //  Employee Name
                                String str3 = t3.getText();             //  Salary
                                int q = Integer.parseInt(str3);
                                int pf =  q/20;
                                int hra =  q/10;                               
                                int tot_sal = q + pf + hra;
                                String arr[ ] = {str1,str2,str3,""+pf,""+hra, ""+tot_sal};  
                                grid.addRow(arr);
                               t1.setText("");
                               t2.setText("");
                               t3.setText("");
                              
                               }
            
                      else  if(e.getSource() == b2)
                         {
                                  for(int i =0; i < grid.getRowCount(); i++)
                                        {            
                                              String st =t1.getText();
		       String ttt=(String)grid.getValueAt(i,0);
                                             if (st.equals(ttt) )
                                                { 
                                                   
                                                  grid.removeRow(i);
			
			tab.updateUI();
                                                } 
                                               t1.setText("");        
                                        }
                         }
}
public static void main (String args[ ] )
       {          
             try
             {
                  Employee e = new Employee();
                  e.display();
            }
catch(Exception ee)
           {
                  System.out.println("Error is :" +ee);
           }
     }
}