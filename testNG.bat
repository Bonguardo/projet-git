set projectLocation=C:\ExemplesJava\ZEMIS
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*;C:\Users\maryse\.p2\pool\plugins
java org.testng.TestNG %projectLocation%\testNg.xml
pause