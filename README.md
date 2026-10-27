# curriculum

Codice dei video pubblici di [luca4j](https://www.youtube.com/@luca4j).

È l'unico repository pubblico del codice. Il profilo dell'organizzazione è [luca4j/.github](https://github.com/luca4j/.github). Il sito è [www.luca4j.com](https://www.luca4j.com).

## Un commit per video

Quando un video esce, il codice di quella lezione entra su `main` con un solo commit. Per la serie sul linguaggio il messaggio è `linguaggio NN titolo breve` e il codice sta in `linguaggio/src/`.

Il commit della lezione non si riscrive. Una correzione è un commit successivo, e il messaggio cita il video.

Non si anticipa il codice prima della pubblicazione del video. Finché un video non esce, questo repository non contiene quella lezione.

## Versioni del codice delle lezioni

Il repository evolve insieme al percorso video.

Il file `linguaggio/src/HelloWorld.java` presente su `main` corrisponde alla **lezione 10 — Scorrere una stringa e ricostruire un numero**.

Video della lezione: [Java: scorrere una stringa e ricostruire un numero](https://www.youtube.com/watch?v=7vbBnrpDYfQ).

Parto dalla stringa `"1234"` e leggo le cifre dalla fine con `charAt(i)`: `i` parte da `stringa.length() - 1` e diminuisce fino a `0` incluso. Il secondo contatore `j` parte da `0` e aumenta. `Character.getNumericValue` restituisce il valore numerico della cifra; `Math.pow(10, j)`, convertito a `int`, fornisce il peso delle unità, decine, centinaia e migliaia. `num` accumula questi contributi.

Il sorgente finale stampa una sola riga:

```text
1234
```

Durante il video visualizzo anche risultati intermedi. Nel file finale la `println` è fuori dal ciclo. È un esercizio sulla stringa mostrata, non un convertitore generale: il programma non valida segni, separatori, caratteri non numerici o overflow. `length()` conta unità UTF-16 e `charAt()` ne legge una; per le cifre dell'esempio ogni carattere occupa una sola unità.

Riferimenti: [Think Java, capitolo 6, sezione 6.7](https://chrismayfield.github.io/ThinkJava2/ch06.html), [Character.getNumericValue](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Character.html#getNumericValue(char)) e [Math.pow](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Math.html#pow(double,double)).

Per recuperare il codice della **lezione 09 — Il ciclo while e il confronto con for**, puoi consultare il commit [`4129241`](https://github.com/luca4j/curriculum/commit/412924187b2b831fd2387c46e25006fd7d9d807c). In quella versione `while` visita i valori da `0` a `99` e l'`if` seleziona i 50 numeri pari da `0` a `98`.

Per recuperare il codice della **lezione 08 — Il ciclo for e i numeri pari**, puoi consultare il commit [`7bbf320`](https://github.com/luca4j/curriculum/commit/7bbf320d07572c84cb4e287a7fb31b8b8fd90a47). In quella versione il ciclo `for` visita i valori da `0` a `99` e stampa i numeri pari da `0` a `98`.

Per recuperare il codice della **lezione 07 — boolean, if e else — decidere con le condizioni**, puoi consultare il commit [`0f89685`](https://github.com/luca4j/curriculum/commit/0f896855c1135e3f59108216d9f10bb0ab1bed8b). In quella versione il programma stampa `1.0`, `0.30000000000000004` e `Sono uguali`.

Nota alla lezione 07: il confronto esatto produce `false`, mentre la differenza assoluta è minore di `1e-9`. L'OR è vero se almeno una condizione è vera, anche quando lo sono entrambe. Il messaggio “Sono uguali” indica quindi l'accettazione della differenza entro la tolleranza scelta, non l'identità dei valori `double`.

Riferimenti: [Think Java, capitolo 5](https://chrismayfield.github.io/ThinkJava2/ch05.html), [Java Language Specification, if](https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html#jls-14.9) e [OR logico](https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.24).

Per recuperare il codice della **lezione 06 — float, double e confronti con tolleranza**, puoi consultare il commit [`6f93b17`](https://github.com/luca4j/curriculum/commit/6f93b173e477ae1376d284cca837827aeaeefcea). In quella versione, dopo i due valori numerici, il programma stampa `false` e `true`.

Nota alla lezione 06: `float` ha 24 bit di precisione nel significando (circa 6–7 cifre decimali), `double` ne ha 53 (circa 15–16). Il risultato dell'esempio è deterministico. La tolleranza non elimina gli errori e non rende la precisione illimitata: va scelta in base al problema e alla scala dei valori. Il commento `// 0.3` nel sorgente conserva l'aspettativa matematica mostrata nel video; l'output effettivo è quello riportato sopra.

Riferimento: [Java Language Specification, Floating-Point Types and Values](https://docs.oracle.com/javase/specs/jls/se25/html/jls-4.html#jls-4.2.3).

Per recuperare il codice della **lezione 05 — Numeri interi, divisione e resto**, puoi consultare il commit [`c09cf19`](https://github.com/luca4j/curriculum/commit/c09cf199868ddc792007d9ef3089232136b6c9b1).

Nota alla lezione 05: `byte` usa 8 bit e rappresenta 256 valori, da -128 a 127 inclusi. `%` restituisce il resto, non la parte decimale del quoziente; la divisione intera tronca verso zero.

Per recuperare il codice della **lezione 04 — char, caratteri e Unicode**, puoi consultare il commit [`63d7ecc`](https://github.com/luca4j/curriculum/commit/63d7ecc).

Per recuperare il codice della **lezione 03 — Le stringhe**, puoi consultare il commit [`985e2e0`](https://github.com/luca4j/curriculum/commit/985e2e0).

Nota alla lezione 04: `char` rappresenta un'unità UTF-16 a 16 bit; alcuni caratteri Unicode richiedono due `char`. `String` è un tipo non primitivo. Il simbolo `☕` dell'esempio è rappresentabile con un solo `char`.

Per recuperare il codice della **lezione 02 — print e println**, puoi consultare il commit [`d9e9816`](https://github.com/luca4j/curriculum/commit/d9e9816).

Per recuperare il codice della **lezione 01 — Il primo programma**, puoi consultare il commit:

[`9ee5a79`](https://github.com/luca4j/curriculum/commit/9ee5a79)

In quella versione il programma stampa:

```
Hello World! Java
```

Le lezioni successive continueranno a utilizzare il repository pubblico, mantenendo la cronologia Git delle modifiche.

## I file video

I file video non stanno qui. Niente `.mp4`, `.mov`, `.mkv` o altri binari video. Il repository resta codice e testo.

I file del canale stanno nel bucket privato Cloudflare R2 `luca4j-video`. Il video si guarda su YouTube.

## Licenza

Non c'è una licenza di riuso generale. Se una lezione ne ha una, è scritta nel commit di quella lezione.
