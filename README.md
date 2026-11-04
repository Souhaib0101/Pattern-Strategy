# Pattern Strategy – Java

## 1. Présentation

Implémentation du patron de conception **Strategy** en Java. Ce patron permet de définir plusieurs algorithmes interchangeables et de modifier dynamiquement le comportement d'un objet sans modifier sa classe.

## 2. Diagramme de classes

![Diagramme de classes](Pasted%20image%2020261104010117.png)
  

Le diagramme présente les relations entre :

- **Strategy** : interface définissant l'opération commune.
    
- **StratImp1, StratImp2, StratImp3** : implémentations concrètes de l'interface.
    
- **Context** : utilise une stratégie et permet de la modifier via `setStrategy()`.
    
- **Main** : gère la sélection et la création des stratégies.
    

## 3. Structure du projet

```
src/
└── main/
    └── java/
        └── net/
            └── montaki/
                ├── Main.java
                ├── Context.java
                ├── Strategy.java
                ├── StratImp1.java
                ├── StratImp2.java
                ├── StratImp3.java
                └── DefaultStratImp.java
```

## 4. Fonctionnement

Le programme utilise une `HashMap<String, Strategy>` pour conserver les instances des stratégies déjà créées.

1. L'utilisateur saisit le numéro de la stratégie souhaitée.
    
2. Le programme vérifie si cette stratégie existe déjà dans la HashMap.
    
3. Si elle n'existe pas, elle est créée dynamiquement avec Java Reflection (`Class.forName()`), puis ajoutée à la HashMap.
    
4. Si elle existe déjà, son instance est directement récupérée.
    
5. La stratégie est affectée au `Context` à l'aide de `setStrategy()`.
    

## 5. Test d'exécution

  
![Test d'exécution](Pasted%20image%2020261104010324.png)


Le test permet de vérifier la création dynamique des stratégies et la réutilisation des instances déjà présentes dans la HashMap.

## 6. Technologies utilisées

- Java
    
- Programmation orientée objet (POO)
    
- Design Pattern Strategy
    
- Java Reflection
    
- HashMap et interfaces Java
