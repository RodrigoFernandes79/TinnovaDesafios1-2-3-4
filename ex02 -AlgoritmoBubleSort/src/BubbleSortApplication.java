
public class BubbleSortApplication {

	public static void main(String[] args) {
		
		int v[] = { 5, 3, 2, 4, 7, 1, 0, 6 };
		int aux;
		boolean control;
		
		for(int i = 0;  i < v.length;++i) {
			control=true;
			for(int j =0; j<(v.length-1);++j) {
				
				if(v[j]>v[j+1]) {
					aux=v[j];
					v[j]=v[j+1];
					v[j+1]=aux;
					control=false;
				}
			}
			if(control) {
				break;
			}
}
		for(int i = 0;  i < v.length;++i) {
			System.out.print(v[i]+" ");
		}
	}
}
