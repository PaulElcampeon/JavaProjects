package pmcc;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PMCCGUI extends JFrame implements ActionListener{

	private JPanel panel = new JPanel();
	private JLabel instructions;
	private JLabel xVar;
	private JLabel yVar;
	private JTextField xVariables;
	private JTextField yVariables;
	private JButton initiate;
	private JLabel answer;

	public PMCCGUI() {
		
		panel.setLayout(null);
		
		instructions = new JLabel("Enter your independent(x) and depent variables(y) in the space below seperated by a comma");
		instructions.setFont(new Font("Tahoma", Font.BOLD, 20));
		instructions.setHorizontalAlignment(SwingConstants.CENTER);
		instructions.setBounds(10,11,1000,32);
		panel.add(instructions);
		
		xVar = new JLabel("x");
		xVar.setFont(new Font("Tahoma", Font.BOLD, 20));
		xVar.setBounds(350,54,21,32);
		panel.add(xVar);
		
		yVar = new JLabel("y");
		yVar.setFont(new Font("Tahoma", Font.BOLD, 20));
		yVar.setBounds(350,104,21,32);
		panel.add(yVar);
		
		xVariables = new JTextField();
		xVariables.setFont(new Font("Tahoma", Font.PLAIN, 18));
		xVariables.setBounds(390,54,427,32);
		panel.add(xVariables);
		
		yVariables = new JTextField();
		yVariables.setFont(new Font("Tahoma", Font.PLAIN, 18));
		yVariables.setBounds(390,104,427,32);
		panel.add(yVariables);
		
		initiate = new JButton("Initiate");
		initiate.setFont(new Font("Tahoma", Font.BOLD, 20));
		initiate.setBounds(540,147,121,41);
		initiate.addActionListener(this);
		panel.add(initiate);

		answer = new JLabel("Your answer will appear here");
		answer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setBounds(340,199,517,32);
		panel.add(answer);
		
		super.add(panel);
		
		super.setTitle("Product Moment Correlation Coefficient");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(1100,300);
		super.setResizable(false);
		super.setVisible(true);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent event) {
		Methods methods = new Methods();
		
		if(event.getSource() == initiate) {
			String XVAR = xVariables.getText().trim();
			String YVAR = yVariables.getText().trim();
			if(XVAR.matches(".*[a-z].*")|| YVAR.matches(".*[a-z].*")||XVAR.matches("")) {
				JOptionPane.showMessageDialog(this, "You cannot have letters in your fields please correct this.");
				}
			else {
				String[] XVARIABLES = XVAR.split("[,]");
				String[] YVARIABLES = YVAR.split("[,]");
				if(checker1(XVARIABLES) == true || checker2(YVARIABLES) == true) {
					JOptionPane.showMessageDialog(this, "You have left some blank spaces, please correct this.");
					}
				else {
					double[] independent = new double[XVARIABLES.length];
					for(int i = 0; i<XVARIABLES.length; i++) {
						independent[i] = Double.parseDouble(XVARIABLES[i]);
						}
					double[] dependent = new double[YVARIABLES.length];
					for(int j = 0; j<YVARIABLES.length; j++) {
						dependent[j] = Double.parseDouble(YVARIABLES[j]);
						}
					int counter = XVARIABLES.length;
					if(independent.length != dependent.length) {
						JOptionPane.showMessageDialog(this, "The number of values in each field are not the same please correct this.\n You have "+XVARIABLES.length+" values in your independent variable field.\n You have "+YVARIABLES.length+" values in your dependent variable field.");
						}
					else {
						double ans = methods.Sxy(independent, dependent, counter)/(Math.sqrt(methods.Sxx(independent, counter)*methods.Syy(dependent, counter)));
						double ansRounded = (Math.round(ans*1000000.0))/1000000.0;
						if(ansRounded>=0.75 && ansRounded<=1.0 ) {
							answer.setText(Double.toString(ansRounded)+"... Strong Positive Correlation" );
							}
						if(ansRounded>=0.5 && ansRounded<0.75 ) {
							answer.setText(Double.toString(ansRounded)+"... Positive Correlation" );
							}
						if(ansRounded>=0.2 && ansRounded<0.5 ) {
							answer.setText(Double.toString(ansRounded)+"... Weak Positive Correlation" );
							}
						if(ansRounded>=-0.2 && ansRounded<0.2 ) {
							answer.setText(Double.toString(ansRounded)+"... No Significant Correlation" );
							}
						if(ansRounded>=-0.5 && ansRounded<-0.2 ) {
							answer.setText(Double.toString(ansRounded)+"... Weak Negative Correlation" );
							}
						if(ansRounded>=-0.75 && ansRounded<-0.5 ) {
							answer.setText(Double.toString(ansRounded)+"... Negative Correlation" );
							}
						if(ansRounded>=-1.0 && ansRounded<-0.75 ) {
							answer.setText(Double.toString(ansRounded)+"... Strong Negative Correlation" );
							}
						}
					} 
				}
			}
		}
		
	public static boolean checker1(String[] a) {
		for (String s: a) {
			if (s.equals("")) {
				return true;
				}
			}
		return false;
		}
	public static boolean checker2(String[] b) {
		for (String s: b) {
			if (s.equals("")) {
				return true;
				}
			}
		return false;
		}
	}