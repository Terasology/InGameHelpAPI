// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.inGameHelpAPI.event;

import org.terasology.engine.entitySystem.event.Event;
import org.terasology.inGameHelpAPI.systems.HelpCategory;

/**
 * Event that is sent to the entity whenever a new HelpCategory is added. Contains the specific help category that was
 * added.
 */
public class OnAddNewCategoryEvent implements Event {
    /**
     * Category to be stored in this event.
     */
    private final HelpCategory category;

    /**
     * Creates a new instance of this event with the given HelpCategory.
     *
     * @param category The HelpCategory instance.
     */
    public OnAddNewCategoryEvent(HelpCategory category) {
        this.category = category;
    }

    /**
     * Gets the category contained this event.
     *
     * @return The category.
     */
    public HelpCategory getCategory() {
        return category;
    }
}
