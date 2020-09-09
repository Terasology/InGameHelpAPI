// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.inGameHelpAPI.ui;

import org.terasology.engine.rendering.assets.font.Font;
import org.terasology.engine.rendering.nui.widgets.browser.ui.style.ContainerInteger;
import org.terasology.engine.rendering.nui.widgets.browser.ui.style.FixedContainerInteger;
import org.terasology.engine.rendering.nui.widgets.browser.ui.style.ParagraphRenderStyle;
import org.terasology.engine.utilities.Assets;

/**
 * The text rendering style for titles.
 */
public class DefaultTitleParagraphStyle implements ParagraphRenderStyle {

    /**
     * Gets the title font
     *
     * @param hyperlink this parameter is not used.
     * @return the title font.
     */
    @Override
    public Font getFont(boolean hyperlink) {
        return Assets.getFont("engine:NotoSans-Regular-Title").get();
    }

    /**
     * Gets the amount of padding on top of the paragraph.
     *
     * @return a container integer of value 10.
     */
    @Override
    public ContainerInteger getParagraphPaddingTop() {
        return new FixedContainerInteger(10);
    }
}
