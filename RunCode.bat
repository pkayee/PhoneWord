@echo off
setlocal

REM Get the directory where this bat file is located
set "ROOT_DIR=%~dp0"

REM Build path to jar relative to root
set "JAR_PATH=%ROOT_DIR%out\artifacts\PhoneWord_jar\PhoneWord.jar"

REM Change to root directory
cd /d "%ROOT_DIR%"

REM Run the jar
java -jar "%JAR_PATH%"


pause
