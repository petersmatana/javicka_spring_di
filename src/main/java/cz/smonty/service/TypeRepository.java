package cz.smonty.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import cz.smonty.model.Type;

@Repository("typeManager")
public class TypeRepository implements TypeManagerInterface {

	public List<Type> getAllTypes() {
		return null;
	}

}
