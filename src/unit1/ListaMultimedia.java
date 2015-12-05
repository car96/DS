package unit1;

public class ListaMultimedia {
	private Multimedia array[];

	public ListaMultimedia(int count) {
		array = new Multimedia[count];
	}

	public int size(){
		int i=0;
		while(array[i] != null){
			i++;
		}
		return i;
	}

	public boolean add(Multimedia m){
		for(int i=0; i<array.length; i++){
			if(array[i] == null){
				array[i] = m;
				return true;
			}
		}
		return false;
	}

	public Multimedia get(int position){
		if(position < array.length){
			return array[position];
		}
		return null;
	}

	public int indexOf(Multimedia m){
		for(int i=0; i<array.length; i++){
			if(array[i].equals(m)){
				return i;
			}
		}
		return -1;
	}

	public String toString(){
		String str = "";
		for(int i=0; i<array.length; i++){
			if(array[i] != null){
				str += array[i].toString() + "\n\n";
			}
		}
		return str;
	}
}
