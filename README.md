# Meteor

A Kotlin/Compose client built around Client1

The goal is to eventually offer a truly cross-platform client with a modern touch.  
Some enhancements are nice, but I intend to respect the experience.  
    
It currently offers:  
GPU upscaling / texture filtering via OpenCV  
Stretch to fit / fill  
  
* `/composeApp` 
  - `commonMain` where most ui code / non-jvm code should go eventually  
    `desktopMain` where all code currently resides. aka jvmMain  
  
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
