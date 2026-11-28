# curriculum

Codice dei video pubblici di [luca4j](https://www.youtube.com/@luca4j).

È l'unico repository pubblico del codice. Il profilo dell'organizzazione è [luca4j/.github](https://github.com/luca4j/.github). Il sito è [www.luca4j.com](https://www.luca4j.com).

## Un commit per video

Quando un video esce, il codice di quella lezione entra su `main` con un solo commit. Per la serie sul linguaggio il messaggio è `linguaggio NN titolo breve` e il codice sta in `linguaggio/src/`.

Il commit della lezione non si riscrive. Una correzione è un commit successivo, e il messaggio cita il video.

Non si anticipa il codice prima della pubblicazione del video. Finché un video non esce, questo repository non contiene quella lezione.

## Versioni del codice delle lezioni

Il repository evolve insieme al percorso video.

Il file `linguaggio/src/Main.java` presente su `main` corrisponde alla **lezione 17 — Gli enum e un cursore da muovere con le frecce**.

Video: [Java: gli enum e un cursore da muovere con le frecce](https://www.youtube.com/watch?v=T6TQApqJCYg).

Definisco un tipo enumerato `Direction` con quattro valori: `UP`, `DOWN`, `LEFT` e `RIGHT`. Leggo un tasto alla volta con `System.in.read()`, lo trasformo in una `Direction` con uno `switch` usato come espressione e, con un secondo `switch`, sposto un cursore `@` su una griglia 5×5 stampata nel terminale. `Math.floorMod` tiene le coordinate fra 0 e 4: attraversando un bordo il cursore rientra dal lato opposto. Il ciclo `do while` ridisegna la griglia finché non premo `q`.

Il programma va eseguito in un terminale macOS o Linux, non nella console Run dell'IDE. Con **Java 25**, dalla radice del repository:

```text
java linguaggio/src/Main.java
```

All'avvio il programma lancia `stty -icanon -echo`, così il terminale consegna ogni tasto senza aspettare Invio; all'uscita con `q` ripristina le impostazioni con `stty sane`. Se interrompi con Ctrl+C, digita `stty sane` e premi Invio per riavere l'eco dei tasti. Su Windows `stty` non è disponibile.

Una freccia arriva come tre caratteri: ESC, `[` e una lettera, `A` per su, `B` per giù, `C` per destra e `D` per sinistra. Lo `switch` guarda solo la lettera: per gli altri caratteri la direzione è `null` e la posizione non cambia. Anche le maiuscole `A`, `B`, `C` e `D` digitate a mano muovono il cursore.

Conservo il sorgente registrato, compreso l'import inutilizzato di `Scanner`. Nel sorgente i nomi `UP` e `DOWN` sono scambiati due volte: la freccia su (`A`) produce `Direction.DOWN`, e `DOWN` esegue `y--`. La riga 0 è in alto, quindi il cursore sale e il movimento a schermo è corretto. La pulizia dello schermo usa `println`, che aggiunge una riga vuota sopra il messaggio.

Esercizio: sistema i nomi senza cambiare il comportamento, in modo che la freccia su produca `Direction.UP` e che `UP` faccia salire il cursore. Poi porta `size` a 8 e verifica che il rientro dai bordi funzioni ancora.

Riferimenti: [Think Java, capitolo 12](https://chrismayfield.github.io/ThinkJava2/ch12.html), che nel video uso come punto di partenza: il libro codifica semi e valori delle carte con numeri interi e non tratta gli enum. Per gli enum: [Enum Types, tutorial Java](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html) e [Java Language Specification, Enum Classes](https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.9). Per il resto: [Math.floorMod](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Math.html#floorMod(int,int)).

Per recuperare il codice della **lezione 16 — La classe Point e la stima di pi greco con Monte Carlo**, consulta il commit [`c23d33c`](https://github.com/luca4j/curriculum/commit/c23d33c64e61680c32842142a5b022bb60e379ec).

Video della lezione: [Java: la classe Point e la stima di pi greco con Monte Carlo](https://www.youtube.com/watch?v=hS7twd4kwFs).

Creo una classe `Point` con coordinate `x` e `y`, costruttore, getter e metodo di istanza `isInside`. Genero punti con `Math.random()` nel quadrato con coordinate da 0 incluso a 1 escluso. Conto quelli per cui `x² + y² <= 1` e stimo π con quattro volte il rapporto fra punti interni e punti totali.

Esecuzione con **Java 25**, dalla radice del repository:

```text
java linguaggio/src/Main.java
```

Il ciclo parte da `i = 1` e termina prima di `1000000`: genera 999.999 punti e stampa una stima a ogni iterazione. Il risultato cambia fra esecuzioni e non garantisce un numero fisso di cifre corrette. La console può scorrere velocemente.

Conservo il sorgente registrato, compreso l'import inutilizzato di `Scanner`. `Point` è una classe annidata statica dentro `Main`, non dentro il metodo `main`; `isInside` è invece un metodo di istanza. I getter sono una scelta per esporre i campi privati, non un obbligo generale del linguaggio.

Nel metodo registrato il confronto è `Math.pow(x, 2) + Math.pow(y, 2) <= r`: qui lo chiamo sempre con `1`, quindi verifica correttamente il cerchio unitario, bordo incluso. Per un raggio generico R il confronto richiederebbe R²: il parametro attuale è una soglia sulla distanza al quadrato. Il rapporto usato nella stima è interni/totali, non interni/esterni. Non è presente una classe `Circle`.

Esercizio: prova il limite del ciclo a 100, 10000 e 1000000, ripeti ogni prova e confronta l'ultima stima. Più punti tendono a ridurre l'errore, senza garantire un miglioramento in ogni singola esecuzione.

Riferimento sulle classi: [Think Java, capitolo 11](https://chrismayfield.github.io/ThinkJava2/ch11.html). L'esempio Monte Carlo del filmato è una scelta autonoma e non riproduce la classe Time del capitolo.

Per recuperare il codice della **lezione 15 — Un menu interattivo con Scanner e switch**, consulta il commit [`0b78b33`](https://github.com/luca4j/curriculum/commit/0b78b331eadcb15b315b7547a36f4dd81f592944).

Il ramo `main` contiene soltanto i sorgenti dell'esempio corrente. `Main.java` ha sostituito `HelloWorld.java` dalla lezione 13: il vecchio file, rimasto per errore fino alla pubblicazione della lezione 15, è stato rimosso con una correzione successiva. Per gli esempi precedenti usa i commit delle rispettive lezioni elencati sotto.

Video della lezione: [Java: un menu interattivo con Scanner e switch](https://www.youtube.com/watch?v=nPPJF_RQPbQ).

Riprendo il FizzBuzz ricorsivo della lezione 14 e leggo i numeri da tastiera con `Scanner`, `System.in` e `nextInt()`. Il menu offre `1. FizzBuzz` e `2. Esci`: lo `switch` sceglie il ramo e il ciclo `do while` ripresenta il menu finché la scelta è diversa da `2`. Quando scelgo `2`, il programma stampa `Goodbye!` e chiude lo scanner.

Per eseguire dalla radice del repository con **Java 25**:

```text
java linguaggio/src/Main.java
```

Puoi ripetere la prova del video: scegli `1`, inserisci `15`, scegli ancora `1`, inserisci `27`, poi scegli `2`. FizzBuzz stampa dal numero scelto fino a `1`, sostituendo i multipli di 3 con `Fizz`, quelli di 5 con `Buzz` e quelli di entrambi con `FizzBuzz`.

Conservo il sorgente registrato, compreso l'import inutilizzato di `Arrays`. L'esempio presume input interi e numeri non negativi piccoli per FizzBuzz: non gestisce testo non numerico, input esaurito, valori negativi o una ricorsione troppo profonda. Le scelte intere diverse da `1` e `2` ripropongono il menu, senza un ramo `default`. Chiudere questo scanner chiude anche `System.in`; qui lo faccio solo alla fine del programma.

Riferimenti mostrati nel video: [Think Java, capitolo 3 — Input and Output](https://chrismayfield.github.io/ThinkJava2/ch03.html) e [capitolo 5 — Conditionals and Logic](https://chrismayfield.github.io/ThinkJava2/ch05.html).

Per recuperare il codice della **lezione 14 — FizzBuzz ricorsivo**, puoi consultare il commit [`3e61a8b`](https://github.com/luca4j/curriculum/commit/3e61a8b5b6a89992373df2633eb968410972ca8e).

Video della lezione: [Java: FizzBuzz ricorsivo](https://www.youtube.com/watch?v=bmSa43BKwE8).

Scrivo `fizzbuzz(n)`. Se `n` è `0` ritorno senza stampare. Altrimenti controllo prima se `n` è divisibile per 3 e per 5, con `&&`, e in quel caso stampo `FizzBuzz`. Con `else if` stampo `Fizz` quando è divisibile per 3, `Buzz` quando è divisibile per 5, e negli altri casi il numero. La chiamata `fizzbuzz(n - 1)` sta dopo la stampa, quindi `fizzbuzz(15)` scende di una riga alla volta:

```text
FizzBuzz
14
13
Fizz
11
Buzz
Fizz
8
7
Fizz
Buzz
4
Fizz
2
1
```

Per eseguire il sorgente dalla radice del repository con **Java 25**:

```text
java linguaggio/src/Main.java
```

Conservo il nome `Main`, `main(String... args)`, i commenti e l'import inutilizzato di `java.util.Arrays` così come registrati. L'esempio usa un intero non negativo piccolo e non gestisce `n` negativo. FizzBuzz non è un esercizio di Think Java: lo uso per unire le condizioni e la chiamata ricorsiva.

Riferimento: [Think Java, capitolo 8 — Recursive Methods](https://chrismayfield.github.io/ThinkJava2/ch08.html). Il fattoriale mostrato dal libro in quel capitolo non fa parte di questa lezione.

Per recuperare il codice della **lezione 13 — Ricorsione, conto alla rovescia e Fibonacci**, puoi consultare il commit [`08ba9db`](https://github.com/luca4j/curriculum/commit/08ba9db4d0525042e6f3986f77d206479c58fa1e).

Video della lezione: [Java: ricorsione, conto alla rovescia e Fibonacci](https://www.youtube.com/watch?v=Rhehsu3aURw).

In quella versione `countdown(10)` stampa i numeri da 10 a 1 e poi `Fine`: il caso base è `n == 0`. `fib(n)` restituisce un intero, usa i casi base `0` e `1` e somma `fib(n - 1)` e `fib(n - 2)`. Le chiamate da `fib(0)` a `fib(5)` stampano `0`, `1`, `1`, `2`, `3`, `5`. L'esempio non gestisce valori negativi né overflow, e questa versione di Fibonacci ripete dei calcoli.

Per recuperare il codice della **lezione 12 — Creare un metodo e confrontare array con Arrays.equals**, puoi consultare il commit [`a2d8c3f`](https://github.com/luca4j/curriculum/commit/a2d8c3fc43e912bd8ad1cf41e0cb82ed10ce9ac3).

Video della lezione: [Java: creare un metodo e confrontare array con Arrays.equals](https://www.youtube.com/watch?v=ScyfWbFDAnw).

Estraggo il confronto tra due array di caratteri in un metodo `arrayEquals`, con due parametri `char[]` e un risultato `boolean`. Riutilizzo il metodo per confrontare coppie diverse, poi sostituisco l'implementazione con `Arrays.equals` della libreria Java.

Il sorgente finale conserva questa seconda versione, esattamente come registrata. I primi due array contengono gli stessi caratteri; il terzo termina con `'5'` anziché `'4'`. Il programma stampa:

```text
true
false
```

`Arrays.equals` confronta lunghezza, elementi e ordine. Il metodo scritto a mano durante la lezione presume ancora array della stessa lunghezza: controllo delle lunghezze e uscita al primo elemento diverso restano gli esercizi proposti. `static` indica che il metodo appartiene alla classe; l'accessibilità dipende dai modificatori, come `public`. Nel video uso la forma classica `public static void main(String[] args)`; Java 25 supporta anche forme semplificate di `main`.

Riferimenti: [Think Java, capitolo 4 — Methods and Testing](https://chrismayfield.github.io/ThinkJava2/ch04.html), [Arrays.equals per char[]](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Arrays.html#equals(char%5B%5D,char%5B%5D)), [JLS — metodi static](https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.4.3.2) e [JEP 512 — forme semplificate di main](https://openjdk.org/jeps/512). La ricorsione del capitolo 8 è annunciata come argomento successivo, non sviluppata in questa lezione.

Per recuperare il codice della **lezione 11 — Array di caratteri e confronto con for**, puoi consultare il commit [`27ae496`](https://github.com/luca4j/curriculum/commit/27ae4968faecdb8478e56d319fec9d3007b97aa0).

Video della lezione: [Java: array di caratteri e confronto con for](https://www.youtube.com/watch?v=J5WwQ2nZJrw).

Creo due `char[]`, leggo la lunghezza con `length` e accedo agli elementi da `0` a `length - 1`. Il confronto `==` tra due array confronta i riferimenti, non il contenuto. Per confrontare i caratteri uso un ciclo `for` e aggiorno `sonoUguali` con `&&` e `a == b`.

Il sorgente finale confronta `{'1', '2', '3', '4'}` e `{'1', '2', '3', '5'}` e stampa:

```text
false
```

Conservo il codice esattamente come registrato: il ciclo presume due array della stessa lunghezza. Se il secondo è più corto, l'accesso può uscire dai limiti; se è più lungo, gli elementi aggiuntivi non vengono confrontati. L'esercizio annunciato nel video consiste nel controllare prima le lunghezze ed eseguire il ciclo soltanto se sono uguali. Un `char[]` e una `String` sono tipi distinti.

Riferimenti: [Think Java, capitolo 7](https://chrismayfield.github.io/ThinkJava2/ch07.html), [Java Language Specification, Arrays](https://docs.oracle.com/javase/specs/jls/se25/html/jls-10.html) e [Reference Equality Operators](https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.21.3).

Per recuperare il codice della **lezione 10 — Scorrere una stringa e ricostruire un numero**, puoi consultare il commit [`fe68b23`](https://github.com/luca4j/curriculum/commit/fe68b23fd0314756e49a075053b8f153707ba8dd). In quella versione il ciclo legge le cifre di `"1234"` dalla fine e ricostruisce il numero con `Character.getNumericValue`, `Math.pow` e un accumulatore. Il sorgente finale stampa `1234`: è un esercizio sull'esempio mostrato, non un convertitore generale, e non valida segni, separatori, caratteri non numerici o overflow.

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
