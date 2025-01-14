# Meteor-225

A Kotlin/Compose client built around [Lost-City/Client](https://github.com/2004Scape/Client)  
[Android port](https://github.com/zeruth/meteor-android)  

Windows:  
![image](https://github.com/user-attachments/assets/0300fa0d-4194-49ca-87d7-086ed3347661)

Ubuntu:
![image](https://github.com/user-attachments/assets/c3fa102a-bd28-4770-b50e-48726df2b88f)

Enhancements are nice, but I intend to respect the experience, and the developers of Lost-City.  
    
```
Forbidden features (unless otherwise permitted by Lost-City):  
    artificial input of any kind  
    camera zoom / middle mouse rotate  
    menu entry swapping (including changing menu entry text)
    overlays of any kind over the game
    visual game state tracking in UI form be it swing or compose

    Per Pazaz:
    "in general: don’t give yourself an advantage that forces a new meta on the community.
        The original experience should be a viable option for people to play with"

    Per Zeruth:
    "We will absolutely be respecting the project here, if things change regarding content
        that is forbidden or not, it will be reflected here."
```

```
Kotlin/Compose framework:
    client module is entirely Kotlin, and entirely Compose - No Java / Swing in the frontend
    Many systems improved / modernized to benefit from this
```
  
Depends on the following sub-projects:  
[Annotations](https://www.github.com/zeruth/annotations)  runelite deobfuscation/mixin annotations  
[Eventbus](https://www.github.com/zeruth/eventbus)  kotlin coroutines based eventbus  
[Logger](https://www.github.com/zeruth/logger)  pretty logger  
  
* `/client` pure kotlin / compose 3pc
* `/rs2` aka deob aka 2004Scape Client aka Client1 aka vanilla
  
# 2004Scape Client

Status: **Completely renamed!** There's no obfuscation or unnamed classes/methods/fields/variables left.

The TeaVM webclient is in the `webclient` branch until it can be made compatible with this new branch: see https://github.com/2004scape/Client/tree/webclient

## Sources

Thanks to these individuals' projects for shedding light on some things - this would've taken a lot longer to complete without their efforts.

* [Dane's 317 refactor](https://github.com/thedaneeffect/RuneScape-317)
* [Dane's 186 refactor](https://github.com/thedaneeffect/RuneScape-Beta-Public)
* [James Monger's 317 refactor](https://github.com/Jameskmonger/317refactor)
