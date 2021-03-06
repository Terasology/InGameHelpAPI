// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.inGameHelpAPI.components;

import com.google.common.collect.Lists;
import org.terasology.engine.rendering.nui.widgets.browser.data.ParagraphData;
import org.terasology.engine.rendering.nui.widgets.browser.data.basic.HTMLLikeParser;
import org.terasology.engine.rendering.nui.widgets.browser.data.html.HTMLDocument;
import org.terasology.inGameHelpAPI.ui.DefaultTitleParagraphStyle;

import java.util.Collection;
import java.util.List;

/**
 * Interface that defines the composition of a help item. This is composed of a title, category, and paragraphs of the
 * description of this help item.
 */
public interface HelpItem {

    /**
     * @return the title of this HelpItem.
     */
    String getTitle();

    /**
     * @return the category of this HelpItem.
     */
    String getCategory();

    /**
     * @return the description of this HelpItem.
     */
    Iterable<ParagraphData> getParagraphs();

    /**
     * Adds help information to the document.
     *
     * @param documentData the document that is modified by adding help information.
     * @deprecated use {@link #getHelpSection()} directly with {@link HTMLDocument#addParagraphs(Collection)} instead
     */
    @Deprecated
    default void addHelpItemSection(HTMLDocument documentData) {
        documentData.addParagraph(HTMLLikeParser.parseHTMLLikeParagraph(new DefaultTitleParagraphStyle(), getTitle()));
        for (ParagraphData paragraph : getParagraphs()) {
            documentData.addParagraph(paragraph);
        }
    }

    /**
     * The help section for this item in paragraphs. The first paragraph should hold a title or heading.
     *
     * @return a list of paragraphs for the comple help section for this item; first paragraph is a title
     */
    default List<ParagraphData> getHelpSection() {
        ParagraphData title = HTMLLikeParser.parseHTMLLikeParagraph(new DefaultTitleParagraphStyle(), getTitle());

        List<ParagraphData> result = Lists.newArrayList(title);
        getParagraphs().forEach(result::add);
        return result;
    }
}
