# SWT Übung 1 - FAQ

- Wann/warum sollte man die `@Override` Annotation verwenden?
	<blockquote>
		wenn eine Funktion überschrieben wird oder <br>
		Interface-Methoden implementiert werden
	</blockquote>
	<blockquote>
		Lesbarkeit
	</blockquote>
	<blockquote>
		ggf. Fehlermeldung beim Kompilieren einer falsch überschriebenen Methode
	</blockquote>
	
- Was bedeutet `static` und wozu wird es genutzt?
	<blockquote>
		<p>Variablen:</p> Wert ist in allen Objektinstanzen der Klasse gleich, <br>
			zum Abruf ist keine Objektinstanziierung notwendig, <br>
			sie sind an Klassen und nicht an Objekte gebunden <br>
			und werden über `Klassenname.Variablenname` aufgerufen
	</blockquote>
	<blockquote>
		<p>Methoden:</p> keine Objektinstanziierung zum Aufruf notwendig, <br>
			Aufruf über `Klassenname.Methodenname`, <br>
			können nur auf statische Variablen/Methoden zugreifen
	</blockquote>

- Warum/wann nutzt man `private`, welche Sichtbarkeiten gibt es noch?
	<https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html>