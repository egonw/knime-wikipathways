package org.wikipathways.knime;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "WikiPathways" Node.
 * 
 *
 * @author Egon Willighagen
 */
public class WikiPathwaysNodeFactory 
        extends NodeFactory<WikiPathwaysNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public WikiPathwaysNodeModel createNodeModel() {
        return new WikiPathwaysNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<WikiPathwaysNodeModel> createNodeView(final int viewIndex,
            final WikiPathwaysNodeModel nodeModel) {
        return new WikiPathwaysNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new WikiPathwaysNodeDialog();
    }

}

