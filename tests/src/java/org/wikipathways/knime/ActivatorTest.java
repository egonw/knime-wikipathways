package org.wikipathways.knime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ActivatorTest {

    @Test
    public void veryStupidTest() {
        assertEquals("org.wikipathways.knime.plugin", Activator.PLUGIN_ID);
    }
}
