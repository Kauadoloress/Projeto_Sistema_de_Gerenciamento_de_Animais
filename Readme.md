# 📜 **Projeto: Sistema de Gerenciamento de Animais (Zoológico POO)**

Um sistema Java que demonstra **herança, polimorfismo, interfaces, métodos/classes `final`, sobrecarga e abstração** para simular comportamentos de animais em um zoológico.

----------

## 🛠 **Tecnologias e Conceitos**

✔ **Java** (POO pura)  
✔ **Polimorfismo**: Tratar diferentes animais como um tipo genérico (`Animal`).  
✔ **Herança com abstração**: Classe abstrata `Animal` e subclasses concretas.  
✔ **Interfaces**: `AnimalTerrestre` e `AnimalAquatico` para ações específicas.  
✔ **Herança múltipla simulada**: `Ornitorrinco` implementa duas interfaces.  
✔ **Sobrecarga**: Construtores e métodos com múltiplas versões (`atacar()` no `Leao`).  
✔ **Final methods/classes**: Garantia de imutabilidade em comportamentos críticos.  
✔ **Sem getters/setters**: Atributos acessados diretamente ou via métodos de ação.

----------

## 🐾 **Estrutura do Projeto**
1.  **`Animal` (Classe Abstrata)**

![screenshot](https://github.com/user-attachments/assets/a360d5ee-933d-4675-9e86-f5ced22becba)  

2.  **`Leao` (Subclasse de `Animal` + `AnimalTerrestre`)**

![screenshot](https://github.com/user-attachments/assets/5f66945f-05c7-4372-bf5e-7205422815d4)

3.  **`Tubarao` (Subclasse de `Animal` + `AnimalAquatico`)**

 ![screenshot|TUTU](https://github.com/user-attachments/assets/e77ac0d8-6a03-484e-a230-4b575751fcda)


4.  **`Ornitorrinco` (Subclasse de `Animal` + `AnimalTerrestre` + `AnimalAquatico`)**

![screenshotPerry](https://github.com/user-attachments/assets/fa70b24d-86ca-4cab-8222-179aeb912fca)


5.  **`Main` (Classe de Teste)**

![screenshotMAin](https://github.com/user-attachments/assets/bdc53519-b127-4d75-adfd-633a11ef8475)
