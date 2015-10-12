/* Reads an html file from the web into XHTML and displays */

package web.reader;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

/** Note: robust HTML parser -- parses HTML into XHTML **/
import org.cyberneko.html.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import util.XMLUtils;

public class WebPageReader {

	Document _rssDoc = null;
	XPath    _xpath = XPathFactory.newInstance().newXPath();
	
	public WebPageReader(String url) throws Exception {
        /**
         * Parse the input url
         */
        DOMParser parser = new DOMParser();
        InputStream byteStream = util.InputStreamLoader.OpenStream(url);
        parser.parse(new org.xml.sax.InputSource(byteStream));
        _rssDoc = parser.getDocument();
	}
	
	public void displayXMLContent() {
		XMLUtils.PrintNode(_rssDoc);
	}
	
	public ArrayList<String> getXPathQueryResults(String query) {
		
		ArrayList<String> results = new ArrayList<String>();
		
		NodeList nodes = (NodeList)XMLUtils.XPathQuery(_xpath, _rssDoc, 
				query /* TODO: XPath query */, 
				false /* don't return just a single item */);
		for (int i = 0; i < nodes.getLength(); i++) {
			//String node_value = nodes.item(i).getNodeValue();
			//String text_content = nodes.item(i).getTextContent();
		    //System.out.println(node_value + ": " + text_content);
			results.add(nodes.item(i).getTextContent());
		}
		
		return results;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String url = "http://www.smh.com.au/lifestyle/lifematters/agedcare-revolution-20110808-1ijbu.html";
		if(args.length >= 1) {
			url = args[0];
		} 

		// Read stream from http using robust html -> XHTML parser and display
		WebPageReader web_xml = new WebPageReader(url);
		web_xml.displayXMLContent();
	}

}
