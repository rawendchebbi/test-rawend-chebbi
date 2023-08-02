Nom du projet : test-tech  -  Instructions de test de l'API REST


Introduction
Bienvenue dans la phase de test de mon projet ! Dans ce document, vous trouverez des instructions sur la façon de tester les API. 
Veuillez vous assurer que le projet est en cours d'exécution sur votre ordinateur local avant de procéder aux tests.


Installation et configuration
1 - Assurez-vous que Java 11 est installé sur votre machine.
2 - Faire un clone du repository du projet de : [https://github.com/rawendchebbi/test-rawend-chebbi]
3 - Ouvrez le projet dans votre IDE Java préféré (par exemple, Visual Studio Code).
4 - Créez et exécutez l'application Spring Boot.
5 - Le serveur devrait maintenant fonctionner sur http://localhost:8181 


Points finaux à tester
1. Récupérer les produits
Endpoint API : GET http://localhost:8181/products
Description :
Ce endpoint récupère une liste de produits à partir du serveur.
Étapes d'essai :
Envoyez une requête GET à http://localhost:8181/products.
Vérifiez que le code d'état de la réponse est 200 (OK).
Vérifiez le corps de la réponse pour vous assurer qu'il contient une liste de produits au format JSON.


2. Récupération du produit par ID
Point de terminaison : GET http://localhost:8181/product?id=1
Description:
Ce point de terminaison récupère un produit spécifique en fonction de l'ID fourni.
Étapes d'essai :
Envoyez une requête GET à http://localhost:8181/product?id=1.
Vérifiez que le code d'état de la réponse est 200 (OK) si le produit existe.
Si l'ID de produit n'existe pas (par exemple, id=6), vérifiez que le code d'état de la réponse est 404 (Introuvable) et que le message indique que le produit n'existe pas.


3. Passer une commande
Point de terminaison : POST http://localhost:8181/placeOrder
Description:
Ce point de terminaison vous permet de passer une commande pour plusieurs produits.
Étapes d'essai :
Envoyez une requête POST à http://localhost:8181/placeOrder avec la charge utile JSON suivante :
{
    "1": 2,
    "3": 1,
    "2": 3
}
Vérifiez que le code d'état de la réponse est 200 (OK) si la commande est passée avec succès.
Si aucune donnée n'est fournie, vérifiez que le code d'état de la réponse est 400 (Bad Request) et que le message indique qu'il n'y a pas de produits dans la commande.


Conclusion
Félicitations! Vous avez terminé les tests de mon projet API REST. Si vous avez rencontré des problèmes lors des tests ou si vous avez des questions, n'hésitez pas à me contacter. Merci pour votre contributions!
