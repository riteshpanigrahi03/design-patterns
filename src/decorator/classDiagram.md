classDiagram
    class Coffee {
        getDescription() String
        getCost() double
    }
    class BasicCoffee {
        getDescription() String
        getCost() double
    }
    class CoffeeDecorator {
        - coffee: Coffee
        getDescription() String
        getCost() double
    }
    class MilkDecorator {
        + MilkDecorator(coffee: Coffee)
        getDescription() String
        getCost() double
    }
    class SugarDecorator {
        + SugarDecorator(coffee: Coffee)
        getDescription() String
        getCost() double
    }
    

    Coffee <|-- BasicCoffee : is-a
    Coffee <|-- CoffeeDecorator : is-a
    Coffee *-- CoffeeDecorator : has-a
    CoffeeDecorator <|-- MilkDecorator : is-a
    CoffeeDecorator <|-- SugarDecorator : is-a