import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Words {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Words window = new Words();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Words() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		tf1.setBounds(113, 11, 241, 61);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBackground(SystemColor.windowBorder);
		tf2.setForeground(SystemColor.text);
		tf2.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		tf2.setEnabled(false);
		tf2.setBounds(113, 163, 241, 61);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel lb1 = new JLabel("Type here");
		lb1.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		lb1.setBounds(29, 26, 80, 46);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Result");
		lb2.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		lb2.setBounds(48, 169, 55, 46);
		frame.getContentPane().add(lb2);
		
		JButton btn = new JButton("Split");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputSentence = tf1.getText(),result = "";
				for(int i = 0; i < inputSentence.length();i++)
				{
					if(Character.isUpperCase(inputSentence.charAt(i))) result += " ";
					result += inputSentence.charAt(i);
				}
				tf2.setText(result);
			}			
		});
		btn.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 13));
		btn.setBounds(193, 102, 80, 37);
		frame.getContentPane().add(btn);
		
		
	}
}
