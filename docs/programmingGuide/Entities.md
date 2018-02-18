# Entities
Entities are the main building block of the vNES programming language.
An entity is made of the following things:
* Mandetory properies. without these your program will not compile.
* Optional properties. These are not mandetory for program compilation.
* Custom properties. You can see these as global variables in a class. They can be referenced by child entities.
* Child entities. every entity can have multiple child entities.

## Entity types
vNES knows the following entity types:
### Data Entities
A data entity can contain both data and functional properties and usualy maps to a NES feature.
Examples of data entities are:
* SCREEN
* SOUND
* MUSIC
* SPRITE

#### Creating a new instance of a data Entity
Use the following sytax to create a new data entity:
````
DEF <entity type>: <entity name>
    <entity properties / child entities>
END <entity type>
````
For example, to create a new screen entity:
````
DEF SCREEN: splashScreen
    ...
END SCREEN
````

### Functional Entities
Functional entities are used to explicitly define behaviour.
It's impossible to create a new Functional Entity instance. (they behave like static classes)
#### Calling a function of a functional entity
Use the following syntax to to call a function defined by a functional entity:
````
<entity name>.<function name wityh optional arguments>
````
for example:
````
# sound is a variable of type SOUND
vNES-SOUND.PlaySound(sound)
````
It's also possible to have a functional entity within another functional entity:
````
#color is a variable of type COLOR
VNES-GRAPHICS.SCREEN.Clear(color)
````
> Hint: All functional entities of the vNES standard library start with 'VNES-'

## Defining new entities
### Defining new data entities
With the following sytax you can define your own data entities:
````
# custom data entity names should allways be ALL CAPS and should never start with 'VNES-'
DEF ENTITY: <entity name>
    ...
END ENTITY
````

### Defining new functional entities
With the following sytax you can define your own functional entities:
````
# custom functional entity names should allways be ALL CAPS and should never start with 'VNES-'
DEF FUNCTIONAL ENTITY: <entity name>
    ...
END ENTITY
````
> Hint: Functional entities may only contain FUNCTION child entities and no properties.
