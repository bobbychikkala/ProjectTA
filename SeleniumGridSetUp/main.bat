@echo off
cd /d %~dp0

echo Launching Selenium Grid Hub...
start "" "seleniumhub.bat"

timeout /t 5 >nul

echo Launching Node 1...
start "" "selGridNode1.bat"

timeout /t 5 >nul

echo Launching Node 2...
start "" "selGridNode2.bat"

echo All components started.
pause