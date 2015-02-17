import javax.swing.JOptionPane;

public class Adder
{
  public static void main(String args[])
    {String fistnum,secondnum,result;
      int num1,num2,sum;  

    fistnum = JOptionPane.showInputDialog("Enter :");
    secondnum = JOptionPane.showInputDialog("Enter :");
  
    num1 = Integer.parseInt( fistnum );
    num2 = Integer.parseInt( secondnum );

    sum = num1 + num2;
    result = num1 + " + " + num2 + " = " + sum;

    JOptionPane.showMessageDialog(
    null, result, "Adder", JOptionPane.INFORMATION_MESSAGE );

  }
}