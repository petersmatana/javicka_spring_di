package cz.smonty.data;

import cz.smonty.model.Document;

public class DocumentRepository implements DocumentDAO {

	private Document doc1;
	private Document doc2;

	public DocumentRepository() {

	}

	public DocumentRepository(Document doc1, Document doc2) {
		super();
		this.doc1 = doc1;
		this.doc2 = doc2;
	}

	public Document getDoc1() {
		return doc1;
	}

	public void setDoc1(Document doc1) {
		this.doc1 = doc1;
	}

	public Document getDoc2() {
		return doc2;
	}

	public void setDoc2(Document doc2) {
		this.doc2 = doc2;
	}

	public Document[] getAll() {
		return null;
	}

}
