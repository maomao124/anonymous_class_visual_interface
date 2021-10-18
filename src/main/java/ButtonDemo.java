import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project name(项目名称)：匿名类_可视化界面
 * Package(包名): PACKAGE_NAME
 * Class(类名): ButtonDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/18
 * Time(创建时间)： 13:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

class ButtonAction implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println(event.getActionCommand());
    }
}

public class ButtonDemo extends JFrame
{
    Container c;
    JButton b;
    JTextField t;

    public void createGUI()
    {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        c = getContentPane();

        b = new JButton("按钮");
        b.addActionListener(new ButtonAction());
        c.add(b);

        t = new JTextField(10);
        c.add(t);

        pack();
        setVisible(true);

    }

    public static void main(String s[])
    {
        ButtonDemo bd = new ButtonDemo();
        bd.createGUI();
    }
}
