# QualityExpert4
1. Открыть проект в IDE (пример: Intellij Idea).
2. Запустить DemoApplication.java.


ЕСЛИ УСТАНОВЛЕН POSTMAN.

3. Создать в Postman новый HTTP Request.
4. В Enter Request URL ввести http://localhost:8080/ok.
5. Во вкладке Headers указать:
  в поле Key - Content-Type;
  в поле Value: application/json.
6. В Method указать POST или PUT.
7. Во вкладке Body в raw ввести JSON-объект формата:

{
"messageId": 1138, //ID сообщения (любое целочисленное значение).

"messageFrom": "Fenn Shysa", //Отправитель (любая строка).

"messageTo": "Boba Fett", //Получатель (любая строка).

"messageBody": "Su'cuy gar!" //Тело сообщения (любая строка).

}
После чего удалить комментарии и нажать SEND.
8. Сообщения можно изменять также с помощью методов POST и PUT. Для вывода всех сообщений нужно выбрать метод GET и нажать SEND.


ЕСЛИ НЕ УСТАНОВЛЕН POSTMAN.

3. Открыть http://localhost:8080/ok в браузере.
4. Нажать F12, зайти в Console.
5. Ввести fetch('/ok',{method:'POST', headers: {'Content-Type':'application/json'}, body: JSON.stringify({"messageId": 1138, "messageFrom": "Fenn Shysa", "messageTo": "Boba Fett", "messageBody": "Su'cuy gar!"})}).then(console.log)
6. Нажать Enter.
7. В сообщении также можно заменять method на PUT. В JSON-объекте можно заменить данные любых полей на любые другие.
