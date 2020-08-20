// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.inGameHelpAPI.ui;

import org.joml.Rectanglei;
import org.terasology.nui.Canvas;
import org.terasology.nui.UIWidget;
import org.terasology.rendering.nui.widgets.browser.data.basic.flow.FlowRenderable;
import org.terasology.rendering.nui.widgets.browser.ui.style.TextRenderStyle;

/**
 * Class that contains information about rendering the widget.
 */
public class WidgetFlowRenderable implements FlowRenderable<WidgetFlowRenderable> {
    /** The widget to render. */
    UIWidget widget;
    
    /** The width. */
    private int width;

    /** The height. */
    private int height;

    /** The link to the document. */
    private String hyperlink;

    /**
     * Constructor for this class
     *
     * @param widget the widget of the renderable
     * @param width the width of the renderable
     * @param height the height of the renderable
     * @param hyperlink the link to the document
     */
    public WidgetFlowRenderable(UIWidget widget,
                                int width, int height, String hyperlink) {
        this.widget = widget;
        this.width = width;
        this.height = height;
        this.hyperlink = hyperlink;
    }

    /**
     * Draws the widget on the canvas.
     *
     * @param canvas the canvas to draw on
     * @param bounds the area to draw on
     * @param defaultRenderStyle the rendering style
     */
    @Override
    public void render(Canvas canvas, Rectanglei bounds, TextRenderStyle defaultRenderStyle) {
        canvas.drawWidget(widget, bounds);
    }

    /**
     * @return the width.
     */
    @Override
    public int getMinWidth(TextRenderStyle defaultRenderStyle) {
        return width;
    }

    /**
     * @return the width.
     */
    @Override
    public int getWidth(TextRenderStyle defaultRenderStyle) {
        return width;
    }

    /**
     * @return the height.
     */
    @Override
    public int getHeight(TextRenderStyle defaultRenderStyle) {
        return height;
    }

    /**
     * @return the link to the document.
     */
    @Override
    public String getAction() {
        return hyperlink;
    }

    /**
     * Splits the renderable at splitResultWidth.
     *
     * @param defaultRenderStyle the rendering style for text.
     * @param splitResultWidth the width to split at.
     */
    @Override
    public SplitResult<WidgetFlowRenderable> splitAt(TextRenderStyle defaultRenderStyle, int splitResultWidth) {
        if (splitResultWidth < width) {
            return new SplitResult<>(null, this);
        } else {
            return new SplitResult<>(this, null);
        }
    }
}
