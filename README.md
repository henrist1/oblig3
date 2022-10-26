# Oblig3
Oblig 3 - git og continuous integration

Først la jeg til prosjektmappen fra forrige oblig til dette github prosjektet, så oprettet jeg en ny workflow
i Actions. I den opprettede test.yml filen hentet jeg template kode og endret på versjonen til JDK 17 som jeg bruker i java prosjektet.

Første forsøk på å kjøre testene feilet, siden ingen tester kjørte. Surefire versjonen som var installert fra før støttet ikke JUnit 5, da
oppdaterte jeg denne til en versjon som støtter testene mine. Jeg commitet den nye pom.xml filen, og så deretter i workflow loggen at 
alle testene kjørte som et resultat av forrige commit.

Kilder
Template kode: https://dev.to/ewefie/getting-started-with-github-actions-run-junit-5-tests-in-a-java-project-with-maven-20g4
