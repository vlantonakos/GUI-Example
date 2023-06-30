import java.awt.*;
import javax.swing.*;

public class ComponentViewer extends JFrame
{
	private JLabel label;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem openItem;
    private JMenuItem quitItem;
    private JButton button;
    private JTextField field;
    private JTextArea text;
    private JCheckBox cb1, cb2;
    private ButtonGroup radio;
    private JRadioButton rb1, rb2;
    private JComboBox<String> cbox;
    private JList<String> list;
    
    public ComponentViewer()
    {
        super("My First Window");
        makeFrame();
    }
    
    public void makeFrame()
    {
    	Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridLayout(0,1));
        
        label = new JLabel("An item-label...", JLabel.CENTER);    
        contentPane.add(label);
        
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        
        openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        quitItem = new JMenuItem("Exit");
        fileMenu.add(quitItem);

        button = new JButton("Button...");
        contentPane.add(button);
        
        field = new JTextField();
        field.setText("Text Field...");
        field.setFont(new Font("TimesRoman",Font.ITALIC,20));
        contentPane.add(field);
        
        text = new JTextArea();
        text.setText("A text area...\n");
        text.append("The text may be several lines\n...");
        contentPane.add(text);
        
        cb1 = new JCheckBox("Check Box 1", true);
        cb2 = new JCheckBox("Check Box 2", false);
        cb2.setSelected(true);
        contentPane.add(cb1);
        contentPane.add(cb2);
        
        radio = new ButtonGroup();
        rb1 = new JRadioButton("Radio Button 1", true);
        rb2 = new JRadioButton("Radio Button 2", false);
        radio.add(rb1);
        radio.add(rb2);
        contentPane.add(rb1);
        contentPane.add(rb2);
        
        String[] cboxStrings = { "Combo-box: Select-1", "Combo-box: Select-2", "Combo-box: Select-3"};
        cbox = new JComboBox<String>(cboxStrings);
        cbox.addItem("Combo-box: Select-4");
        cbox.addItem("Combo-box: Select-5");
        cbox.setSelectedIndex(0);
        contentPane.add(cbox);
       
        String[] listStrings = { "List: Select-1", "List: Select-2", "List: Select-3"};
        list = new JList<String>(listStrings);
        list.setSelectedIndex(1);
        list.setSelectionForeground(Color.magenta);
        contentPane.add(list); 
        
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}