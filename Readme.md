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

  ![screenshot.png](../../../../../Imagens/screenshot.png)

2.  **`Leao` (Subclasse de `Animal` + `AnimalTerrestre`)**

  ![screenshot.png](../../../../../Imagens/screenshot.png)
  
3.  **`Tubarao` (Subclasse de `Animal` + `AnimalAquatico`)**

  ![screenshot|TUTU.png](../../../../../Imagens/screenshot%7CTUTU.png)

4.  **`Ornitorrinco` (Subclasse de `Animal` + `AnimalTerrestre` + `AnimalAquatico`)**

   ![screenshotPerry.png](../../../../../Imagens/screenshotPerry.png)

5.  **`Main` (Classe de Teste)**

   ![screenshotMAin.png](../../../../../Imagens/screenshotMAin.png)