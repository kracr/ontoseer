package edu.stanford.bmir.protege.examples.view;

import java.util.Scanner;

public class indices {
	public void indexing(String sc) {

		System.out.println(sc+"Files indexed. Please use OntoSeer.");
	}

	public static void main(String[] args) {
		String str=null;
		InvertedIndex i= new InvertedIndex();
		i.main(args);

	}

}
