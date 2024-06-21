# Meteor-225

A Kotlin/Compose client built around [Lost-City/Client](https://github.com/2004Scape/Client)

![image](https://github.com/zeruth/Meteor/assets/2943260/c0bfa14f-25c8-4c77-9177-b3d543098548)

Enhancements are nice, but I intend to respect the experience, and the developers of Lost-City.  
    
```
Forbidden features (unless otherwise permitted by Lost-City):  
    artificial input of any kind  
    pvp context-aware content (ie. effect timers, hiding friends, etc)
    camera zoom / middle mouse rotate  
    menu entry swapping (including changing menu entry text)
    overlays alerting when to move / pray etc

    Per Pazaz:
    "in general: don’t give yourself an advantage that forces a new meta on the community.
        The original experience should be a viable option for people to play with"
```

```
Improved RuneLite Injector  
    Inject to deob instead of vanilla, great for debugging
Kotlin/Compose framework:
    Entire client is now kotlin only
    Many systems improved / modernized to benefit from Kotlin
Compose only UI/Overlays:
    Game image is drawn to the compose backed swing panel but that is it for swing
    Overlays are native resolution regardless of rs stretching
    Overlays are rendered on compose UI thread, client thread won't starve because of drawing 
```
  
Depends on the following sub-projects:  
[Annotations](https://www.github.com/zeruth/annotations)  runelite deobfuscation/mixin annotations  
[Eventbus](https://www.github.com/zeruth/eventbus)  kotlin coroutines based eventbus  
[Injector](https://www.github.com/zeruth/injector)  packs `api`/`api-rs`/`mixins` into `rs2`  
[Logger](https://www.github.com/zeruth/logger)  pretty logger  
  
* `/api` restricted-level interfaces to client members
* `/api-rs` unrestricted-level interfaces to client members
* `/client` pure kotlin / compose 3pc
* `/mixins` code to be packed/modified in `rs2`
* `/rs2` aka deob aka 2004Scape Client aka Client1 aka vanilla

The injector has a handful of improvements over RuneLite/OpenOSRSs releases.
```
-targets rs2 instead of mapping against vanilla jar  
  (changes made in rs2 are injected on build)
  (rs2 is debuggable with breakpoints etc after injection)  
-can handle targets with packages  
-various bytecode fixes  
-virtually annotate members 
  (no need to annotate anything in rs2)  
```
  
# 2004Scape Client

Status: **Completely renamed!** There's no obfuscation or unnamed classes/methods/fields/variables left.

The TeaVM webclient is in the `webclient` branch until it can be made compatible with this new branch: see https://github.com/2004scape/Client/tree/webclient

## Sources

Thanks to these individuals' projects for shedding light on some things - this would've taken a lot longer to complete without their efforts.

* [Dane's 317 refactor](https://github.com/thedaneeffect/RuneScape-317)
* [Dane's 186 refactor](https://github.com/thedaneeffect/RuneScape-Beta-Public)
* [James Monger's 317 refactor](https://github.com/Jameskmonger/317refactor)
