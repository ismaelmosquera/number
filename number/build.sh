#
# Simple script to build number-set.jar
#
rm -r lib
mkdir lib
cp -r src/number lib
cd lib
javac number/*.java
rm number/*.java
jar cvf number-set.jar number
rm -r number
cd ..
