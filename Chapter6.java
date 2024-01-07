import java.util.*;
public class Chapter6 {
    public static void ProgrammingExercise6_35() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.print(area);
    }
public static void ProgrammingExercise6_39() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x0: ");
		double x0 = input.nextDouble();

		System.out.print("Enter y0: ");
		double y0 = input.nextDouble();

		System.out.print("Enter x1: ");
		double x1 = input.nextDouble();

		System.out.print("Enter y1: ");
		double y1 = input.nextDouble();

		System.out.print("Enter x2: ");
		double x2 = input.nextDouble();

		System.out.print("Enter y2: ");
		double y2 = input.nextDouble();

		double area = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		System.out.println(area);


		if (area > 0) {
			System.out.println((leftOfTheLine(1,1,2,2,1,1.5)));
			System.out.println("(" + x2 + "," + y2+ ")"  + " is on the left side of the line from " +
					"(" + x0 + "," + y0+ ") to "  + "(" + x1 + "," + y1+ ")");
		}
		else if (area == 0) {
			System.out.println((OnTheSameLine(1, 1, 2, 2, 1, 1.5)));
			System.out.println("(" + x2 + "," + y2+ ")"  + " is on the same line from " +
					"(" + x0 + "," + y0+ ") to "  + "(" + x1 + "," + y1+ ")");
		}
		else if (area < 0) {
			System.out.println((leftOfTheLine(1,1,2,2,1,1.5)));
			System.out.println("(" + x2 + "," + y2+ ")"  + " is on the right side of the line from " +
							"(" + x0 + "," + y0+ ") to "  + "(" + x1 + "," + y1+ ")");

		}


	}
		public static boolean leftOfTheLine(double x0, double y0,
		 double x1, double y1, double x2, double y2) {
		return true;
		}

		public static boolean OnTheSameLine(double x0, double y0,
		double x1, double y1, double x2, double y2) {
		return true;
	}
		public static boolean OnTheLineSegment(double x0, double y0,
		double x1, double y1, double x2, double y2){
		return true;
	}

}




