// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.inGameHelpAPI;

import org.terasology.engine.entitySystem.prefab.Prefab;
import org.terasology.inGameHelpAPI.components.HelpItem;

/**
 * Interface for dealing with the prefabs for the items. Contains all known items with the help item component.
 */
public interface ItemsCategoryInGameHelpRegistry {

    /**
     * Adds a Prefab and a variable amount of {@link org.terasology.inGameHelpAPI.components.HelpItem}s that are
     * associated with the prefab.
     *
     * @param prefab the prefab to add.
     * @param helpItems the help items that are associated with the prefab.
     */
    void addKnownPrefab(Prefab prefab, HelpItem... helpItems);

    /**
     * @return an Iterable containing the Prefabs.
     */
    Iterable<Prefab> getKnownPrefabs();

    /**
     * Gets all the help items for the prefab.
     *
     * @param prefab the prefab to get the help items for.
     * @return an Iterable containing the help items for the prefab.
     */
    Iterable<HelpItem> getHelpItems(Prefab prefab);
}
