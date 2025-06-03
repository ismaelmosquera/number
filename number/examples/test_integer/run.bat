@echo off
cls
cd bin
java -ea -cp .;..\..\..\lib\number-set.jar TestInteger > out.txt
