package com.example.jpa.demojpa;

import com.example.jpa.demojpa.model.Publication;
import com.example.jpa.demojpa.repository.IPublicationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemojpaApplicationTests {

	@Autowired
	IPublicationRepository publicationRepository;

	@Test
	void database_insert_test() {
		//données
		var publication = Publication.builder()
										.titre("titre 1")
										.auteur("toto")
										.build();
		//execution
		publicationRepository.save(publication);

		//reuperation publication
		var resultatpublication = publicationRepository.findById(1);

		//test
		Assertions.assertTrue(resultatpublication.isPresent());
		Assertions.assertEquals(publication.getAuteur(),resultatpublication.get().getAuteur());
		Assertions.assertEquals(publication.getTitre(),resultatpublication.get().getTitre());
	}

}
