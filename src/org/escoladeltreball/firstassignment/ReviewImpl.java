/**
 * 
 */
package org.escoladeltreball.firstassignment;

import java.util.ArrayList;

/**
 * @author Pep Méndez
 *
 */
public final class ReviewImpl implements Review {	
	
	/**
	 * 
	 * @param values
	 *            and array of unordered integers
	 * @param n
	 *            the value to check out
	 * @return the frequency of n in values
	 */
	private int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.escoladeltreball.firstassignment.Utils#frequencyPercentage(int[],
	 * int)
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		return values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Utils#merge(int[], int)
	 */
	@Override
	public int[] merge(int[] values, int n) {
	    int pos = 0;
	    ArrayList<Integer> foo = new ArrayList<Integer>();    
	    for (int i = 0; i < values.length; i++) {
	      if (values[i] <= n) {
	        pos = i+1;
	      }
	      foo.add(values[i]);
	    }	    
	    if (n > foo.get(foo.size() - 1)) {
	      foo.add(foo.size(), n);
	    } else {
	      foo.add(pos, n);
	    }	    
	    Integer[] newValues = foo.toArray(new Integer[foo.size()]);
	    int[] result = new int[newValues.length];
	    for (int j = 0; j < newValues.length; j++) {
	      result[j] = newValues[j];
	    }
	    return result;
	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and
	 * row 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	@Override
	public int[][] split(int[] values) {
		return null;
	}

}
