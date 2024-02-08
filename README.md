# Meu programa
Java Restful
### Diagrama de classes

    class User {
        - String name    
        - Account account    
        - Feature[] features
        - Card card
        - News[] news
    }
    class Account {
        - String number
        - String agency
        - double balance
        - double limit
    }
    class Feature{
        - String icon
        - String description
    }
    
    class Card{
        - String number
        - double limit
    }
    
    class News {
        - String icon
        - String description
    }
    
    User *-- Account: has
    User *-- Feature: has
    User *-- Card: has
    User *-- News: has

