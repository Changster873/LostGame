# Models

## Version 1.0

Basic setup with minimal features for each model.

### Player : Model
The Player model is what the users control to immerse themselves
in this gaming experience. These are the properties of the model:
- name: String = name of the player
- level: int = level of the player within the game
- inventory: List<T\> = the items the player can carry with them

### Item : Interface
Objects that players can interact with in the game are classified as
items. To qualify as an item, here are what it should have:
- weight: int = an item has a weight when picked up by the player
- space: int = takes up how much space when picked up by player

### Weapon : Model
A weapon is what the player uses to attack enemies.
Defined in WeaponType enum and damage dealt is based on the below
formula:

damage = (order in the enum list + 1) * 10