@echo off
cls
cd bin
java -ea -cp .;..\..\..\lib\number-set.jar TestNatural > out.txt
