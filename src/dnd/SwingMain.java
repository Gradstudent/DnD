package dnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.GridLayout;

public class SwingMain extends JFrame {
	private int count;
	private JPanel contentPane;
	private JTextField txtGibCharakterNamen;
	private JTextField strength;
	private JTextField constitution;
	private JTextField level;
	private JTextField AttrModStr;
	private JTextField AttrModCons;
	private JTextField AttrModHalfLevStr;
	private JTextField AttrModHalfLevCons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
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
	public SwingMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setBounds(20, 15, 36, 16);
		contentPane.add(name);
		
		txtGibCharakterNamen = new JTextField();
		txtGibCharakterNamen.setBounds(67, 10, 243, 26);
		txtGibCharakterNamen.setText("Gib Charakter Namen ein.");
		contentPane.add(txtGibCharakterNamen);
		txtGibCharakterNamen.setColumns(10);
		
		JLabel lblAttribute = new JLabel("Attribute");
		lblAttribute.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAttribute.setBounds(20, 85, 94, 16);
		contentPane.add(lblAttribute);
		
		JLabel lblStrke = new JLabel("Stärke");
		lblStrke.setBounds(20, 120, 61, 16);
		contentPane.add(lblStrke);
		
		JLabel lblKonstitution = new JLabel("Konstitution");
		lblKonstitution.setBounds(20, 148, 94, 16);
		contentPane.add(lblKonstitution);
		
		strength = new JTextField();
		strength.setText("14");
		strength.setBounds(110, 115, 36, 26);
		contentPane.add(strength);
		strength.setColumns(10);
		
		constitution = new JTextField();
		constitution.setText("12");
		constitution.setBounds(110, 138, 36, 26);
		contentPane.add(constitution);
		constitution.setColumns(10);
		
		JLabel lblAttributMod = new JLabel("Attribut Mod");
		lblAttributMod.setBounds(153, 86, 89, 16);
		contentPane.add(lblAttributMod);
		
		JLabel lblAttributMod_1 = new JLabel("Attribut Mod + 1/2 Stufe");
		lblAttributMod_1.setBounds(268, 86, 164, 16);
		contentPane.add(lblAttributMod_1);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(20, 43, 61, 16);
		contentPane.add(lblLevel);
		
		level = new JTextField();
		level.setText("1");
		level.setBounds(77, 38, 69, 26);
		contentPane.add(level);
		level.setColumns(10);
		
		AttrModStr = new JTextField();
		AttrModStr.setEditable(false);
		AttrModStr.setText("0");
		AttrModStr.setBounds(158, 115, 130, 26);
		contentPane.add(AttrModStr);
		AttrModStr.setColumns(10);
		
		AttrModCons = new JTextField();
		AttrModCons.setEditable(false);
		AttrModCons.setText("0");
		AttrModCons.setBounds(158, 138, 130, 26);
		contentPane.add(AttrModCons);
		AttrModCons.setColumns(10);
		
		AttrModHalfLevStr = new JTextField();
		AttrModHalfLevStr.setEditable(false);
		AttrModHalfLevStr.setText("0");
		AttrModHalfLevStr.setBounds(300, 115, 130, 26);
		contentPane.add(AttrModHalfLevStr);
		AttrModHalfLevStr.setColumns(10);
		
		AttrModHalfLevCons = new JTextField();
		AttrModHalfLevCons.setEditable(false);
		AttrModHalfLevCons.setText("0");
		AttrModHalfLevCons.setBounds(300, 138, 130, 26);
		contentPane.add(AttrModHalfLevCons);
		AttrModHalfLevCons.setColumns(10);
		
		JButton btnModBerechnen = new JButton("Mod berechnen");
		btnModBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int attributeStr = -5 + (int)Math.floor(Integer.parseInt(strength.getText())/2);
				AttrModStr.setText(attributeStr+ "");
				int attributeCons = -5 + (int)Math.floor(Integer.parseInt(constitution.getText())/2);
				AttrModCons.setText(attributeCons+ "");
				int halfLevStr = attributeStr + (int)Math.floor(Integer.parseInt(level.getText()));
				int halfLevCons = attributeCons + (int)Math.floor(Integer.parseInt(level.getText())/2);
				AttrModHalfLevStr.setText(halfLevStr + "");
				AttrModHalfLevCons.setText(halfLevCons + "");
			}			
		});
		btnModBerechnen.setBounds(146, 193, 164, 29);
		contentPane.add(btnModBerechnen);
		
		JPanel panel = new JPanel();
		panel.setBounds(16, 80, 416, 101);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
	}
}
