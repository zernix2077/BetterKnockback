# Better Knockback

Plugin to make knockback on Allay feel more PocketMine–like.

In vanilla Minecraft (and Allay), punching a player during a jump sends them far too high into the air, while punching a player as they’re falling lifts them by too small an amount (pvp combos almost impossible). This happens because knockback is applied to the player’s current motion vector: a punch during a jump sets the Y motion to 0.42 + 0.4 = 0.92, while during a PvP-like fall it becomes -0.2 + 0.4 = 0.2.

This plugin resolves the issue in the same way PocketMine-MP does: previous motion is not taken into account when applying knockback, and the player always receives the exact same vertical elevation and horizontal amplitude.

# Install

- Download .jar file from releases
- Put it into ./plugins folder
- Restart the server
- Enjoy!

