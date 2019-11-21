//TE18 Alexander jonsson Näslund
// 2019-11-21

import javax.swing.*;

public class Medelvarde {
    public static void main(String[] args) {
        int[] b = new int[10];
        b[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "det första talet?"));
        b[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "det andra talet?"));
        b[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "det tredje talet?"));
        b[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "det fjärde talet?"));
        b[4] = Integer.parseInt(JOptionPane.showInputDialog(null, "det femte talet?"));
        b[5] = Integer.parseInt(JOptionPane.showInputDialog(null, "det sjätte talet?"));
        b[6] = Integer.parseInt(JOptionPane.showInputDialog(null, "det sjunde talet?"));
        b[7] = Integer.parseInt(JOptionPane.showInputDialog(null, "det åttonde talet?"));
        b[8] = Integer.parseInt(JOptionPane.showInputDialog(null, "det nionde talet?"));
        b[9] = Integer.parseInt(JOptionPane.showInputDialog(null, "det tionde talet?"));
        int a = 0;
        for (int i = 0; i < b.length; i++){
            a = b[i]+a;

        }
    System.out.println(a/10);



    }
}
