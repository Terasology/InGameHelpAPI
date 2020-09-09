// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.inGameHelpAPI.systems;

import org.terasology.engine.rendering.nui.widgets.browser.data.DocumentData;
import org.terasology.inGameHelpAPI.ItemsCategoryInGameHelpRegistry;

/**
 * Interface that manages how a specific help tab will function.
 */
public interface HelpCategory {

    /**
     * Sets the registry.
     *
     * @param registry references an items category in the in game help registry.
     */
    void setRegistry(ItemsCategoryInGameHelpRegistry registry);

    /**
     * @return the name of the category.
     */
    String getCategoryName();

    /**
     * @return the document data for the particular category.
     */
    DocumentData getDocumentData();

    /**
     * Handles navigation between documents.
     *
     * @param hyperlink the link to the document.
     * @return True if the document that was linked exists. False if otherwise.
     */
    boolean handleNavigate(String hyperlink);

    /**
     * Resets the document, which takes the user back to the main help page.
     */
    void resetNavigation();
}
