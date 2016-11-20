package cz.smonty.service;

import java.util.LinkedList;
import java.util.List;

import cz.smonty.model.Document;
import cz.smonty.model.Type;

public class MySearchEngine implements SearchEngine {

	public List<Document> findByType(Type documentType) {
		List<Document> result = new LinkedList<Document>();
		
		for (Document document : storage()) {
			if (document.getType().getName().equals(
					documentType.getName())) {
				result.add(document);
			}
		}
		
		return result;
	}

	public List<Document> listAll() {
		return storage();
	}
	
	private List<Document> storage() {
		List<Document> allDocuments = new LinkedList<Document>();
		
		Type type = new Type();
		type.setName("PDF");
		type.setDescription("Portable Document Format");
		type.setExtension(".pdf");
		
		Document document = new Document();
		document.setName("nejaky pdf");
		document.setLocation("na disku");
		document.setType(type);
		
		allDocuments.add(document);
		
		return allDocuments;
	}

}
