# LISTA DE FUNCTII SUPORTATE DE APLICATIE

### 1. Get /getCurse
Metoda e folosita pentru a lista toate cursele disponibile. \
Parametrii: nu sunt. \
Exemplu apel: 
```
127.0.0.1:8123/getCurse
```

### 2 . Get /programCursa
Metoda e folosita pentru a lista toate cursele care trec prin doua statii date ca parametrii \
Parametrii: statiePornire (string) si statieDestinatie (string). \
Exemplu apel:
```
127.0.0.1:8123/programCursa?statiePornire=Ologeni&statieDestinatie=Gara Sud
```

### 3 . Get /getCurseStatie
Metoda e folosita pentru a lista toate cursele care trec printr-o anumita statie. \
Parametrii: statie(string). \
Exemplu apel:
```
127.0.0.1:8123/getCurseStatie?statie=Ologeni
```