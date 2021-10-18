import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project name(项目名称)：匿名类_可视化界面
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/18
 * Time(创建时间)： 13:19
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Qframe extends JFrame
{
    public Qframe()
    {
        JButton jButton = new JButton("new");
        JPanel panel = new JPanel();
        panel.add(jButton);
        /*
        add(jbtNew);
        jbtNew.addactionlistener(new ActionListener()
        {
            public void actionperformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "单击了按钮");
                System.out.println("process new");
            }
        });

         */
    }

    public static void main(String[] args)
    {
        JFrame feame = new Qframe();
        feame.setTitle("qframe");
        feame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        feame.setLocationRelativeTo(null);
        feame.pack();
        feame.setVisible(true);
    }
}
