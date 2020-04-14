# FLATBUFFERS NATIVE

Use gradle and docker to build flatbuffers executables and libraries for any linux platform plus OSX and Windows. Put the native
libraries into Jars so they can be puull into Java / JVM-language based projects. 

Have a JNI interface that allows use of the native-only capabilities of flatbuffers e.g. verifier, JSON-parsing, that aren't available
in the Java implementation.

!!WORK IN PROGRESS!!

So, far: 
- build docker containers
- run compile in those containers
- make incremental

Next:
- build jars
- build JNI interface
- build uberjar

## NOTES

### Setting up to remote build on OSX

To build on OSX, you need to have a separate OSX installation as it can't be run in docker. The installation needs to be
set uo to have the following installed:

- git
- make
- cmake
- the C++ toolchain for OSX

Most of these can be installed by installing XCode or just the XCode command line tools - run `xcode-select --install` at a command prompt. `cmake` can be installed via brew. For detailed instructions search the internet...

The scripts for building on osx use `ssh`. You will need to ensure that password-less ssh will work between the build machine and the OSX machine. Make sure you have a SSH key and copy it to the OSX machine using `ssh-copy-id`.

### Setting up to remote build on Windows

Hmmm ... not working so well!!
