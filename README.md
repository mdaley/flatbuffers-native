# FLATBUFFERS NATIVE

## Setting up to remote build on OSX

To build on OSX, you need to have a separate OSX installation as it can't be run in docker. The installation needs to be
set uo to have the following installed:

- git
- make
- cmake
- the C++ toolchain for OSX

Most of these can be installed by installing XCode or just the XCode command line tools - run `xcode-select --install` at a command prompt. `cmake` can be installed via brew. For detailed instructions search the internet...

The scripts for building on osx use `ssh`. You will need to ensure that password-less ssh will work between the build machine and the OSX machine. Make sure you have a SSH key and copy it to the OSX machine using `ssh-copy-id`.

## Setting up to remote build on Windows

If you can get this to work please tell me!
