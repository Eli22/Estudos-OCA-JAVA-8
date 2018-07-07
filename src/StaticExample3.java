
public class StaticExample3 {
	//passbyreference
	public static void main(String[] args) {
		int original1 = 1;
		int original2 = 2;
		swapByReference(original1, original2);
		print(original1); // 2 (not in Java)
		print(original2); // 1 (not in Java)
		swapByReference(a, b) {
		temp = a;
		a = b;
		b = temp;
		}
