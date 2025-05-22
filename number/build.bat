@echo off
rd /s /q lib
mkdir lib
xcopy /s /q src lib
cd lib
javac number\*.java
del number\*.java
jar cvf number-set.jar number
rd /s /q number
cd..
