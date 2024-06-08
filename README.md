# Meteor

A Kotlin/Compose client built around Client1

The goal is to eventually offer a truly cross-platform client with a modern touch.  
Enhancements are nice, but I intend to respect the experience, and the developers of the project.  
    
It currently offers:  
RuneLite injection  
OpenCV GPU upscaling  
Kotlin/Compose framework

Depends on the following sub-projects:  
[Annotations](https://www.github.com/zeruth/annotations)  
[Eventbus](https://www.github.com/zeruth/eventbus)  
[Injector](https://www.github.com/zeruth/injector)  
[Logger](https://www.github.com/zeruth/logger)  
  
* `/api` restricted-level interfaces to client members
* `/api-rs` unrestricted-level interfaces to client members
* `/client` pure kotlin / compose 3pc
* `/injector` packs `api`/`api-rs`/`mixins` into `rs2`
* `/mixins` code to be packed/modified in `rs2`
* `/rs2` aka deob aka 2004Scape Client aka Client1 aka vanilla
  
Other platforms are not yet started  
  
Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

# 2004Scape Client

Status: **Completely renamed!** There's no obfuscation or unnamed classes/methods/fields/variables left.

The TeaVM webclient is in the `webclient` branch until it can be made compatible with this new branch: see https://github.com/2004scape/Client/tree/webclient

## Sources

Thanks to these individuals' projects for shedding light on some things - this would've taken a lot longer to complete without their efforts.

* [Dane's 317 refactor](https://github.com/thedaneeffect/RuneScape-317)
* [Dane's 186 refactor](https://github.com/thedaneeffect/RuneScape-Beta-Public)
* [James Monger's 317 refactor](https://github.com/Jameskmonger/317refactor)
