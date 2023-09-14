# ArraysAndCollections

## Arrays:

→ Array é estático, tamanho fixo

→ Homogêneo

Pelo fato dele ser homogeneo temos que definir **um tipo** para o array

→ Array é um objeto

## Equals

O método equals é utilizado para comparações. A classe String e as classes Wrapper sobrescrevem equals() para garantir que dois objetos desses tipos, com o mesmo conteúdo, possam ser considerados iguais. **Quando a finalidade for descobrir se duas referências são iguais, o operador “= =” deverá ser usado, pois serão comparados os bits das variáveis**.O método equals é utilizado para comparações. A classe String e as classes Wrapper sobrescrevem equals() para garantir que dois objetos desses tipos, com o mesmo conteúdo, possam ser considerados iguais. Quando a finalidade for descobrir se duas referências são iguais, o operador “= =” deverá ser usado, pois serão comparados os bits das variáveis.


## HashCode

O códigos de hashing são geralmente utilizados para determinar em qual local, no conjunto, ele deve ser armazenado. Sendo, posteriormente, utilizado para fazer uma pesquisa dentro do próprio conjunto. Uma forma bastante comum de se utilizar o hashCode é definindo um número para cada letra do Alfabeto (A=1, B=2, C=3 e etc..). Ao ser fornecido um nome, o algorítmo irá calcular a multiplicação dos números referentes a letras e irá retornar um hashCode daquele nome, em específico.



## Collections

Collections Fremawork faz parte do pacote `java.util` e é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada de coleção, ou collections. 

A Collections Framework contém os seguintes elementos: 

- Interface
    - *tipos abstratos que representam as coleções*. Permitem que coleções sejam manipuladas tendo como base o conceito ***“Programar para interfaces e não para implementações”,*** desde que o acesso aos objetos se restrinja apenas ao uso de métodos definidos nas interfaces.
- Implementações
    - São as implementações concretas das interfaces;
- Algoritmos
    - ***São os métodos que realizam as operações sobre os objetos das coleções,*** tais como busca e ordenação


 [📝 Anotações completas da aula 📝 ](https://artistic-growth-ef2.notion.site/Arrays-Collections-2aa16585094d4352b4b817707e7da5c3?pvs=4)
