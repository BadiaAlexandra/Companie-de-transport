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

### 4 . Get /getCalatori
Metoda e folosita pentru a lista toti calatorii. \
Parametrii: nu sunt \
Exemplu apel:
```
127.0.0.1:8123/getCalatori
```
### 5 . Post /adaugaCalator
Metoda e folosita pentru a adauga calatori \
Parametrii: json body:
```
{
"email": "alex@yahoo.com",
"parola": "Alex123",
"plecare": "Ologeni",
"sosire": "Gara Sud",
"valabilitate":30,
"startData": "1/2/2024"
}
```
Exemplu apel:
```
127.0.0.1:8123/adaugaCalator
```

### 6 . Post/adaugaAbonament
Metoda e folosita pentru a adauga abonament\
Parametrii:json body:
```
 {
"email": "alin@yahoo.com",
"parola": "Alin123",
"plecare": "Ologeni",
"sosire": "Gorgota",
"valabilitate":30,
"startData":"11/12/2023"
} 
```
Exemplu apel:
```
127.0.0.1:8123/adaugaAbonament
```
### 7 . Post/adaugaCategorieCalator
Metoda e folosita pentru a adauga categoria unui calator(elev, student)\
Parametrii: json body:
```
 {
"email": "alin@yahoo.com",
"parola": "Alin1234",
"idLegitimatie": "1234-87",
"numeCategorie": "Student"
} 
```
Exemplu apel:
```
127.0.0.1:8123/adaugaCategorieCalator
```
### 8 . Get /getTranzactii
Metoda e folosita pentru a lista toate tranzactiile\
Parametrii: nu sunt \
Exemplu apel:
```
127.0.0.1:8123/getTranzactii

```
### 9. Get /getTranzactiiUtilizator
Metoda e folosita pentru a lista tranzactiile unui utilizator \
Parametrii: email si parola\
Exemplu apel:
```
127.0.0.1:8123/getTranzactiiUtilizator?email=alin@yahoo.com&parola=Alin123
```

### 10. Post /emitereBilet
Metoda e folosita pentru a emite un bilet \
Parametrii:json body:
```
 {
        "email": "alin@yahoo.com",
        "parola": "Alin123",
        "idCursa": 108
}
```
Exemplu apel:
```
127.0.0.1:8123/emitereBilet
```
