package cz.smonty.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cz.smonty.data.DocumentRepository;

public class DocumentRepositoryTest {

	private ClassPathXmlApplicationContext context;
	
	@Before
	public void init() {
		this.context = new ClassPathXmlApplicationContext("DocumentRepositoryContext.xml");
	}
	
	@Test
	public void testDocumentRepositoryContainsDocuments() {
		DocumentRepository documentRepository = this.context.getBean(DocumentRepository.class);
		
		assertNotNull(documentRepository.getDoc1());
		assertNotNull(documentRepository.getDoc2());
	}
	
}
