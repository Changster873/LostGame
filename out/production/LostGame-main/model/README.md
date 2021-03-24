# Models

## Version 1.0

Basic setup with minimal features for each model.

### Player : Model
The Player model is what the users control to immerse themselves
in this gaming experience. These are the properties of the model:
- name: String = name of the player
- level: int = level of the player within the game
- talent: Talent = Special Talent player chose to play game with
- inventory: List<Item\> = the items the player can carry with them

### Item : Interface
Objects that players can interact with in the game are classified as
items. To qualify as an item, here are what it should have:
- weight: int = an item has a weight when picked up by the player
- space: int = takes up how much space when picked up by player

### Talent : Interface
This is the special skill that the player chooses at the beginning
of the game to proceed playing with. Each Talent has two properties:
- weakAgainst : CombatType = which Talent this is weak against
- strongAgainst : CombatType = which Talent this is strong against

### Physical, Telekinetic, Elemental : ***implements*** Talent
These are the types of talents that exist in the game. They come
with their own strengths and weaknesses (see onboarding doc for
rules).
- combatType: CombatType = to know what AttackRange and TalentType
this Talent is
  
### AttackRange : Enum
Range of the attack.
- SHORT
- LONG

### TalentType : Enum
Talent has 3 types.
- Physical
- Telekinetic
- Elemental

### CombatType : Model
CombatType is a model that holds info on both AttackRange and TalentType.
Best used to be assigned to Weapons that are able to be picked up by
the player.
- attackRange: AttackRange = short or long
- talentType: TalentType = which of the 3 talents this is

### Weapon : Model
