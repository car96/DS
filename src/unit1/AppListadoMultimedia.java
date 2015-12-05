package unit1;

import javax.swing.JOptionPane;

public class AppListadoMultimedia {

	public static void main(String[] args) throws Exception {
		//Creation of the Lista Multimedia object
		ListaMultimedia listaMultimedia = new ListaMultimedia(10);
		
		//Addition of the 3 objects of the class Film to the Lista Multimedia
		listaMultimedia.add(new Film("Blade", 1998, Format.dvd, 96, null, "New Line Cinema"));
		listaMultimedia.add(new Film("X-Men", 2000, Format.dvd, 106, "Bryan Singer", "20th Century Fox"));
		listaMultimedia.add(new Film("Spider Man", 2000, Format.dvd, 132, "Sam Raimi", null));
		
		//Showing the objects on the screen
		JOptionPane.showMessageDialog(null, listaMultimedia.toString());
		
		//Creating an object to search for in the Lista Multimedia array
		Film filmob = new Film("X-Men", 2000, Format.dvd, 106, "Bryan Singer", "20th Century Fox");
		
		int position = listaMultimedia.indexOf(filmob);
		JOptionPane.showMessageDialog(null, "The Film is on the position number: "+position+" in the array");
		
		JOptionPane.showMessageDialog(null, "The film on that position is:\n"+listaMultimedia.get(position));
		
	}

}
