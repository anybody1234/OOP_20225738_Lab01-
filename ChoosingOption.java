import javax.swing.JOptionPane;
public class ChoosingOption{
	public static void main(String[] args){
		int option = JOptionPane.showConfirmDialog(null,"Do you want to change the first class ticket?");
		JOptionPane.showMessageDialog(null,"You've chosen: "+(option==JOptionPane.YES_OPTION?"Yes":"No"));
		option = JOptionPane.showConfirmDialog(null, "Are you sure", "Select an Option", JOptionPane.YES_NO_OPTION);
		System.exit(0);
}
}
// What happens if users choose “Cancel”?
// Code se tu chon No
