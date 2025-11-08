Sistema de Gerenciamento de Veículos
Desenvolvido por *Camile Kaghofer Schicht*

Descrição

Este projeto implementa um sistema simples de gerenciamento de veículos, com foco em conceitos de orientação a objetos, incluindo herança, encapsulamento e classes abstratas.

O sistema permite instanciar diferentes tipos de veículos (Carro e Moto), armazenar seus dados e exibir informações completas sobre cada um.


Estrutura do Projeto

O projeto contém as seguintes classes separadas em cada arquivo:

Veiculo (classe abstrata)
Atributos:
  - public String marca
  - public String modelo
  - private int ano
Métodos:
  - abstract String informacoesVeiculo()
  - getAno() e setAno(int ano)

Carro (herda de Veiculo)
- Atributo adicional: public int numeroPortas
- Método sobrescrito: informacoesVeiculo() — retorna todas as informações do carro.

Moto (herda de Veiculo)
- Atributo adicional: private int cilindrada
- Método sobrescrito: informacoesVeiculo() — retorna todas as informações da moto.

Main
Classe principal que cria e exibe as informações de um carro e de uma moto no terminal.
