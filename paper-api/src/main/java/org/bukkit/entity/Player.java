
package org.bukkit.entity;

import java.net.InetSocketAddress;

/**
 * Represents a player, connected or not
 * 
 */
public interface Player extends HumanEntity {
    /**
     * Checks if this player is currently online
     *
     * @return true if they are online
     */
    public boolean isOnline();

    /**
     * Checks if this player is currently op
     *
     * @return true if they are online
     */
    public boolean isOp();

    /**
     * Sends this player a message, which will be displayed in their chat
     *
     * @param message Message to be displayed
     */
    public void sendMessage(String message);

    /**
     * Gets the "friendly" name to display of this player. This may include color.
     *
     * Note that this name will not be displayed in game, only in chat and places
     * defined by plugins
     *
     * @return String containing a color formatted name to display for this player
     */
    public String getDisplayName();

    /**
     * Sets the "friendly" name to display of this player. This may include color.
     *
     * Note that this name will not be displayed in game, only in chat and places
     * defined by plugins
     *
     * @return String containing a color formatted name to display for this player
     */
    public void setDisplayName(String name);
    
    /**
     * Gets the socket address of this player
     * @return the player's address
     */
    public InetSocketAddress getAddress();

    /**
     * Kicks player with custom kick message.
     *
     * @return
     */
    public void kickPlayer(String message);
}
