package pl.wwsis.zpp.blog.model;

import static org.junit.Assert.*;

import org.junit.Test;


public class PostTest {

	Post p = new Post("testowy tytul", "testowa tresc");
	
	@Test
	public void newPostShouldHaveEmptyListOfComments() {
		assertNotNull(p.getComments());
		assertEquals(0, p.getComments().size());
	}
	
	@Test
	public void newPostShouldHaveDateSet() {
		assertNotNull(p.getDate());
	}
	
	@Test
	public void addComment_shouldLinkCommentToThePost() {
		Comment comment = new Comment("tester", "testowy komentarz");
		p.addComment(comment);
		
		assertEquals(1, p.getComments().size());
		assertTrue(p.getComments().contains(comment));
	}
}
