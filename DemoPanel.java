import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class DemoPanel extends JPanel{
    // screen size setting
    final int maxcol = 15;
    final int maxrow = 10;
    final int nodeSize = 70;
    final int screenW = nodeSize * maxcol; //screen width
    final int screenH = nodeSize * maxrow; // screen height

    Node[][] node = new Node[maxcol][maxrow];

    public DemoPanel(){
        this.setPreferredSize(new Dimension(screenW,screenH));
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(maxrow,maxcol));

        //place node
        int col = 0;
        int row = 0;

        while (col < maxcol && row < maxrow){
            node[col][row] = new Node(col,row);
            this.add(node[col][row]);

            col++;
            if (col == maxcol){
                col = 0;
                row++;
            }
        }
    }

}