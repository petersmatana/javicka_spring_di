package cz.smonty.service;

import java.util.List;

import cz.smonty.model.Document;
import cz.smonty.model.Type;

public interface SearchEngine {

	public List<Document> findByType(Type documentType);

	public List<Document> listAll();
}
