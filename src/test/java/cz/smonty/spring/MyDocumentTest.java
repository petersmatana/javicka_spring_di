package cz.smonty.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cz.smonty.model.Type;
import cz.smonty.model.Document;
import cz.smonty.service.SearchEngine;

public class MyDocumentTest {

	private ClassPathXmlApplicationContext context;
	private SearchEngine engine;
	private Type documentType;
	
	@Before
	public void init() {
		this.context = new ClassPathXmlApplicationContext("MySearchEngineContext.xml");
		this.engine = context.getBean(SearchEngine.class);
		this.documentType = context.getBean(Type.class);
	}
	
	@Test
	public void testFindByType() {
		Type type = new Type();
		type.setName("PDF");
		type.setDescription("Portable Document Format");
		type.setExtension(".pdf");
		
		List<Document> pdfDocuments = engine.findByType(type);
		assertTrue(pdfDocuments.get(0).getName().equals("nejaky pdf"));
		
		assertEquals(pdfDocuments.size(), 1);
	}
	
}
