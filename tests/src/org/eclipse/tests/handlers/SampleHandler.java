package org.eclipse.tests.handlers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
//import test.src.test.*;
//import test.*;
//import edu.stanford.nlp.tagger.maxent.*;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import org.eclipse.jface.dialogs.MessageDialog;

public class SampleHandler extends AbstractHandler {
	public String xt(String s) {
		
			
			try {
			   	URL oracle = new URL("https://lov.linkeddata.es/dataset/lov/api/v2/term/search?q=Person&type=class");
			   	HttpURLConnection con = (HttpURLConnection) oracle.openConnection();
			   	con.setRequestMethod("GET");
			    BufferedReader in = new BufferedReader(
			            new InputStreamReader(oracle.openStream()));

			            String inputLine;
			            while ((inputLine = in.readLine()) != null)
			                System.out.println(inputLine);
			            in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			return "You can us the following Vocabularies";
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Tests",
				xt("Pramit"));
		return null;
	}
}
