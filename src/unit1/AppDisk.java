package unit1;

import javax.swing.JOptionPane;

public class AppDisk {

	public static void main(String a[]){
		ListaMultimedia listaMultimedia = new ListaMultimedia(8);
		


		listaMultimedia.add(new Disk("Fighters", 1996, Format.audioCD, 57, "pop"));
		listaMultimedia.add(new Disk("Revive", 2012, Format.audioCD, 106, "Blues"));
		listaMultimedia.add(new Disk("Infinity on High", 2002, Format.dvd, 76, "rock"));
		
		String lista = listaMultimedia.toString();


		JOptionPane.showMessageDialog(null, lista);


		Disk diskob = new Disk("Revive", 2012, Format.audioCD, 106, "Blues");

		int position = listaMultimedia.indexOf(diskob);
		JOptionPane.showMessageDialog(null, "The disc is on the position number: "+position+" in the array");

		JOptionPane.showMessageDialog(null, "The disc on that position is:\n"+listaMultimedia.get(position));


	}

}
