import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKQ;
	private JTextField txtCasiocaculator;
	boolean kt = true;
	boolean dau = false;
	double val = 0;
	String Pheptinh = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMain frame = new JMain();
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
	public JMain() {
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtKQ = new JTextField();
		txtKQ.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtKQ.setBackground(Color.LIGHT_GRAY);
		txtKQ.setBounds(10, 11, 414, 106);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);

		JButton btnButton_2 = new JButton("2");
		btnButton_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_2.setBackground(Color.GRAY);
		btnButton_2.setBounds(130, 349, 70, 70);
		contentPane.add(btnButton_2);

		JButton btnButton_0 = new JButton("0");
		btnButton_0.setBackground(Color.GRAY);
		btnButton_0.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_0.setBounds(20, 430, 70, 70);
		contentPane.add(btnButton_0);

		JButton btnButton_1 = new JButton("1");
		btnButton_1.setBackground(Color.GRAY);
		btnButton_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_1.setBounds(20, 349, 70, 70);
		contentPane.add(btnButton_1);

		JButton btnButton_4 = new JButton("4");
		btnButton_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_4.setBackground(Color.GRAY);
		btnButton_4.setBounds(20, 268, 70, 70);
		contentPane.add(btnButton_4);

		JButton btnButton_3 = new JButton("3");
		btnButton_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_3.setBackground(Color.GRAY);
		btnButton_3.setBounds(241, 349, 70, 70);
		contentPane.add(btnButton_3);

		JButton btnButton_7 = new JButton("7");
		btnButton_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_7.setBackground(Color.GRAY);
		btnButton_7.setBounds(20, 187, 70, 70);
		contentPane.add(btnButton_7);

		JButton btnButton_8 = new JButton("8");
		btnButton_8.setBackground(Color.GRAY);
		btnButton_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_8.setBounds(130, 187, 70, 70);
		contentPane.add(btnButton_8);

		JButton btnButton_5 = new JButton("5");
		btnButton_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_5.setBackground(Color.GRAY);
		btnButton_5.setBounds(130, 268, 70, 70);
		contentPane.add(btnButton_5);

		JButton btnButton_6 = new JButton("6");
		btnButton_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_6.setBackground(Color.GRAY);
		btnButton_6.setBounds(241, 268, 70, 70);
		contentPane.add(btnButton_6);

		JButton btnButton_9 = new JButton("9");
		btnButton_9.setBackground(Color.GRAY);
		btnButton_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_9.setBounds(241, 187, 70, 70);
		contentPane.add(btnButton_9);

		ActionListener numberListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				String currentText = txtKQ.getText();
				txtKQ.setText(currentText + btn.getText());
			}
		};

		btnButton_0.addActionListener(numberListener);
		btnButton_1.addActionListener(numberListener);
		btnButton_2.addActionListener(numberListener);
		btnButton_3.addActionListener(numberListener);
		btnButton_4.addActionListener(numberListener);
		btnButton_5.addActionListener(numberListener);
		btnButton_6.addActionListener(numberListener);
		btnButton_7.addActionListener(numberListener);
		btnButton_8.addActionListener(numberListener);
		btnButton_9.addActionListener(numberListener);

		JButton btnButton_note = new JButton(".");
		btnButton_note.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_note.setBackground(Color.GRAY);
		btnButton_note.setBounds(130, 430, 70, 70);
		contentPane.add(btnButton_note);

		btnButton_note.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtKQ.getText();
				if (!currentText.contains(".")) {
					txtKQ.setText(currentText + ".");
				}
			}
		});

		JButton btnButton_Add = new JButton("+");
		btnButton_Add.setForeground(new Color(255, 165, 0));
		btnButton_Add.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_Add.setBackground(Color.GRAY);
		btnButton_Add.setBounds(354, 187, 70, 70);
		contentPane.add(btnButton_Add);

		btnButton_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = Double.parseDouble(txtKQ.getText());
				Pheptinh = "+";
				txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

			}
		});

		JButton btnButton_Sub = new JButton("-");
		btnButton_Sub.setForeground(new Color(255, 165, 0));
		btnButton_Sub.setFont(new Font("Tahoma", Font.BOLD, 60));
		btnButton_Sub.setBackground(Color.GRAY);
		btnButton_Sub.setBounds(354, 268, 70, 70);
		contentPane.add(btnButton_Sub);

		btnButton_Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = Double.parseDouble(txtKQ.getText());
				Pheptinh = "-";
				txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

			}
		});

		JButton btnButton_Multi = new JButton("x");
		btnButton_Multi.setForeground(new Color(255, 165, 0));
		btnButton_Multi.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_Multi.setBackground(Color.GRAY);
		btnButton_Multi.setBounds(354, 349, 70, 70);
		contentPane.add(btnButton_Multi);

		btnButton_Multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = Double.parseDouble(txtKQ.getText());
				Pheptinh = "x";
				txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

			}
		});

		JButton btnButton_Div = new JButton("/");
		btnButton_Div.setForeground(new Color(255, 140, 0));
		btnButton_Div.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_Div.setBackground(Color.GRAY);
		btnButton_Div.setBounds(354, 430, 70, 70);
		contentPane.add(btnButton_Div);

		btnButton_Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = Double.parseDouble(txtKQ.getText());
				Pheptinh = "/";
				txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

			}
		});

		JButton btnButton_CLR = new JButton("CLR");
		btnButton_CLR.setBackground(Color.GRAY);
		btnButton_CLR.setForeground(new Color(255, 140, 0));
		btnButton_CLR.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_CLR.setBounds(307, 128, 117, 48);
		contentPane.add(btnButton_CLR);

		btnButton_CLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKQ.setText("");
				val = 0;
				Pheptinh = "";
			}
		});

		JButton btnButton_Equals = new JButton("=");
		btnButton_Equals.setForeground(new Color(255, 165, 0));
		btnButton_Equals.setBackground(Color.GRAY);
		btnButton_Equals.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnButton_Equals.setBounds(241, 430, 70, 70);
		contentPane.add(btnButton_Equals);

		btnButton_Equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text = txtKQ.getText().trim(); 
					if (text.isEmpty()) {
						txtKQ.setText("Lỗi nhập liệu");
						return;
					}


					if (text.contains("+") || text.contains("-") || text.contains("x") || text.contains("/")) {
						String[] parts = text.split(" ");


						if (parts.length == 3) {
							double firstVal = Double.parseDouble(parts[0]);
							double secondVal = Double.parseDouble(parts[2]);


							switch (parts[1]) {
							case "+":
								val = firstVal + secondVal;
								break;
							case "-":
								val = firstVal - secondVal;
								break;
							case "x":
								val = firstVal * secondVal;
								break;
							case "/":
								if (secondVal != 0) {
									val = firstVal / secondVal;
								} else {
									txtKQ.setText("Lỗi chia 0");
									return;
								}
								break;
							default:
								txtKQ.setText("Lỗi phép tính");
								return;
							}
							txtKQ.setText(String.valueOf(val));
						} else {
							txtKQ.setText("Lỗi phép tính");
						}
					} else {
						txtKQ.setText("Lỗi phép tính");
					}
				} catch (Exception ex) {
					txtKQ.setText("Lỗi nhập liệu"); 
				}
			}
		});

		txtCasiocaculator = new JTextField();
		txtCasiocaculator.setHorizontalAlignment(SwingConstants.CENTER);
		txtCasiocaculator.setForeground(new Color(0, 0, 0));
		txtCasiocaculator.setText("CASIO_Caculator");
		txtCasiocaculator.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtCasiocaculator.setBackground(Color.DARK_GRAY);
		txtCasiocaculator.setBounds(20, 128, 277, 48);
		contentPane.add(txtCasiocaculator);
		txtCasiocaculator.setColumns(10);
	}
}
