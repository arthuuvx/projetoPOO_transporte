# Sistema de Aluguel de Meios de Transporte Individuais

## Descrição
Este projeto implementa um sistema de aluguel de meios de transporte individuais utilizando o padrão de projeto **Abstract Factory**. Ele gerencia a criação de diferentes tipos de transportes, classificados por categorias:

- **Movidos a bateria**: Patinetes elétricos, bicicletas elétricas.
- **Movidos pelo esforço humano**: Bicicletas convencionais, patins, skates.

O sistema permite que as fábricas específicas criem os transportes apropriados, garantindo que cada transporte seja compatível com sua categoria.

## Estrutura do Projeto
A estrutura do projeto segue o modelo:
```
src/
└── com.example.transport
    ├── Transport.java
    ├── ElectricScooter.java
    ├── ElectricBike.java
    ├── Bicycle.java
    ├── RollerSkates.java
    ├── Skateboard.java
    ├── TransportFactory.java
    ├── ElectricTransportFactory.java
    ├── HumanPoweredTransportFactory.java
    └── Main.java
```

## Requisitos Técnicos
1. **Interfaces**: A interface `Transport` define o método `void ride()`, que exibe uma mensagem sobre o uso do transporte.
2. **Classes Concretas**: Implementam os diferentes tipos de transportes.
3. **Fábricas**: 
   - `ElectricTransportFactory` cria transportes movidos a bateria.
   - `HumanPoweredTransportFactory` cria transportes movidos pelo esforço humano.
4. **Main**: Classe principal para demonstração do uso das fábricas.

## Exemplo de Uso
```java
public class Main {
    public static void main(String[] args) {
        TransportFactory electricFactory = new ElectricTransportFactory();
        Transport electricScooter = electricFactory.createScooter();
        electricScooter.ride();

        HumanPoweredTransportFactory humanFactory = new HumanPoweredTransportFactory();
        Transport bicycle = humanFactory.createBike();
        bicycle.ride();
    }
}
```
Saída esperada no console:
```
Usando um Patinete Elétrico.
Usando uma Bicicleta Convencional.
```

## Como Executar
1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```
2. Navegue até o diretório do projeto e compile o código:
   ```bash
   javac -d bin src/com/example/transport/*.java
   ```
3. Execute a classe principal:
   ```bash
   java -cp bin com.example.transport.Main
   ```

## Expansões
- Adicionar novos tipos de transportes.
- Criar categorias adicionais (ex.: movidos a combustíveis fósseis).

---
Desenvolvido como atividade prática de Programação Orientada a Objetos II.
