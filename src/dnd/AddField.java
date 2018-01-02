package dnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddField extends JFrame {

	private JPanel contentPane;
	int a=35;

	 JTextField originalField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddField frame = new AddField();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddField() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		JButton btnWeiteresFeld = new JButton("Weiteres Feld");
		btnWeiteresFeld.setBounds(6, 11, 127, 29);
		btnWeiteresFeld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField newField;
				
				newField = new JTextField();
				newField.setBounds(145, a, 130, 26);
				contentPane.add(newField);
				a+=25;
				contentPane.repaint();
				newField.setColumns(10);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnWeiteresFeld);
		
		originalField = new JTextField();
		originalField.setBounds(145, 11, 130, 26);
		contentPane.add(originalField);
		originalField.setColumns(10);
		
		
	}

}
