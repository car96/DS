package unit1;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

import javax.swing.*;

//public class Disk extends Multimedia implements ActionListener{
public class Disk extends Multimedia {


	String genres[] = {"Rock", "Pop", "Soul", "HipHop", "Flamenco", "Blues", "Jazz", "Techno"};
	String genre;
	JComboBox<String> genreList = new JComboBox<String>(genres);

	public Disk(String title, int year, Format format, double duration) {
		super(title, year, format, duration);
	}
	
	public Disk(String title, int year, Format format, double duration, String genre) {
		super(title, year, format, duration);
		this.genre = genre;
	}

	/**
	 * Unused chunk of code, it may be useful in another (interactive) class/program, but not going to delete it
	 * because I took too long writing it, and is my baby <3 (not really, but it took long to write)
	public void selectGenre(){


		genreList.setSelectedItem(0);
		genreList.addActionListener(this);
		JOptionPane.showMessageDialog(null, genreList);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() instanceof JComboBox){
			@SuppressWarnings("unchecked")
			JComboBox<String> source = (JComboBox<String>)e.getSource();
			genre = (String)source.getSelectedItem();
		}

	}
	
	public String getGenre(){
		return genre;
	}
	**/

	public String toString(){
		return "Title: "+title+"\nYear: "+year+"\nFormat: "+format+"\nDuration: "+duration+"\nGenre: "+genre;
	}

}
