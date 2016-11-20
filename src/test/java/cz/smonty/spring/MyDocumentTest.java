package cz.smonty.spring;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cz.smonty.model.Type;
import cz.smonty.model.Document;
import cz.smonty.service.MySearchEngine;
import cz.smonty.service.SearchEngine;

public class MyDocumentTest {

	private SearchEngine engine;
	private ClassPathXmlApplicationContext context;
	private Type documentType;
	
	@Before
	public void init() {
		// /home/smonty/Documents/sprint/SpringExamples/src/main/java/cz/smonty/service/
		context = new ClassPathXmlApplicationContext("BeanConf.xml");
		engine = context.getBean(SearchEngine.class);
		documentType = context.getBean(Type.class);
	}
	
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
