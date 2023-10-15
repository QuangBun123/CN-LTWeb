
package lequang;
class Complex {
	private double pt1, pt2, pa1, pa2;

	public Complex() {
		this.pt1 = pt1;
		this.pt2 = pt2;
		this.pa1 = pa1;
		this.pa2 = pa2;
	}

	public static String tong(int pt1, int pt2, int pa1, int pa2) {
		return (pt1 + pt2) + ((pa1 + pa2) >= 0 ? "+ " + (pa1 + pa2) : "- " + Math.abs(pa1 + pa2)) + "*i";
	}

	public static String hieu(int pt1, int pt2, int pa1, int pa2) {
		return (pt1 - pt2) + " " + ((pt1 - pt2) >= 0 ? "+ " + (pa1 - pa2) : "- " + Math.abs(pa1 - pa2)) + "*i";
	}

	public static String nhan(int pt1, int pt2, int pa1, int pa2) {
		return ((pt1 * pt2) - (pa1 * pa2)) + "" + (((pt1 * pa2) + (pa1 * pt2)) >= 0 ? "+ " + (pt1 * pa2) + (pa1 * pt2)
				: "- " + Math.abs((pt1 * pa2) + (pa1 * pt2))) + "*i";
	}

	public static String chia(double pt1, double pt2, double pa1, double pa2) {
		return "Thuong 2 so phuc = (" + (pt1 * pt2 + pa1 * pa2) / (Math.pow(pt2, 2) + Math.pow(pa2, 2)) + ") + ("
				+ (pa1 * pt2 - pt1 * pa2) / (Math.pow(pt2, 2) + Math.pow(pa2, 2)) + ")*i";
	}

}

public class bai3 {
	public static void main(String args[]) {
		Complex vk = new Complex();
		System.out.println("tong hai so phuc: " + vk.tong(1, 2, 3, 4));
		System.out.println("hieu hai so phuc: " + vk.hieu(4, 5, 6, 7));
		System.out.println("tich hai so phuc: " + vk.nhan(5, 6, 2, 5));
		System.out.println("thuong hai so phuc: " + vk.chia(6, 2, 10, 5));
	}
}