import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;


public class Node extends JButton implements ActionListener{
    Node parents;
    int col; int row;
    int gCost; int hCost; int fCost;
    boolean start; boolean end;
    boolean solid; boolean open; boolean checked;

    public Node(int col, int row){
        this.col = col;
        this.row = row;

        setBackground(Color.white);
        setForeground(Color.black);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        setBackground(Color.yellow);

    }


}