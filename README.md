# Chatbox WebSocket

## Description

Chatbox WebSocket est une application de chat en temps réel construite avec Spring Boot et WebSocket. Elle permet aux utilisateurs de se connecter, d'envoyer des messages et de recevoir des mises à jour instantanées dans un environnement de chat.

## Fonctionnalités

- Envoi et réception de messages en temps réel.
- Gestion des utilisateurs qui rejoignent et quittent le chat.
- Utilisation de WebSocket pour une communication efficace.

## Technologies utilisées

- Java
- Spring Boot
- WebSocket
- Lombok

## Installation

  1. Clonez le dépôt: git clone https://github.com/Jahlive032/chatbox-with-websocket.git
  2. Accèdez au repertoire du projet: cd chatbox_websocket
  3. Assurez-vous d'avoir Maven installé, puis exécutez la commande suivante pour démarrer l'application: mvn spring-boot:run

## Utilisation

  1. Ouvrez votre navigateur et accédez à: http://localhost:8080
  2. Connectez-vous en utilisant un nom d'utilisateur
  3. Envoyez des messages et interagissez avec d'autres utilisateurs en temps réel.

## Structure du projet

  1. src/main/java/com/example/chatbox_websocket/... : Contient le code source de l'application
  2. controller/ChatController.java: Gère les messages entrants et sortants
  3. model/ChatMessage.java: Modèle de données pour les messages de chat.
  4. config/WebSocketConfig.java: Configurationdu WebSocket
  5. ChatboxWebSocketApplication.java: Point d'entrée de l'application

## Contribution

Les contributions sont les bienvenues ! Veuillez soumettre une demande de tirage (pull request) pour toute amélioration ou correction.
