@echo off
setlocal

set "ROOT_DIR=%~dp0"

set "JAR_PATH=%ROOT_DIR%out\artifacts\PhoneWord_jar\PhoneWord.jar"

cd /d "%ROOT_DIR%"

java -jar "%JAR_PATH%"


pause

