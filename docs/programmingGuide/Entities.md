# Entities
Entities are the main building block of the vNES programming language.
An entity is made of the following things:
* Mandatory properties. without these your project will not compile.
* Optional properties. These are not mandatory for project compilation.


## Entity types
vNES knows the following entity types:
### Data Entities
A data entity can contain both data and functional properties and usually maps to a NES feature.
Examples of data entities are:
* SCREEN
* SOUND
* MUSIC
* SPRITE

#### Creating a new instance of a data Entity
Use the following sytax to create a new data entity:
````
DEF <entity type>: <entity name>
    <entity properties / functions>
END
````
For example, to create a new screen entity:
````
DEF SCREEN: splashScreen
    ...
END
````

## Defining new entities
### Defining new data entities
With the following sytax you can define your own data entities:
````
# custom data entity names should allways be ALL_CAPS.
DEF ENTITY: <entity name>
    ...
END
````