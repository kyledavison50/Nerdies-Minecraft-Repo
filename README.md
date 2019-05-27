# Getting Started

1) Install git: https://git-scm.com/
2) Install IntelliJ Community Edition: https://www.jetbrains.com/idea/
3) Launch IntelliJ, and click ***Configure, Plugins, Browse Repositories***. Search for
   *Minecraft*, and install the Minecraft Plugin.
4) Restart IntelliJ, and click "Import from Version Control"
5) Put https://github.com/gurutwit/GearMod.git and start it.

Ok, at this point you have the code downloaded, the program to write code with, and git,  
which, for now, is going to help facilitate collaboration.

Now, we need to get you up and running. Do the following to test that the mod is loading  
into the game

1) On the right side of IntelliJ, click ***Gradle***.
2) Click the little Elephant, and type these commands into ***command line***, 
one after the other:  
    *setupDecompWorkspace*  
    *genIntellijRuns*
3) On the top right, select ***Minecraft Client***, then hit the green play button.

Go into creative mode and check that there is a tab with a copper ingot on it. If everything
works up to this point then you are good to go.

# Adding Items
1) Create your item in com.daniel.minecraft.nerdiesmod.items by right-clicking and selecting
***New, Kotlin File/Class***
1) Register your item in ***ModItems.kt***
2) Place your 16x16 texture in ***resources/assets/nerdiesmod/textures/items***
3) Create a JSON for the texture in ***resources/assets/nerdiesmod/models/item***(copying and pasting with slight modification is ok)
4) Configure the translation key in ***resources/assets/nerdiesmod/lang/en_US.lang***

# Adding Blocks
TODO  

# Potentially Useful Links
Minecraft Forge Documentation  
https://mcforge.readthedocs.io/en/latest/

Kotlin(Click ***Try Online, Koans***)  
https://kotlinlang.org/

Pixilart(For texturing)
https://www.pixilart.com/