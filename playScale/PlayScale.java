/*
 * Author: Osmel Savon
 * CSC 208-601
 * 4/6/17
 */

package playScale;

import stdlib.*;

public class PlayScale {
	
	public static void playTone(double frequency, double duration) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			slices[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
		}
		StdAudio.play(slices);
	}
	// I used "algs/data/scalenotes.txt", due to dir set up
	public static void main(String[] args) {
		StdIn.fromFile("algs/data/scalenotes.txt");
		double[] values = StdIn.readAllDoubles();
		// values contains an array of double values
		for (double i: values) {
			//Different for loop. for (double i = 0; i< values.length; i++){ }
			playTone( i,.2);
		}

	}

}
