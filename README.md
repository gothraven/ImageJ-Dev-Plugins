# Setup for writing ImageJ Plugins with IntelliJ
This repo contains a minimal setup for writing ImageJ (1) plugins with the [IntelliJ](https://www.jetbrains.com/idea/).
The projects are set up with ``<project-root>/plugins/`` as the default output folder (for generated ``.class`` files).

## Setup
Fork and Clone or this repository. It contains a self-contained project for IntelliJ.

Start the **IntelliJ IDEA** and use ``Open`` in the *Welcome screen* to navigate to the ``ImageJ-Dev-Plugins/`` folder or your chosen name.
Editing and saving plugin source files should update the associated class files (in ``plugins/``) automatically.

## Starting ImageJ
The ImageJ runtime can be launched in various ways:
- **Windows**: Execute ``ImageJ.exe`` (by double-clicking on the file).
When ImageJ starts up, it may ask for the ``javaw.exe`` executable, typically located in ``C:\Program Files\java\jre1.8xxx\bin\``. In case of problems, simply delete the ``ImageJ.cfg`` file and start a new.
- **MacOS**: Launch ``ij.jar``.

The entire ImageJ functionality is contained in the single archive ``ij.jar``. To **update** to the most recent version, simply select ``Help`` -> ``Update ImageJ...`` from the ImageJ main menu.

## Adding/editing your plugin code
Code for ImageJ plugins is contained in the ``<project-root>/src-plugins/`` directory. Plugins may be contained in Java packages (such as ``my_plugins`` in this example). **Note** that packages with plugins may only be **one level deep**, otherwise ImageJ will not find them! It is recommended to use at least one underscore (``_``) in a plugin name to make ImageJ automatically install the plugin into the ``Plugins`` menu at startup.

## Executing plugins
Add new run configuration on the ``Edit Configurations``, after click on ``+`` and choose a ``JAR Application``
```
Name: ImageJ
Path to Jar: select the path to ij.jar file.
```
Apply changes, OK, then you can launch your application.

At startup, ImageJ automatically installs existing plugins (under the above conditions) into the ``Plugins`` menu. To execute, simply select the listed plugin from the menu.

When the plugin's source code is **edited** in the IDE, the associated ``.class`` file in ``plugins/`` is updated by IntelliJ, but **not** automatically reloaded by the ImageJ runtime. To **exectute an edited plugin** in ImageJ, use ``Plugins`` -> ``Compile and Run...`` and select the associated ``.class`` file (no compiler is needed).


## Additional ImageJ resources

- [ImageJ Home](https://imagej.nih.gov/ij/index.html)
- [ImageJ Plugins](http://rsbweb.nih.gov/ij/plugins/index.html)
- [ImageJ API (JavaDoc)](http://rsbweb.nih.gov/ij/developer/api/index.html)
