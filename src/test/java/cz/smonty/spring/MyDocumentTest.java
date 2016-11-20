package cz.smonty.spring;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import cz.smonty.model.Type;
import cz.smonty.model.Document;
import cz.smonty.service.MySearchEngine;

public class MyDocumentTest {

	private MySearchEngine engine = new MySearchEngine();
	
	@Test
	public void testFindByType() {
		Type type = new Type();
		type.setName("PDF");
		type.setDescription("Portable Document Format");
		type.setExtension(".pdf");
		
		List<Document> pdfDocuments = engine.findByType(type);
		
		assertTrue(pdfDocuments.size() == 1);
	}
	
}
