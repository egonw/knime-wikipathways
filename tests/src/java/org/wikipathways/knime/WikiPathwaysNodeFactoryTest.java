package org.wikipathways.knime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.wikipathways.knime.WikiPathwaysNodeFactory;

public class WikiPathwaysNodeFactoryTest {
	
	@Test
    public void testGetNrNodeViews() {
		WikiPathwaysNodeFactory factory = new WikiPathwaysNodeFactory();
		
		int nrviews = factory.getNrNodeViews();
		
		assertEquals(1, nrviews);
	}
}