package edu.stanford.bmir.protege.examples.view;
import java.util.*;
public class StringEqualityPercentCheckUsingJaroWinklerDistance {
	   public static void main(String args[]) {
	        printSimilarity("", "");
	        printSimilarity("", "a");
	        printSimilarity("aaapppp", "");
	        printSimilarity("frog", "fog");
	        printSimilarity("fly", "ant");
	        printSimilarity("elephant", "hippo");
	        printSimilarity("hippo", "elephant");
	        printSimilarity("hippo", "zzzzzzzz");
	        printSimilarity("hello", "hallo");
	        printSimilarity("ABC Corporation", "ABC Corp");
	        printSimilarity("D N H Enterprises Inc", "D & H Enterprises, Inc.");
	        printSimilarity("My Gym Children's Fitness Center", "My Gym. Childrens Fitness");
	        printSimilarity("PENNSYLVANIA", "PENNCISYLVNIA");
	        printSimilarity("The quick fox brown jumped", "The quick brown fox");
	    }
	   public static void printSimilarity(String s, String t) {
	        System.out.println(String.format("%.3f is the similarity between \"%s\" and \"%s\"", similarity(s, t), s, t));
	    }
	 
		/**
	     * JaroWinklerDistance
	     * Copied from https://commons.apache.org/sandbox/commons-text/jacoco/org.apache.commons.text.similarity/JaroWinklerDistance.java.html
	     * apply method changed to similarity
	     */
	    public static Double similarity(final CharSequence left, final CharSequence right) {
	        final double defaultScalingFactor = 0.1;
	        final double percentageRoundValue = 100.0;
	 
	        if (left == null || right == null) {
	            throw new IllegalArgumentException("Strings must not be null");
	        }
	 
	        int[] mtp = matches(left, right);
	        double m = mtp[0];
	        if (m == 0) {
	            return 0D;
	        }
	        double j = ((m / left.length() + m / right.length() + (m - mtp[1]) / m)) / 3;
	        double jw = j < 0.7D ? j : j + Math.min(defaultScalingFactor, 1D / mtp[3]) * mtp[2] * (1D - j);
	        return Math.round(jw * percentageRoundValue) / percentageRoundValue;
	    }
	    protected static int[] matches(final CharSequence first, final CharSequence second) {
	        CharSequence max, min;
	        if (first.length() > second.length()) {
	            max = first;
	            min = second;
	        } else {
	            max = second;
	            min = first;
	        }
	        int range = Math.max(max.length() / 2 - 1, 0);
	        int[] matchIndexes = new int[min.length()];
	        Arrays.fill(matchIndexes, -1);
	        boolean[] matchFlags = new boolean[max.length()];
	        int matches = 0;
	        for (int mi = 0; mi < min.length(); mi++) {
	            char c1 = min.charAt(mi);
	            for (int xi = Math.max(mi - range, 0), xn = Math.min(mi + range + 1, max.length()); xi < xn; xi++) {
	                if (!matchFlags[xi] && c1 == max.charAt(xi)) {
	                    matchIndexes[mi] = xi;
	                    matchFlags[xi] = true;
	                    matches++;
	                    break;
	                }
	            }
	        }
	        char[] ms1 = new char[matches];
	        char[] ms2 = new char[matches];
	        for (int i = 0, si = 0; i < min.length(); i++) {
	            if (matchIndexes[i] != -1) {
	                ms1[si] = min.charAt(i);
	                si++;
	            }
	        }
	        for (int i = 0, si = 0; i < max.length(); i++) {
	            if (matchFlags[i]) {
	                ms2[si] = max.charAt(i);
	                si++;
	            }
	        }
	        int transpositions = 0;
	        for (int mi = 0; mi < ms1.length; mi++) {
	            if (ms1[mi] != ms2[mi]) {
	                transpositions++;
	            }
	        }
	        int prefix = 0;
	        for (int mi = 0; mi < min.length(); mi++) {
	            if (first.charAt(mi) == second.charAt(mi)) {
	                prefix++;
	            } else {
	                break;
	            }
	        }
	        return new int[] { matches, transpositions / 2, prefix, max.length() };
	    }
}
