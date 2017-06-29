package WindowProgramming;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class Calculator {

		private JFrame frame;
		private JTextField textField;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Calculator window = new Calculator();
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
		public Calculator() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 729, 485);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(37, 57, 597, 81);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "1";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton.setBounds(37, 161, 89, 38);
			frame.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("4");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "4";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_1.setBounds(37, 215, 89, 38);
			frame.getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("7");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "7";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_2.setBounds(37, 264, 89, 38);
			frame.getContentPane().add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("2");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "2";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_3.setBounds(150, 161, 95, 38);
			frame.getContentPane().add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("5");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "5";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_4.setBounds(150, 215, 95, 38);
			frame.getContentPane().add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("8");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "8";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_5.setBounds(150, 264, 95, 38);
			frame.getContentPane().add(btnNewButton_5);
			
			JButton btnNewButton_6 = new JButton("0");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "0";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_6.setBounds(37, 323, 89, 38);
			frame.getContentPane().add(btnNewButton_6);
			
			JButton btnNewButton_7 = new JButton("3");
			btnNewButton_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				String func = "3";
				s =s.concat(func);
				textField.setText(s);
				}
			});
			btnNewButton_7.setBounds(271, 161, 89, 38);
			frame.getContentPane().add(btnNewButton_7);
			
			JButton btnNewButton_8 = new JButton("6");
			btnNewButton_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "6";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_8.setBounds(271, 215, 89, 38);
			frame.getContentPane().add(btnNewButton_8);
			
			JButton btnNewButton_9 = new JButton("9");
			btnNewButton_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "9";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_9.setBounds(271, 264, 89, 38);
			frame.getContentPane().add(btnNewButton_9);
			
			JButton btnNewButton_10 = new JButton(".");
			btnNewButton_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = ".";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_10.setBounds(150, 323, 95, 38);
			frame.getContentPane().add(btnNewButton_10);
			
			JButton btnNewButton_11 = new JButton("=");
			btnNewButton_11.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					String inp = textField.getText();
					int i=0;	
					for(i=0;i<inp.length();i++){
						int j= i+1;
						String sub1 = inp.substring(i, j);
						if(sub1.charAt(0) =='+'){
							String[] splits = inp.split("\\+");
							float first = Float.parseFloat(splits[0]);
							float second = Float.parseFloat(splits[1]);
							float ret = first+second;
							String setter = Float.toString(ret);
							textField.setText(setter);
						}
						else if(sub1.charAt(0) == '-'){
							String[] splits = inp.split("\\-");
							float first = Float.parseFloat(splits[0]);
							float second = Float.parseFloat(splits[1]);
							float ret = first-second;
							String setter = Float.toString(ret);
							textField.setText(setter);
						}
						else if(sub1.charAt(0) =='*'){
							String[] splits = inp.split("\\*");
							float first = Float.parseFloat(splits[0]);
							float second = Float.parseFloat(splits[1]);
							float ret = first*second;
							String setter = Float.toString(ret);
							textField.setText(setter);
						}
						else if(sub1.charAt(0) =='/'){
							String[] splits = inp.split("\\/");
							float first = Float.parseFloat(splits[0]);
							float second = Float.parseFloat(splits[1]);
							float ret = first/second;
							String setter = Float.toString(ret);
							textField.setText(setter);
						}	
					}
				}
				
			});
			btnNewButton_11.setBounds(271, 323, 89, 72);
			frame.getContentPane().add(btnNewButton_11);
			
			JButton btnNewButton_12 = new JButton("+");
			btnNewButton_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "+";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_12.setBounds(399, 169, 89, 72);
			frame.getContentPane().add(btnNewButton_12);
			
			JButton btnNewButton_13 = new JButton("-");
			btnNewButton_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "-";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_13.setBounds(498, 169, 89, 72);
			frame.getContentPane().add(btnNewButton_13);
			
			JButton btnNewButton_14 = new JButton("X");
			btnNewButton_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "*";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_14.setBounds(399, 250, 89, 64);
			frame.getContentPane().add(btnNewButton_14);
			
			JButton btnNewButton_15 = new JButton("/");
			btnNewButton_15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = textField.getText();
					String func = "/";
					s =s.concat(func);
					textField.setText(s);
				}
			});
			btnNewButton_15.setBounds(498, 252, 89, 62);
			frame.getContentPane().add(btnNewButton_15);
			
			JButton btnNewButton_16 = new JButton("AC");
			btnNewButton_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				}
			});
			btnNewButton_16.setBounds(399, 331, 188, 64);
			frame.getContentPane().add(btnNewButton_16);
		}
	}


