package drawlogo;

	import stdlib.StdDraw;
	/*
	 * Author: Osmel Savon - CSC 300-601
	 */

	public class DrawLogo {

		public static void main(String[] args) {
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledSquare(.25,.75, .25);
			StdDraw.setPenColor(StdDraw.CYAN);
			StdDraw.filledCircle(.75, .75, .25);
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledSquare(.75, .25,.25);
			StdDraw.setPenColor(StdDraw.MAGENTA);
			StdDraw.filledCircle(.25, .25, .25);
		}

	}