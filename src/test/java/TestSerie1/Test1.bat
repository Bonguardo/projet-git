set projectLocation=C:\ExemplesJava\ZEMIS
set projectLocationXml=C:\ExemplesJava\ZEMIS\src\test\java\TestSerie1
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*;C:\Users\maryse\.p2\pool\plugins
java org.testng.TestNG %projectLocationXml%\Test1.xml
pause