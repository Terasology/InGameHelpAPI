// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.inGameHelpAPI.components;

import com.google.common.collect.Lists;
import org.terasology.engine.entitySystem.Component;
import org.terasology.engine.rendering.nui.widgets.browser.data.ParagraphData;
import org.terasology.engine.rendering.nui.widgets.browser.data.basic.HTMLLikeParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Use this to add a subsection of help to an item.
 */
public class ItemHelpComponent implements Component, HelpItem {
    public String title = "About this item";                // Change this to display something else as the title.
    public String category = "Items";                       // What help category to place this item in.
    public List<String> paragraphText = new ArrayList<>();  // The description lines of this item.

    /**
     * @return the title of this help item.
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * @return the category of this help item.
     */
    @Override
    public String getCategory() {
        return category;
    }

    /**
     * Gets the description of this help item.
     *
     * @return an iterable of paragraph data about this help item that contains the description.
     */
    @Override
    public Iterable<ParagraphData> getParagraphs() {
        List<ParagraphData> result = Lists.newLinkedList();
        for (String paragraph : paragraphText) {
            result.add(HTMLLikeParser.parseHTMLLikeParagraph(null, paragraph));
        }
        return result;
    }
}
