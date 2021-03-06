public class Triple<A,B,C> {
	A left;
	B middle;
	C right;

	public Triple(A left, B middle, C right) {
		this.left = left;
		this.middle = middle;
		this.right = right;
	}
 
	public A getLeft() {
		return left;
	}

	public B getMiddle() {
		return middle;
	}

	public C getRight() {
		return right;
	}

	public String toString() {
		return String.format("< %s, %s, %s >", left, middle, right);
	}
}

class Pair<A, B> {
	A left;
	B right;

	public Pair(A left, B right) {
		this.left = left;
		this.right = right;
	}
 
	public A getLeft() {
		return left;
	}

	public B getRight() {
		return right;
	}

	public String toString() {
		return String.format("< %s, %s>", left, right);
	}
}