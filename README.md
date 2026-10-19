# curriculum

Codice dei video pubblici di [luca4j](https://www.youtube.com/@luca4j).

È l'unico repository pubblico del codice. Il profilo dell'organizzazione è [luca4j/.github](https://github.com/luca4j/.github). Il sito è [www.luca4j.com](https://www.luca4j.com).

## Un commit per video

Quando un video esce, il codice di quella lezione entra su `main` con un solo commit. Per la serie sul linguaggio il messaggio è `linguaggio NN titolo breve` e il codice sta in `linguaggio/src/`.

Il commit della lezione non si riscrive. Una correzione è un commit successivo, e il messaggio cita il video.

Non si anticipa il codice prima della pubblicazione del video. Finché un video non esce, questo repository non contiene quella lezione.

## Versioni del codice delle lezioni

Il repository evolve insieme al percorso video.

Il file `linguaggio/src/HelloWorld.java` presente su `main` corrisponde alla **lezione 02 — print e println**.

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
