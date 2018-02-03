package paulsBookStoreV2;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public interface AddRemoveFuncs {
	
	
	/*This method adds a book to the shopping cart resets the total 
	 * and proceeds to adds up the prices of the books in the shopping cart 
	 * It also displays the current items in the shopping cart in the cart display*/
	public default void addBTN(BookMaker book, ArrayList<BookMaker> shoppingcart, double total, String cartitems, JLabel totalLabel, JTextArea cartdisplay) {
		shoppingcart.add(book);
		total = 0;
		for(BookMaker y : shoppingcart) {
			total += y.getPrice();
		}		
		totalLabel.setText("Total: £"+Math.round(total * 100.0) / 100.0);
		cartitems="";
		for(BookMaker x: shoppingcart) {
			cartitems += x.getName()+":  £"+x.getPrice()+"\n";
			}
		cartdisplay.setText(cartitems);
		}

	/*This method removes a book from the shopping cart resets the total 
	 * and proceeds to adds up the prices of the books in the shopping cart
	 * It also displays the current items in the shopping cart in the cart display*/
	public default void removeBTN(BookMaker book, ArrayList<BookMaker> shoppingcart, double total, String cartitems, JLabel totalLabel, JTextArea cartdisplay) {
		if(shoppingcart.isEmpty()==true) {
			JOptionPane.showMessageDialog((Component) this, "Cart is empty");
		}
		else {
			if(shoppingcart.contains(book) == false) {
				JOptionPane.showMessageDialog((Component) this, book.getName()+" is not in cart");
				}
			else {
				shoppingcart.remove(book);
				total = 0;
				for(BookMaker y : shoppingcart) {
					total += y.getPrice();
				}
				totalLabel.setText("Total: £"+Math.round(total * 100.0) / 100.0);
				cartitems="";
				for(BookMaker x: shoppingcart) {
					cartitems += x.getName()+":  £"+x.getPrice()+"\n";
					}
				cartdisplay.setText(cartitems);
			}
		}
	}
}