
public class EntNumber {
public static void main (String [] args) {
	Reader2 r = new Reader2();
	r.Scan();
	r.i = count(r.i);
	r.k = count(r.k);
	r.Scan(r.i,r.k);
}
private static int count(int x) {
	x = x+1;
	return x;
}
}