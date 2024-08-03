RU text
Ваше задание на сегодня — нужно написать сервис, который собирает корзину для интернет-магазина.
Выполненное задание пришлите на платформу в виде ссылки на пул-реквест проекта на GitHub.
Алгоритм действий:
 Разработайте контроллер, сервис и некую сущность корзины с покупками.
 У контроллера должны быть два метода:
/store/order/add
/store/order/get

 При обращении к методу add можно в качестве параметров запроса передавать один или несколько чисел, которые являются ID некоего товара.
 При get мы должны получить все добавленные ID в виде списка в JSON-формате.
 Для каждого подключения нового клиента должен создаваться новый объект — корзина.
 Никаких хранилищ всех корзин быть не должно.
 В качестве теста можно зайти со своего браузера и добавить итемы (item), далее — получить список.
 Этот же тест нужно проделать через браузер в режиме инкогнито и получить другой список.
Алгоритм действий теста в браузере в режиме инкогнито:

 Обращаемся к методу add из браузера, добавляем первые ID.
 Обращаемся к методу add из инкогнито, добавляем первые ID.
 Повторяем шаг 1 и 2.
 Обращаемся к методу get сначала из браузера, потом из инкогнито. Списки должны быть разными и заполнены тем, что было в шагах 1–3 .

ENG text
Your task for today is to write a service that collects a shopping cart for an online store.
Send the completed task to the platform as a link to the project's pool request on GitHub.
Algorithm of actions:
Develop a controller, a service, and some kind of shopping cart entity.
 The controller must have two methods:
/store/order/add
/store/order/get

 When accessing the add method, you can pass one or more numbers as request parameters, which are the ID of a certain product.
 When getting, we need to get all the added IDs as a list in JSON format.
 A new shopping cart object must be created for each connection of a new client.
 There should be no storage of all the baskets.
 As a test, you can log in from your browser and add items, then get a list.
 The same test should be done through the browser in incognito mode and get another list.
The algorithm of the test actions in the browser in incognito mode:

 We turn to the add method from the browser, add the first IDs.
 We turn to the add method from incognito, add the first IDs.
 Repeat steps 1 and 2.
 We turn to the get method first from the browser, then from incognito. The lists should be different and filled with what was in steps 1-3.
