#### Was ist notwendig um Maven Site Dokumentation zu genreiren?
- ![Mvn](/Users/kyrilloshabib/bsd21_kyro/resources/images/mvn.png)

#### Welche unterschiedlichen Aspekte, Konfigurationen, Informationen usw. werden in site.xml bzw. pom.xml konfiguriert?
- Ein Projektobjektmodell oder POM ist die Arbeitseinheit in Maven. 
- Es ist eine XML-Datei, die Informationen über das Projekt und Konfigurationsdetails enthält, die von Maven zum Erstellen des Projekts verwendet wird. 
- Es enthält Standardwerte für viele Projekte.
- Beim Ausführen einer Aufgabe/Ziels sucht Maven im Verzeichnis nach der POM. 
- Es liest das POM, ruft die Konfigurationsinformationen ab und führt dann das Ziel aus.

Einige der Konfigurationen, die im POM angegeben werden können, sind
die Ziele, Projektabhängikeiten oder Plugins, die ausgeführt werden und die Build-Profile usw. 
Auch Infos wie Projektversion, Beschreibung, Entwickler, Mailinglisten usw. können angegeben werden.
