# Meteor-225

A Kotlin/Compose client built around [Lost-City/Client](https://github.com/2004Scape/Client)

Enhancements are nice, but I intend to respect the experience, and the developers of the Lost-City.  
    
It currently offers:  
RuneLite injection  
Kotlin/Compose framework  

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
