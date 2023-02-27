package ex3;	

public interface Sortable {
	public abstract int compare(Sortable b);
	public static void shell_sort(Sortable[] a){
		int jml = a.length;
		for (int jeda = jml/2; jeda > 0; jeda /= 2){
	        for (int i = jeda; i < jml; i += 1){
	            Sortable bantu = a[i];
	            int j;
	            for (j = i; j >= jeda && a[j - jeda].compare(bantu) == 1; j -= jeda) {
	                a[j] = a[j - jeda];
	            }
	            a[j] = bantu;  
	        }  
	    }  
	}
}
