@echo off
cls
cd bin
java -ea -cp .;..\..\..\lib\number-set.jar TestRational > out.txt
